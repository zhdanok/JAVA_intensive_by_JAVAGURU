package io.github.zhdanok.servise;


import java.util.Arrays;

public class Palindrome {


    public static Boolean isPalindrome(String str) {
        str = str.replaceAll("\\p{Punct}", "");
        str = str.replaceAll(" ", "");
        char[] strToChar1 = str.toCharArray();
        char[] strToChar2 = strToChar1.clone();
        int size = strToChar1.length;
        char buf;
        for (int i = 0; i < size / 2; i++) {
            buf = strToChar1[i];
            strToChar1[i] = strToChar1[size - 1 - i];
            strToChar1[size - 1 - i] = buf;
        }
        System.out.println(strToChar1);
        if (Arrays.equals(strToChar1, strToChar2)) {
            return true;
        }
        return false;
    }
}
