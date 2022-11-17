package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExeptionTest {

    @Test
    void noIndexExeption() {
        var findingWordByList = new FindingWordByList();
        NoIndexExeption thrown = Assertions
                .assertThrows(NoIndexExeption.class,
                        ()-> {
                            findingWordByList.findingWord("ČičakJedančičakdva","Čičak");
                        });
        Assertions.assertEquals("Ne postoji element u listi sa ovim indeksom",thrown.getMessage());
    }
    @Test
    void nonexistentFile() {
        Solution s = new Solution();
        assertThrows(NoFileException.class,
                ()-> {
                    s.readingFromFile(new File("dkxvkdvk"));
                });
    }
}
