package io.github.zhdanok.servise;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiseTest {

    Logger logger = LoggerFactory.getLogger(ArrayServiseTest.class);

    @Test
    void createArrays() {
        int size = 10;
        int[] actuale = ArrayServise.create(size);
        assertEquals(actuale.length, 10);
        assertEquals(actuale[3], actuale[7]);
        assertEquals(0, actuale[5]);
    }

    @Test
    void fillRandomlyArrays() {
        int size = 10;
        int[] emptyArray1 = ArrayServise.create(size);
        int[] emptyArray2 = ArrayServise.create(size);
        int[] actuale1 = ArrayServise.fillRandomly(emptyArray1);
        int[] actuale2 = ArrayServise.fillRandomly(emptyArray2);
        assertNotEquals(actuale1, actuale2);
        Arrays.sort(actuale1);
        Arrays.sort(actuale2);
        assertTrue(actuale1[0] >= 0);
        assertTrue(actuale2[0] >= 0);
        assertTrue(actuale1[size - 1] <= 100);
        assertTrue(actuale2[size - 1] <= 100);
    }

    @Test
    void printArrayTest() {
        int[] arrayForExample = {12, -7, 145, 596, -678, 0, 89};
        ArrayServise.printArray(arrayForExample);
    }

    @Test
    void sumOfElementsOfArray() {
        int[] arrayForExample = {12, -7, 145, 596, -678, 0, 89};
        int sumActuale = ArrayServise.sum(arrayForExample);
        int sumExpected = 157;
        assertEquals(sumExpected, sumActuale);
        logger.info("Sum of elements of array {} is {}", arrayForExample, sumActuale);
    }

    @Test
    void averageOfElementsOfArray() {
        int[] arrayForExample = {12, -7, 145, 596, -678, 0, 89};
        double avgActuale = ArrayServise.avg(arrayForExample);
        double avgExpected = 22.43;
        assertEquals(avgExpected, avgActuale, 0.01);
        logger.info("Average of elements of array {} is {}", arrayForExample, avgActuale);
    }

    @Test
    void averageOfElementsIfArrayIsEmpty() {
        int[] arrayForExample = new int[0];
        double avgActuale = ArrayServise.avg(arrayForExample);
        double avgExpected = 0.;
        assertEquals(avgExpected, avgActuale, 0.01);
        logger.info("Array is empty");
    }

    @Test
    void sortTheArray() {
        int size = 10;
        int[] arrayForExample = ArrayServise.create(size);
        int[] unsortedArray = ArrayServise.fillRandomly(arrayForExample);
        logger.info("Unsorted Array {}", unsortedArray);
        int[] sortedArray = ArrayServise.sort(unsortedArray);
        int[] expectedArray = unsortedArray.clone();
        Arrays.sort(expectedArray);
        assertArrayEquals(expectedArray, sortedArray);
        logger.info("Sorted Array {}", sortedArray);

    }

    @Test
    void swapTheEvenArray() {
        int[] arrayForExample = {12, -7, 145, 596, 14, -678, 0, 89};
        logger.info("Unswaped Array {}", arrayForExample);
        int[] actualeArray = ArrayServise.swap(arrayForExample);
        int[] expectadArray = {89, 0, -678, 14, 596, 145, -7, 12};
        assertArrayEquals(expectadArray, actualeArray);
        logger.info("Swaped Array {}", actualeArray);
    }

    @Test
    void swapTheOddArray() {
        int[] arrayForExample = {12, -7, 145, 596, -678, 0, 89};
        logger.info("Unswaped Array {}", arrayForExample);
        int[] actualeArray = ArrayServise.swap(arrayForExample);
        int[] expectadArray = {89, 0, -678, 596, 145, -7, 12};
        assertArrayEquals(expectadArray, actualeArray);
        logger.info("Swaped Array {}", actualeArray);
    }

}