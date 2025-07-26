package com.biruk.glow;

public class Glow {
    public static String parse(String text){
        return ParseResult.parseRecursive(text, 0).result;
    }

    public static void print(String text){
        System.out.print(parse(text));
    }

    public static void println(String text){
        System.out.println(parse(text));
    }

    public static void print(String text, String style){
        print("[" + style + "]" + text + "[/]");
    }

    public static void println(String text, String style){
        println("[" + style + "]" + text + "[/]");
    }
}
