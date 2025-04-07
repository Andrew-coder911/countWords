package com.andrew;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class CountWordsUtil {

    private static char[] convertToCharArray(Path path) throws IOException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            while (reader.readLine() != null)
            result.append(reader.readLine());
        }
        return result.toString().toCharArray();
    }

    public static Map<Character, Integer> countWords(Path path) throws IOException {
        Map<Character, Integer> countMap = new TreeMap<>();
        char[] chars = convertToCharArray(path);
        for (char c : chars) {
            if (c >= 'а' && c <= 'я') {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
        }
        return countMap;
    }
}
