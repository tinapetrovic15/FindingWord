package org.example;

public class Balloon {

    public int findingBalloon(String input){
        WordBalloon ballon = new WordBalloon();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='B') ballon.b++;
            else if(input.charAt(i)=='A') ballon.a++;
                else if(input.charAt(i)=='L') ballon.l++;
                    else if(input.charAt(i)=='O') ballon.o++;
                        else if(input.charAt(i)=='N') ballon.n++;
        }
        return Math.min(Math.min(2*Math.min(ballon.b,Math.min(ballon.a,ballon.n)),ballon.l),ballon.o)/2;
    }
}
