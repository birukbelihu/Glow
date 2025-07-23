package com.biruk.glow;

public class ParseResult {
    String result;
    int nextIndex;

    public ParseResult(String result, int nextIndex){
        this.result = result;
        this.nextIndex = nextIndex;
    }

    public static ParseResult parseRecursive(@org.jetbrains.annotations.NotNull String input, int start) {
        StringBuilder output = new StringBuilder();
        int i = start;

        while (i < input.length()) {
            if (input.startsWith("[/", i)) {
                int end = input.indexOf("]", i);
                if (end == -1) break;
                return new ParseResult(output.toString(), end + 1);
            }

            if (input.charAt(i) == '[') {
                int end = input.indexOf("]", i);
                if (end == -1) break;

                String tagString = input.substring(i + 1, end).trim();
                String[] tags = tagString.split("\\s+");

                StringBuilder ansi = new StringBuilder();
                for (String tag : tags) {
                    tag = tag.toLowerCase();
                    if (ColorsMapping.containsForeColor(tag)) ansi.append(ColorsMapping.getForeColor(tag));
                    else if (ColorsMapping.containsBackgroundColor(tag)) ansi.append(ColorsMapping.getBackgroundColor(tag));
                    else if (ColorsMapping.containsStyle(tag)) ansi.append(ColorsMapping.getStyle(tag));
                }

                ParseResult inner = parseRecursive(input, end + 1);
                output.append(ansi).append(inner.result).append(ColorsMapping.ANSI_RESET);

                i = inner.nextIndex;
            } else {
                output.append(input.charAt(i));
                i++;
            }
        }

        return new ParseResult(output.toString(), i);
    }
}
