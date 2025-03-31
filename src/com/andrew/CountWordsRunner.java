package com.andrew;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class CountWordsRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "text.txt");
        Path newPath = Path.of("resources", "countedWords.txt");
        Map<Character, Integer> result = CountWordsUtil.countWords(path);
        Files.writeString(newPath, result.toString());
    }
}
