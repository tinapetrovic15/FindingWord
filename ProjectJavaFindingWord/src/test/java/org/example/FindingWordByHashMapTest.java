package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.lenient;

@ExtendWith(MockitoExtension.class)
class FindingWordByHashMapTest {

    @Mock
    FindingWordByHashMap findingWordByHashMap;
    @InjectMocks
    Solution solution = new Solution();

    @Test
    void findingWord() throws IOException, NoFileException {

        lenient().when(findingWordByHashMap.findingWord("BAOOLLNNOLOLGBAX","BALLOON")).thenReturn(2);
        lenient().when(findingWordByHashMap.findingWord("ONLABLABLOON","BALLOON")).thenReturn(1);
        lenient().when(findingWordByHashMap.findingWord("QAWABAWONL","BALLOON")).thenReturn(0);
        lenient().when(findingWordByHashMap.findingWord("BAONXXOLL","BALLOON")).thenReturn(1);
        solution.readingFromFile(new File("input.txt"));
        int numOfLine = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("output.txt"));
            while (scanner.hasNext()) {
                String text = scanner.nextLine();
                numOfLine++;
                if(numOfLine%12==0){
                        assertEquals("The word BALLOON is contained 1  times in the word ONLABLABLOON",text);
                }
                else if(numOfLine%9==0){
                    assertEquals("The word BALLOON is contained 0  times in the word QAWABAWONL",text);
                }
                else if(numOfLine%6==0) {
                    assertEquals("The word BALLOON is contained 1  times in the word BAONXXOLL",text);

                }
                else if(numOfLine%3==0){
                    assertEquals("The word BALLOON is contained 2  times in the word BAOOLLNNOLOLGBAX",text);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}