package org.example;

import java.io.*;

public class Solution {
    Balloon balloon = new Balloon();
    FindingWordByList findingWordByList = new FindingWordByList();
    FindingWordByHashMap findingWordByHashMap = new FindingWordByHashMap();
    public Solution(){

    }
    public Solution(Balloon b) {
        this.balloon = b;
        findingWordByList = new FindingWordByList();
        findingWordByHashMap = new FindingWordByHashMap();
    }
    public Solution(FindingWordByHashMap findingWordByHashMap) {
        this.findingWordByHashMap = findingWordByHashMap;
        balloon = new Balloon();
        findingWordByList = new FindingWordByList();
    }
    public Solution(FindingWordByList findingWordByList) {
        this.findingWordByList = findingWordByList;
        balloon = new Balloon();
        findingWordByHashMap = new FindingWordByHashMap();
        findingWordByHashMap = new FindingWordByHashMap();
    }
    public void readingFromFile(File fileInput)  throws IOException, NoFileException{
        FileWriter fileOutput = new FileWriter("output.txt");
        if(!fileInput.isFile()) throw new NoFileException();
        BufferedReader br = new BufferedReader(new FileReader(fileInput));
        String word = br.readLine();
        String input;
        while ((input = br.readLine()) != null) {

            System.out.println("The word BALLOON is contained " + balloon.findingBalloon(input) + "  times in the word " + input);
            fileOutput.write("The word BALLOON is contained " + balloon.findingBalloon(input) + "  times in the word " + input + "\n");
            try {
                System.out.println("The word " + word + " is contained " + findingWordByList.findingWord(input, word) + "  times in the word " + input);
                fileOutput.write("The word " + word + " is contained " + findingWordByList.findingWord(input, word) + "  times in the word " + input + "\n");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("The word " + word + " is contained " + findingWordByHashMap.findingWord(input, word) + "  times in the word " + input);
            fileOutput.write("The word " + word + " is contained " + findingWordByHashMap.findingWord(input, word) + "  times in the word " + input + "\n");
        }
        fileOutput.close();
    }
}
