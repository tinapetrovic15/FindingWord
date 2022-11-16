package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NoFileException{

            File fileInput = new File("input.txt");
            FileWriter fileOutput = new FileWriter("output.txt");
            if(!fileInput.isFile()) throw new NoFileException();
                BufferedReader br = new BufferedReader(new FileReader(fileInput));
                FindingWordByList findingWordByList = new FindingWordByList();
                String word = br.readLine();
                String input;
                while ((input = br.readLine()) != null) {

                    System.out.println("The word BALLOON is contained " + Balloon.findingBalloon(input) + "  times in the word " + input);
                    fileOutput.write("The word BALLOON is contained " + Balloon.findingBalloon(input) + "  times in the word " + input + "\n");
                    try {
                        System.out.println("The word " + word + " is contained " + findingWordByList.findingWord(input, word) + "  times in the word " + input);
                        fileOutput.write("The word " + word + " is contained " + findingWordByList.findingWord(input, word) + "  times in the word " + input + "\n");
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("The word " + word + " is contained " + FindingWordByHashMap.findingWord(input, word) + "  times in the word " + input);
                    fileOutput.write("The word " + word + " is contained " + FindingWordByHashMap.findingWord(input, word) + "  times in the word " + input + "\n");
                }
                fileOutput.close();
    }
}