package com.biruk.glow;

public class Glow {
    public static String parse(String input){
        return ParseResult.parseRecursive(input, 0).result;
    }

    public static void print(String input){
        System.out.print(parse(input));
    }

    public static void println(String input){
        System.out.println(parse(input));
    }
}
