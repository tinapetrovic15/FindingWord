package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingWordByListTest {


    @Test
    void firstTest() throws Exception {
         FindingWordByList findingWordByList = new FindingWordByList();
         assertEquals(2,findingWordByList.findingWord("BAOOLLNNOLOLGBAX","BALLOON"));
    }

}