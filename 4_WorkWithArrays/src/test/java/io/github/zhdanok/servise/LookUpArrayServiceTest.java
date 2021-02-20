package io.github.zhdanok.servise;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LookUpArrayServiceTest {

    Logger logger = LoggerFactory.getLogger(LookUpArrayServiceTest.class);

    @Test
    void generateArrays() {
        int n = 10;
        int a = -300;
        int b = 300;
        int[] randomArray1 = LookUpArrayService.generateArrays(n, a, b);
        int[] randonArray2 = LookUpArrayService.generateArrays(n, a, b);
        assertNotEquals(randomArray1, randonArray2);
    }

    @Test
    void findMax() {
        int n = 10;
        int a = -300;
        int b = 300;
        int[] randomArray = LookUpArrayService.generateArrays(n, a, b);
        int actualNum = LookUpArrayService.findMax(randomArray);
        logger.info("Array: {}", randomArray);
        Arrays.sort(randomArray);
        int expectedNum = randomArray[n - 1];
        assertEquals(expectedNum, actualNum);
        logger.info("Max: {}", actualNum);
    }

    @Test
    void findMaxIfArrayIsEmpty() {
        int n = 0;
        int a = -300;
        int b = 300;
        int[] randomArray = LookUpArrayService.generateArrays(n, a, b);
        int expectedNum = 0;
        int actualNum = LookUpArrayService.findMax(randomArray);
        assertEquals(expectedNum, actualNum);
    }

    @Test
    void findMin() {
        int n = 10;
        int a = -300;
        int b = 300;
        int[] randomArray = LookUpArrayService.generateArrays(n, a, b);
        int actualNum = LookUpArrayService.findMin(randomArray);
        logger.info("Array: {}", randomArray);
        Arrays.sort(randomArray);
        int expectedNum = randomArray[0];
        assertEquals(expectedNum, actualNum);
        logger.info("Min: {}", actualNum);
    }

    @Test
    void findMinIfArrayIsEmpty() {
        int n = 0;
        int a = -300;
        int b = 300;
        int[] randomArray = LookUpArrayService.generateArrays(n, a, b);
        int expectedNum = 0;
        int actualNum = LookUpArrayService.findMin(randomArray);
        assertEquals(expectedNum, actualNum);
    }

    @Test
    void indexOfMax() {
        int[] randomArray = {12, -7, 145, 596, -678, 0, 89};
        int actualNum = LookUpArrayService.indexOfMax(randomArray);
        logger.info("Array: {}", randomArray);
        int expectedNum = 3;
        assertEquals(expectedNum, actualNum);
        logger.info("MaxIndex: {}", actualNum);
    }

    @Test
    void indexOfMaxIfArrayIsEmpty() {
        int[] randomArray = new int[0];
        int expectedNum = -1;
        int actualNum = LookUpArrayService.indexOfMax(randomArray);
        assertEquals(expectedNum, actualNum);
    }

    @Test
    void indexOfMin() {
        int[] randomArray = {12, -7, 145, 596, -678, 0, 89};
        int actualNum = LookUpArrayService.indexOfMin(randomArray);
        logger.info("Array: {}", randomArray);
        int expectedNum = 4;
        assertEquals(expectedNum, actualNum);
        logger.info("MinIndex: {}", actualNum);
    }

    @Test
    void indexOfMinIfArrayIsEmpty() {
        int[] randomArray = new int[0];
        int expectedNum = -1;
        int actualNum = LookUpArrayService.indexOfMin(randomArray);
        assertEquals(expectedNum, actualNum);
    }

    @Test
    void indexOf() {
        int[] randomArray = {28, -7, 145, 596, -678, 0, 89, 28, -7, 145, 596, -678, 0, 89};
        int num = 145;
        int actualNum = LookUpArrayService.indexOf(randomArray, num);
        logger.info("Array: {}", randomArray);
        int expectedNum = 2;
        assertEquals(expectedNum, actualNum);
        logger.info("Index of {} is {}", num, actualNum);
    }

    @Test
    void indexOfIfArrayIsEmpty() {
        int[] randomArray = new int[0];
        int num = 15;
        int expectedNum = -1;
        int actualNum = LookUpArrayService.indexOf(randomArray, num);
        assertEquals(expectedNum, actualNum);
    }

    @Test
    void indexOfIfNumberIsMissing() {
        int[] randomArray = {28, -7, 145, 596, -678, 0, 89, 28, -7, 145, 596, -678, 0, 89};
        int num = 12;
        int actualNum = LookUpArrayService.indexOf(randomArray, num);
        logger.info("Array: {}", randomArray);
        int expectedNum = -2;
        assertEquals(expectedNum, actualNum);
        logger.info("Number {} is missing in array", num);
    }
}

