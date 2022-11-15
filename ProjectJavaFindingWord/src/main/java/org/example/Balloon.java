package org.example;

public class Balloon {

    public static int findingBalloon(String S){
        wordBallon ballon = new wordBallon();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='B') ballon.b++;
            else if(S.charAt(i)=='A') ballon.a++;
                else if(S.charAt(i)=='L') ballon.l++;
                    else if(S.charAt(i)=='O') ballon.o++;
                        else if(S.charAt(i)=='N') ballon.n++;
        }
        int numberOfAppearances = Math.min(Math.min(2*Math.min(ballon.b,Math.min(ballon.a,ballon.n)),ballon.l),ballon.o)/2;
        return numberOfAppearances;
    }
}
class wordBallon {
    public Integer b = 0;
    public Integer a = 0;
    public Integer l = 0;
    public Integer o = 0;
    public Integer n = 0;


}
