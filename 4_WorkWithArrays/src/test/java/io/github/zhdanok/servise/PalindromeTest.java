package io.github.zhdanok.servise;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Logger logger = LoggerFactory.getLogger(PalindromeTest.class);

    @Test
    void isPalindrome_positive() {
        String str = "le$v el";
        logger.info(str);
        Boolean actualeResult = Palindrome.isPalindrome(str);
        Boolean expectedResult = true;
        assertEquals(expectedResult, actualeResult);
        logger.info("{} is palindrome", str);
    }

    @Test
    void isPalindrome_negative() {
        String str = "le$v elm";
        logger.info(str);
        Boolean actualeResult = Palindrome.isPalindrome(str);
        Boolean expectedResult = true;
        assertNotEquals(expectedResult, actualeResult);
        logger.info("{} is not palindrome", str);
    }


}