package io.github.zhdanok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;

import static io.github.zhdanok.Labyrinth.gamePlace;
import static org.junit.jupiter.api.Assertions.*;

class LabyrinthTest {

    @Spy
    Labyrinth labyrinth;

    @BeforeEach
    void setUp() {
        labyrinth = new Labyrinth();
    }

    @Test
    void print() {
        labyrinth.printTheGamePlace();
    }

    @Test
    void choseMove() {
        labyrinth.printTheGamePlace();
        labyrinth.chooseMove();
        labyrinth.printTheGamePlace();
    }
}