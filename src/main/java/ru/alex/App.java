package ru.alex;

import java.util.HashMap;
import java.util.Map;

public class App 
{
    private static final int UNIQUE_COUNT_REPEATS = 1;

    public static void main( String[] args ){
        System.out.println(getFirstUniqueChar("22331"));
    }

    public static Character getFirstUniqueChar(String str) {
        Map<Character, Integer> symbolCounts = new HashMap<>();

        initHashMapFromStr(str, symbolCounts);

        return getFirstUniqueSymbol(str, symbolCounts);
    }

    private static char getFirstUniqueSymbol(String str, Map<Character, Integer> symbolCounts) {
        char firstUniqueSymbol = '\0';

        for (int i = 0; i < str.length(); i++) {
            int countRepeats = symbolCounts.get(str.charAt(i));
            if (countRepeats == UNIQUE_COUNT_REPEATS) {
                firstUniqueSymbol = str.charAt(i);
                break;
            }
        }

        return firstUniqueSymbol;
    }

    private static void initHashMapFromStr(String str, Map<Character, Integer> symbolCounts) {
        for (int i = 0; i < str.length(); i++) {
            int countRepeats = symbolCounts.getOrDefault(str.charAt(i), 0);
            symbolCounts.put(str.charAt(i), countRepeats + 1);
        }
    }
}
