package com.andrew;

import java.io.IOException;
import java.nio.file.Path;

public class CountWordsRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "text.txt");
        System.out.println(CountWordsUtil.countWords(path));
    }
}
