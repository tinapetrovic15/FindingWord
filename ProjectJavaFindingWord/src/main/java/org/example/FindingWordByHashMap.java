package org.example;

import java.util.HashMap;

public class FindingWordByHashMap {

    public int findingWord(String input, String word){
        int numberOfAppearances = 0;
        HashMap<Character, Integer> wordChar = new HashMap<>();
        HashMap<Character, Integer> inputChar = new HashMap<>();

        for(int i = 0; i < word.length(); i++) {
            Character j = word.charAt(i);
            if(wordChar.containsKey(j)){
                wordChar.replace(j,wordChar.get(j)+1);
            }
            else {
                wordChar.put(j,1);
            }
        }
        for(int i=0;i<input.length();i++){
            Character letter = input.charAt(i);
            if(wordChar.containsKey(letter)) {

                if(inputChar.containsKey(letter)){
                    inputChar.replace(letter,inputChar.get(letter)+1);
                }
                else {
                    inputChar.put(letter,1);
                }
            }
        }
        Boolean firstIteration = true;
        for (Character key : wordChar.keySet()) {
            if(firstIteration.booleanValue()) {
                if(inputChar.containsKey(key))
                    numberOfAppearances = inputChar.get(key) / wordChar.get(key);
                else numberOfAppearances = 0;
                firstIteration = false;
            }
             else {
                if(inputChar.containsKey(key))
                        numberOfAppearances = Math.min(numberOfAppearances, inputChar.get(key) / wordChar.get(key));
                else numberOfAppearances = Math.min(numberOfAppearances, 0);
            }
        }


        return numberOfAppearances;
    }

}
