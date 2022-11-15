package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String S = br.readLine();
        String word = br.readLine();

        System.out.println("The word BALLOON is contained "+Balloon.findingBalloon(S)+"  times in the word "+S);
        System.out.println("The word "+ word +" is contained "+findingWordByList.findingWord(S,word)+"  times in the word "+S);
        System.out.println("The word "+ word +" is contained "+findingWordByHashMap.findingWord(S,word)+"  times in the word "+S);
    }
}