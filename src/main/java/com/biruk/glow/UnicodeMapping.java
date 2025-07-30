package com.biruk.glow;

import java.util.Map;

public class UnicodeMapping {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final Map<String, String> FOREGROUND_COLORS = Map.ofEntries(
            Map.entry("black", "\u001B[30m"),
            Map.entry("red", "\u001B[31m"),
            Map.entry("green", "\u001B[32m"),
            Map.entry("yellow", "\u001B[33m"),
            Map.entry("blue", "\u001B[34m"),
            Map.entry("purple", "\\u001B[35m"),
            Map.entry("magenta", "\u001B[35m"),
            Map.entry("cyan", "\u001B[36m"),
            Map.entry("white", "\u001B[37m")
    );

    public static final Map<String, String> BACKGROUND_COLORS = Map.ofEntries(
            Map.entry("bg-black", "\u001B[40m"),
            Map.entry("bg-red", "\u001B[41m"),
            Map.entry("bg-green", "\u001B[42m"),
            Map.entry("bg-yellow", "\u001B[43m"),
            Map.entry("bg-blue", "\u001B[44m"),
            Map.entry("bg-purple", "\\u001B[45m"),
            Map.entry("bg-magenta", "\u001B[45m"),
            Map.entry("bg-cyan", "\u001B[46m"),
            Map.entry("bg-white", "\u001B[47m")
    );

    public static final Map<String, String> STYLES = Map.ofEntries(
            Map.entry("bold", "\u001B[1m"),
            Map.entry("dim", "\u001B[2m"),
            Map.entry("italic", "\u001B[3m"),
            Map.entry("underline", "\u001B[4m")
    );

    public static String getForeColor(String foregroundColor){
        return FOREGROUND_COLORS.get(foregroundColor);
    }

    public static String getBackgroundColor(String backgroundColor){
        return BACKGROUND_COLORS.get(backgroundColor);
    }

    public static String getStyle(String style){
        return STYLES.get(style);
    }

    public static boolean containsForeColor(String foregroundColor){
        return FOREGROUND_COLORS.containsKey(foregroundColor);
    }

    public static boolean containsBackgroundColor(String backgroundColor){
        return BACKGROUND_COLORS.containsKey(backgroundColor);
    }

    public static boolean containsStyle(String style){
        return STYLES.containsKey(style);
    }
}
