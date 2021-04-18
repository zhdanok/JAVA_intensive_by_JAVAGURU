package io.github.zhdanok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

import static io.github.zhdanok.Labyrinth.indexI;
import static io.github.zhdanok.Labyrinth.indexJ;
import static org.junit.jupiter.api.Assertions.*;


class LabyrinthTest {

    @Spy
    Labyrinth labyrinth;


    @BeforeEach
    void setUp() {
        labyrinth = new Labyrinth();
    }

    @Test
    void startTheGame() {
        indexI = 9;
        indexJ = 5;
        assertFalse(labyrinth.isFinish());
        indexI = 9;
        indexJ = 9;
        assertTrue(labyrinth.isFinish());
        indexI = 0;
        indexJ = 9;
        assertFalse(labyrinth.isFinish());
    }






}