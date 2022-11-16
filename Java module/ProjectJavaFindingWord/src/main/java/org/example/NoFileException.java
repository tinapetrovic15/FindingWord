package org.example;


public class NoFileException extends Exception {

    public NoFileException() {
        super("Ne postoji fajl sa ovim nazivom");
    }
}
