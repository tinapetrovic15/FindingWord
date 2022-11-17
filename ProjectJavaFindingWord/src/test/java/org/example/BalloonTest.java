package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BalloonTest {
//    @Mock
//    Balloon balloonMock = Mockito.mock(Balloon.class);

    @Test
    void findingBalloon() throws IOException, NoFileException {
//        assertNotNull(balloonMock);
//        when(balloonMock.findingBalloon("BAOOLLNNOLOLGBAX")).thenReturn(2);
        Balloon balloon = new Balloon();
        assertEquals(2,balloon.findingBalloon("BAOOLLNNOLOLGBAX"),"The method in Balloon class doesn't give the expected results");
//        Solution s = new Solution(balloonMock);
//        s.readingFromFile(new File("input.txt"));
    }
}