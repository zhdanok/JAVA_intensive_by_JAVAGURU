package io.github.zhdanok.callulator;


public interface Transformable {

    char[] SYMBOLS = {'*', '/', '+', '-'};
    String[] ARABIC_NUMERALS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] ROMAN_NUMERALS = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


    char[] transformToCharArray(String expression);

    int extractIndexOfSymbol(char[] strToChar);

    String extractSymbol(char[] strToChar);

    String extractLeftNumber(char[] strToChar);

    String extractRightNumber(char[] strToChar);





}




