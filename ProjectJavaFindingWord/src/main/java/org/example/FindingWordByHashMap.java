package org.example;

import java.util.HashMap;

public class FindingWordByHashMap {

    public int findingWord(String input, String word){
        int numberOfAppearances = 0;
        HashMap<Character, Integer> wordChar = new HashMap<>();
        HashMap<Character, Integer> inputChar = new HashMap<>();

        for(int i=0;i<word.length();i++) {
            Character j = word.charAt(i);
            if(wordChar.containsKey(j)){
                wordChar.replace(j,wordChar.get(j)+1);
            }
            else {
                wordChar.put(j,1);
            }
        }
        for(int i=0;i<input.length();i++){
            Character j = input.charAt(i);
            if(wordChar.containsKey(j)) {

                if(inputChar.containsKey(j)){
                    inputChar.replace(j,inputChar.get(j)+1);
                }
                else {
                    inputChar.put(j,1);
                }
            }
        }
        Boolean firstIteration = true;
        for (Character key : inputChar.keySet()) {
            if(firstIteration.booleanValue()) {
                numberOfAppearances = inputChar.get(key) / wordChar.get(key);
                firstIteration = false;
            }
             else {
                numberOfAppearances = Math.min(numberOfAppearances, inputChar.get(key) / wordChar.get(key));
            }
        }


        return numberOfAppearances;
    }

}
