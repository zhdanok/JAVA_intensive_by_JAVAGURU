package io.github.zhdanok.servise;

import java.util.Random;

public class LookUpArrayService {


    public static int[] generateArrays(int n, int a, int b) {
        Random random = new Random();
        int[] buf = new int[n];
        int diff = b - a;
        for (int i = 0; i < n; i++) {
            buf[i] = random.nextInt(diff + 1) + a;
        }
        return buf;
    }

    public static int findMax(int[] randomArray) {
        if (randomArray.length == 0) {
            return 0;
        }
        int max = randomArray[0];
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] > max) {
                max = randomArray[i];
            }
        }
        return max;
    }

    public static int findMin(int[] randomArray) {
        if (randomArray.length == 0) {
            return 0;
        }
        int min = randomArray[0];
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] < min) {
                min = randomArray[i];
            }
        }
        return min;
    }

    public static int indexOfMax(int[] randomArray) {
        if (randomArray.length == 0) {
            return -1;
        }
        int max = randomArray[0];
        int maxIndex = 0;
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] > max) {
                max = randomArray[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int indexOfMin(int[] randomArray) {
        if (randomArray.length == 0) {
            return -1;
        }
        int min = randomArray[0];
        int minIndex = 0;
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] < min) {
                min = randomArray[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static int indexOf(int[] randomArray, int num) {
        if (randomArray.length == 0) {
            return -1;
        }
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] == num) {
                return i;
            }
        }
        return -2;
    }
}
