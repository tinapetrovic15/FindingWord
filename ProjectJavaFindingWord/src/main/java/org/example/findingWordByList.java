package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class findingWordByList {

    public static int findingWord(String S, String word){
        word = word.toUpperCase();
        S = S.toUpperCase();
        int numberOfAppearances = 0;
        List<Integer> alphabete = new ArrayList<Integer>();
        List<Integer> alphabeteWord = new ArrayList<Integer>();

        for(int i=0;i<26;i++) {
            alphabete.add(0);
            alphabeteWord.add(0);
        }

        for(int i=0;i<word.length();i++) {
            int j = word.charAt(i) - 'A';
            alphabete.set(j,alphabete.get(j)+1);
        }

        for(int i=0;i<S.length();i++) {

            int j = S.charAt(i) - 'A';

            if (alphabete.get(j) != 0) {
                alphabeteWord.set(j, alphabeteWord.get(j) + 1);
            }
        }

        for(int i=0;i<26;i++)
        {
            int temp = alphabete.get(i);
            if(temp!=0)
            {
                int number = alphabeteWord.get(i);
                alphabeteWord.set(i,number/temp);
            }
            else alphabeteWord.set(i,-1);
        }
        Boolean firstIntteration = true;
        for(int i=0;i<26;i++)
        {
            if(alphabeteWord.get(i)!=-1){
                if (firstIntteration)
                    numberOfAppearances = alphabeteWord.get(i);
                else numberOfAppearances = Math.min(numberOfAppearances,alphabeteWord.get(i));
                }
        }
        return numberOfAppearances;
    }
}
