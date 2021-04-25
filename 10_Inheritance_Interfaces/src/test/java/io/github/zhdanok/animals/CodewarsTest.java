package io.github.zhdanok.animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class CodewarsTest {

    Codewars codewars;

    @BeforeEach
    void  setUp() {
        codewars = new Codewars();

    }

    @Test
    void meeting() {
        String s = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";
        String actual = codewars.meeting(s);
        String expected = "(ARNO, ANN)(BELL, JOHN)(CORNWELL, ALEX)(DORNY, ABBA)(KERN, LEWIS)(KORN, ALEX)(META, GRACE)(SCHWARZ, VICTORIA)(STAN, MADISON)(STAN, MEGAN)(WAHL, ALEXIS)";
        assertEquals(expected,actual);
    }

}