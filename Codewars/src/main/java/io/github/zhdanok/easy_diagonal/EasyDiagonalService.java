package io.github.zhdanok.easy_diagonal;

public class EasyDiagonalService {


    public int calculateS(int n, int p) {
        if (isValueCorrect(n, p)) {
            int numberOfElements = n - p + 1;
            int[][] matrix = fillTheArray(n);
            int sum = 0;
            for (int i = 0; i < numberOfElements; i++) {
                sum += matrix[i][p];
            }
            return sum;
        }
        throw new IllegalArgumentException(" Invalid input! ");
    }

    public boolean isValueCorrect(int n, int p) {
        if (n > 0 && p > 0 && n > p)
            return true;
        return false;
    }

    public int[][] fillTheArray(int n) {
        int[][] matrix = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            matrix[i][0] = 1;
        }
        for (int j = 0; j < n + 1; j++) {
            matrix[0][j] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
            }
        }
        return matrix;
    }

    //Версия static без вложенных методов для Codewars

    /*public static int diagonal(int n, int p) {

        int numberOfElements = n - p + 1;

        int[][] matrix = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            matrix[i][0] = 1;
        }
        for (int j = 0; j < n + 1; j++) {
            matrix[0][j] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
            }
        }
        int sum = 0;
        for (int i = 0; i < numberOfElements; i++) {
            sum += matrix[i][p];
        }
        return sum;


    }*/


}

