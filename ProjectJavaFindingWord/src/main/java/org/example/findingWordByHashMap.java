package org.example;

import java.util.HashMap;

public class findingWordByHashMap {

    public static int findingWord(String S, String word){
        int numberOfAppearances = 0;
        HashMap<Character, Integer> wordChar = new HashMap<>();
        HashMap<Character, Integer> SChar = new HashMap<>();

        for(int i=0;i<word.length();i++) {
            Character j = word.charAt(i);
            if(wordChar.containsKey(j)){
                wordChar.replace(j,wordChar.get(j)+1);
            }
            else {
                wordChar.put(j,1);
            }
        }
        for(int i=0;i<S.length();i++){
            Character j = S.charAt(i);
            if(wordChar.containsKey(j)) {

                if(SChar.containsKey(j)){
                    SChar.replace(j,SChar.get(j)+1);
                }
                else {
                    SChar.put(j,1);
                }
            }
        }
        Boolean firstIteration = true;
        for (Character key : SChar.keySet()) {
            if(firstIteration) {
                numberOfAppearances = SChar.get(key) / wordChar.get(key);
            }
             else {
                numberOfAppearances = Math.min(numberOfAppearances, SChar.get(key) / wordChar.get(key));
            }
        }


        return numberOfAppearances;
    }

}
