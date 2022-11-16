package org.example;

import java.io.IOException;

public class NoFileException extends Exception {

    public NoFileException() {
        super("Ne postoji fajl sa ovim nazivom");
    }
}
