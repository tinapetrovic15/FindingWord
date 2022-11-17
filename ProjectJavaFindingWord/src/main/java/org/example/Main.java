package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NoFileException {
        Solution solution = new Solution();
        File fileInput = new File("input.txt");
        solution.readingFromFile(fileInput);
    }
}