package org.example;

public class NoIndexExeption extends RuntimeException{
    public NoIndexExeption() {
        super("Ne postoji element u listi sa ovim indeksom");
    }
}
