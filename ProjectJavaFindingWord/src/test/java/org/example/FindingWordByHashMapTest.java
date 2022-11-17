package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingWordByHashMapTest {

    @Test
    void findingWord() {
        var findingWordByHashMap = new FindingWordByHashMap();
        assertEquals(2,findingWordByHashMap.findingWord("BAOOLLNNOLOLGBAX","BALLOON"),"The method in FindingWordByHashMap class doesn't give the expected results");

    }
}