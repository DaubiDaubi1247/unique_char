package ru.alex;

import java.util.HashMap;
import java.util.Map;

public class App 
{
    private static final int COUNT_REPEATS_FOR_UNIQUE = 1;
    private static final char END_OF_STRING = '\0';

    public static void main( String[] args ){
        System.out.println(getFirstUniqueChar("2331"));
    }

    public static Character getFirstUniqueChar(String str) {
        Map<Character, Integer> symbolCounts = new HashMap<>();

        initHashMapFromStr(str, symbolCounts);

        return getFirstUniqueSymbol(str, symbolCounts);
    }

    private static char getFirstUniqueSymbol(String str, Map<Character, Integer> symbolCounts) {

        for (int i = 0; i < str.length(); i++) {
            int countRepeats = symbolCounts.get(str.charAt(i));
            if (countRepeats == COUNT_REPEATS_FOR_UNIQUE) {
                return str.charAt(i);
            }
        }

        return END_OF_STRING;
    }

    private static void initHashMapFromStr(String str, Map<Character, Integer> symbolCounts) {
        for (int i = 0; i < str.length(); i++) {
            symbolCounts.merge(str.charAt(i), 1, Integer::sum);
        }
    }
}
