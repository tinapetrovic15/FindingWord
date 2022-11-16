package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NoFileException{

            File fileInput = new File("input.txt");
            FileWriter fileOutput = new FileWriter("output.txt");
            if(!fileInput.isFile()) throw new NoFileException();
                BufferedReader br = new BufferedReader(new FileReader(fileInput));
                findingWordByList FindingWordByList = new findingWordByList();
                String word = br.readLine();
                String S;
                while ((S = br.readLine()) != null) {

                    System.out.println("The word BALLOON is contained " + Balloon.findingBalloon(S) + "  times in the word " + S);
                    fileOutput.write("The word BALLOON is contained " + Balloon.findingBalloon(S) + "  times in the word " + S + "\n");
                    try {
                        System.out.println("The word " + word + " is contained " + FindingWordByList.findingWord(S, word) + "  times in the word " + S);
                        fileOutput.write("The word " + word + " is contained " + FindingWordByList.findingWord(S, word) + "  times in the word " + S + "\n");
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("The word " + word + " is contained " + findingWordByHashMap.findingWord(S, word) + "  times in the word " + S);
                    fileOutput.write("The word " + word + " is contained " + findingWordByHashMap.findingWord(S, word) + "  times in the word " + S + "\n");
                }
                fileOutput.close();
    }
}