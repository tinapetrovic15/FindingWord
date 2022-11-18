package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void usingexistingFile() {
        File file = new File("input.txt");
        assertTrue(file.exists());
    }
}