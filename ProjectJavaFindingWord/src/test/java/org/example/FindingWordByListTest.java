package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingWordByListTest {

    @Test
    void findingWord() throws Exception {
        var findingWordByList = new FindingWordByList();
        assertEquals(2,findingWordByList.findingWord("BAOOLLNNOLOLGBAX","BALLOON"),"The method in FindingWordByList class doesn't give the expected results");

    }
}