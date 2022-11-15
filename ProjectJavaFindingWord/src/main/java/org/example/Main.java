package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File fileInput = new File("input.txt");
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedReader br = new BufferedReader(new FileReader(fileInput));

        String word = br.readLine();
        String S;
        while ((S = br.readLine()) != null) {

            System.out.println("The word BALLOON is contained " + Balloon.findingBalloon(S) + "  times in the word " + S);
            fileOutput.write("The word BALLOON is contained " + Balloon.findingBalloon(S) + "  times in the word " + S+"\n");
            System.out.println("The word " + word + " is contained " + findingWordByList.findingWord(S, word) + "  times in the word " + S);
            fileOutput.write("The word " + word + " is contained " + findingWordByList.findingWord(S, word) + "  times in the word " + S+"\n");
            System.out.println("The word " + word + " is contained " + findingWordByHashMap.findingWord(S, word) + "  times in the word " + S);
            fileOutput.write("The word " + word + " is contained " + findingWordByHashMap.findingWord(S, word) + "  times in the word " + S+"\n");
        }
        fileOutput.close();
    }
}