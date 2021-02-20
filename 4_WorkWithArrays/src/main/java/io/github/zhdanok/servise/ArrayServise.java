package io.github.zhdanok.servise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ArrayServise {


    static Logger logger = LoggerFactory.getLogger(ArrayServise.class);

    public static int[] create(int size) {
        return new int[size];
    }

    public static int[] fillRandomly(int[] emptyArray) {
        Random random = new Random();
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = random.nextInt(101);
        }
        return emptyArray;
    }

    public static void printArray(int[] arrayForExample) {
        for (int i = 0; i < arrayForExample.length; i++) {
            logger.info("[{}] = {}", i, arrayForExample[i]);

        }
    }

    public static int sum(int[] arrayForExample) {
        int sum = 0;
        for (int i = 0; i < arrayForExample.length; i++) {
            sum += arrayForExample[i];
        }
        return sum;
    }

    public static double avg(int[] arrayForExample) {
        if (arrayForExample.length == 0) {
            return 0.;
        }
        double sum = 0.;
        for (int i = 0; i < arrayForExample.length; i++) {
            sum += arrayForExample[i];
        }
        return sum/arrayForExample.length;
    }

    public static int[] sort(int[] array) {
        boolean isSorted = false;
        int buf =0;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }

    public static int[] swap(int[] arrayForExample) {
        int size = arrayForExample.length;
        int buf = 0;
        for (int i = 0; i < size/2; i++) {
            buf = arrayForExample[i];
            arrayForExample[i] = arrayForExample[size-1-i];
            arrayForExample[size-1-i] = buf;
        }
        return arrayForExample;
    }
}
