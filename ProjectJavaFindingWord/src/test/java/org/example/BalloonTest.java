package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BalloonTest {
    @Mock
    Balloon balloon;
    @InjectMocks
    Solution solution = new Solution();

    @Test
    void findingBalloon() throws IOException, NoFileException {
    lenient().when(balloon.findingBalloon("BAOOLLNNOLOLGBAX")).thenReturn(2);
    lenient().when(balloon.findingBalloon("ONLABLABLOON")).thenReturn(1);
    lenient().when(balloon.findingBalloon("QAWABAWONL")).thenReturn(0);
    lenient().when(balloon.findingBalloon("BAONXXOLL")).thenReturn(1);
        solution.readingFromFile(new File("input.txt"));
    int numOfLine = 0;
    Scanner scanner = null;
        try {
        scanner = new Scanner(new File("output.txt"));
        while (scanner.hasNext()) {
            String text = scanner.nextLine();
            numOfLine++;
            if(numOfLine==10){
                assertEquals("The word BALLOON is contained 1  times in the word ONLABLABLOON",text);
            }
            else if(numOfLine==7){
                assertEquals("The word BALLOON is contained 0  times in the word QAWABAWONL",text);
            }
            else if(numOfLine==4) {
                assertEquals("The word BALLOON is contained 1  times in the word BAONXXOLL",text);

            }
            else if(numOfLine==1){
                assertEquals("The word BALLOON is contained 2  times in the word BAOOLLNNOLOLGBAX",text);
            }
        }
    } catch (
    FileNotFoundException e) {
        e.printStackTrace();
    } finally {
        if (scanner != null) {
            scanner.close();
        }
    }

}
}