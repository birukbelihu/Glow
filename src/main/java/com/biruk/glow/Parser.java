package com.biruk.glow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

public class Parser {
    String result;
    int nextIndex;

    public Parser(String result, int nextIndex){
        this.result = result;
        this.nextIndex = nextIndex;
    }

    @NotNull
    public static Parser parseRecursive(@NotNull String input, int start) {
        StringBuilder output = new StringBuilder();
        int i = start;

        Pattern rgbPattern = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        Pattern hexPattern = Pattern.compile("^hex\\(#([A-Fa-f0-9]{6})\\)$");

        while (i < input.length()) {
            if (input.startsWith("[/", i)) {
                int end = input.indexOf("]", i);
                if (end == -1) break;
                return new Parser(output.toString(), end + 1);
            }

            if (input.charAt(i) == '[') {
                int end = input.indexOf("]", i);
                if (end == -1) break;

                String tagString = input.substring(i + 1, end).trim();
                String[] tags = tagString.split("\\s+");

                StringBuilder ansi = new StringBuilder();
                for (String tag : tags) {
                    tag = tag.toLowerCase();

                    Matcher rgbMatcher = rgbPattern.matcher(tag);
                    Matcher hexMatcher = hexPattern.matcher(tag);

                    if (rgbMatcher.matches()) {
                        int r = Integer.parseInt(rgbMatcher.group(1));
                        int g = Integer.parseInt(rgbMatcher.group(2));
                        int b = Integer.parseInt(rgbMatcher.group(3));
                        ansi.append("\u001b[38;2;").append(r).append(";").append(g).append(";").append(b).append("m");
                    } else if (hexMatcher.matches()) {
                        String hex = hexMatcher.group(1);
                        int r = Integer.parseInt(hex.substring(0, 2), 16);
                        int g = Integer.parseInt(hex.substring(2, 4), 16);
                        int b = Integer.parseInt(hex.substring(4, 6), 16);
                        ansi.append("\u001b[38;2;").append(r).append(";").append(g).append(";").append(b).append("m");
                    } else if (Mapping.containsForegroundColor(tag)) {
                        ansi.append(Mapping.getForegroundColor(tag));
                    } else if (Mapping.containsBackgroundColor(tag)) {
                        ansi.append(Mapping.getBackgroundColor(tag));
                    } else if (Mapping.containsStyle(tag)) {
                        ansi.append(Mapping.getStyle(tag));
                    }
                }

                Parser inner = parseRecursive(input, end + 1);
                output.append(ansi).append(inner.result).append(Mapping.ANSI_RESET);

                i = inner.nextIndex;
            } else {
                output.append(input.charAt(i));
                i++;
            }
        }

        return new Parser(output.toString(), i);
    }
}