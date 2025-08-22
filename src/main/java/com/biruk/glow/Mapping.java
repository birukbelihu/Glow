package com.biruk.glow;

import java.util.Map;

public class Mapping {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final Map<String, String> FOREGROUND_COLORS = Map.ofEntries(
            Map.entry("black", "\u001B[30m"),
            Map.entry("red", "\u001B[31m"),
            Map.entry("green", "\u001B[32m"),
            Map.entry("yellow", "\u001B[33m"),
            Map.entry("blue", "\u001B[34m"),
            Map.entry("magenta", "\u001B[35m"),
            Map.entry("cyan", "\u001B[36m"),
            Map.entry("white", "\u001B[37m"),
            Map.entry("bright-black", "\u001B[90m"),
            Map.entry("bright-red", "\u001B[91m"),
            Map.entry("bright-green", "\u001B[92m"),
            Map.entry("bright-yellow", "\u001B[93m"),
            Map.entry("bright-blue", "\u001B[94m"),
            Map.entry("bright-magenta", "\u001B[95m"),
            Map.entry("bright-cyan", "\u001B[96m"),
            Map.entry("bright-white", "\u001B[97m")
    );

    public static final Map<String, String> BACKGROUND_COLORS = Map.ofEntries(
            Map.entry("bg-black", "\u001B[40m"),
            Map.entry("bg-red", "\u001B[41m"),
            Map.entry("bg-green", "\u001B[42m"),
            Map.entry("bg-yellow", "\u001B[43m"),
            Map.entry("bg-blue", "\u001B[44m"),
            Map.entry("bg-magenta", "\u001B[45m"),
            Map.entry("bg-cyan", "\u001B[46m"),
            Map.entry("bg-white", "\u001B[47m"),
            Map.entry("bg-bright-black", "\u001B[100m"),
            Map.entry("bg-bright-red", "\u001B[101m"),
            Map.entry("bg-bright-green", "\u001B[102m"),
            Map.entry("bg-bright-yellow", "\u001B[103m"),
            Map.entry("bg-bright-blue", "\u001B[104m"),
            Map.entry("bg-bright-magenta", "\u001B[105m"),
            Map.entry("bg-bright-cyan", "\u001B[106m"),
            Map.entry("bg-bright-white", "\u001B[107m")
    );

    public static final Map<String, String> STYLES = Map.ofEntries(
            Map.entry("bold", "\u001B[1m"),
            Map.entry("dim", "\u001B[2m"),
            Map.entry("italic", "\u001B[3m"),
            Map.entry("underline", "\u001B[4m"),
            Map.entry("blink", "\u001B[5m"),
            Map.entry("reverse", "\u001B[7m"),
            Map.entry("hidden", "\u001B[8m"),
            Map.entry("strike", "\u001B[9m")
    );

    public static String getForegroundColor(String foregroundColor) {
        return FOREGROUND_COLORS.get(foregroundColor);
    }

    public static String getBackgroundColor(String backgroundColor) {
        return BACKGROUND_COLORS.get(backgroundColor);
    }

    public static String getStyle(String style) {
        return STYLES.get(style);
    }

    public static boolean containsForegroundColor(String foregroundColor) {
        return FOREGROUND_COLORS.containsKey(foregroundColor);
    }

    public static boolean containsBackgroundColor(String backgroundColor) {
        return BACKGROUND_COLORS.containsKey(backgroundColor);
    }

    public static boolean containsStyle(String style) {
        return STYLES.containsKey(style);
    }
}
