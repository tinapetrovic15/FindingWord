package org.example;


import java.util.ArrayList;
import java.util.List;

public class FindingWordByList {

    public int findingWord(String input, String word) throws Exception {
        word = word.toUpperCase();
        input = input.toUpperCase();
        int numberOfAppearances = 0;
        List<Integer> alphabete = new ArrayList<>();
        List<Integer> alphabeteWord = new ArrayList<>();

        for(int i=0;i<26;i++) {
            alphabete.add(0);
            alphabeteWord.add(0);
        }
        try {
            alphabete = coutingLetters(word,alphabete);
            alphabeteWord = coutingLettersInS(input,alphabete,alphabeteWord);
            alphabeteWord = scalingOfTheNumberOfCharactersByWord(alphabete,alphabeteWord);

            numberOfAppearances = findingMinNumberOfAppearances(alphabeteWord);
            return numberOfAppearances;

        }
        catch (NoIndexExeption e){
            e.printStackTrace();
        }
        throw new Exception();
    }

    private List<Integer> scalingOfTheNumberOfCharactersByWord(List<Integer> alphabete, List<Integer> alphabeteWord) {
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
        return alphabeteWord;
    }

    private int findingMinNumberOfAppearances(List<Integer> alphabeteWord) {
        int numberOfAppearances = 0;
        Boolean firstIteration = true;
        for(int i=0;i<26;i++)
        {
            if(alphabeteWord.get(i)!=-1){
                if (firstIteration.booleanValue()) {
                    numberOfAppearances = alphabeteWord.get(i);
                    firstIteration = false;
                }
                else numberOfAppearances = Math.min(numberOfAppearances,alphabeteWord.get(i));
            }
        }
        return numberOfAppearances;
    }

    private List<Integer> coutingLettersInS(String input, List<Integer> alphabete, List<Integer> alphabeteWord){
        for(int i=0;i<input.length();i++) {
                int j = input.charAt(i) - 'A';
                if(j>alphabete.size()-1) throw new NoIndexExeption();
                if (alphabete.get(j) != 0) {
                    alphabeteWord.set(j, alphabeteWord.get(j) + 1);
            }
        }
        return alphabeteWord;
    }

    private List<Integer> coutingLetters(String word, List<Integer> alphabete){

            for(int i=0;i<word.length();i++) {

                    int j = word.charAt(i) - 'A';
                    if(j>alphabete.size()-1) throw new NoIndexExeption();
                    alphabete.set(j,alphabete.get(j)+1);

            }
            return alphabete;
    }
}
