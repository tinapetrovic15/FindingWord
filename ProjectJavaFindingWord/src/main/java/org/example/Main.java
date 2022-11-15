package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        String S = Scn.nextLine();
        String word = Scn.nextLine();
        System.out.println("The word balloon is contained "+Balloon.findingBalloon(S)+"  times in the word"+S);
        System.out.println("The word "+ word +" is contained "+findingWordByList.findingWord(S,word)+"  times in the word "+S);
        System.out.println("The word "+ word +" is contained "+findingWordByHashMap.findingWord(S,word)+"  times in the word "+S);
    }
}