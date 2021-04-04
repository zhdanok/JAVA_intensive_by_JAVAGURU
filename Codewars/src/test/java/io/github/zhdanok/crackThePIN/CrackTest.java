package io.github.zhdanok.crackThePIN;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CrackTest {


    Crack crack;

    @BeforeEach
    void setUp() {
        crack = new Crack();
    }

    @Test
    void crackThePIN() {
        String hashMD5 = "86aa400b65433b608a9db30070ec60cd";
        String PIN = crack.crackThePIN(hashMD5);
        String expected = "00078";
        assertEquals(expected, PIN);
    }

    @Test
    void crackThePIN2() {
        String hashMD5 = "827ccb0eea8a706c4c34a16891f84e7b";
        String PIN = crack.crackThePIN(hashMD5);
        String expected = "12345";
        assertEquals(expected, PIN);
    }
}