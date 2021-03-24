package io.github.zhdanok.callulator;


public interface Transformable {

    char[] SYMBOLS = {'*', '/', '+', '-'};
    String[] ARABIC_NUMERALS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] ROMAN_NUMERALS = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


    char[] transformToCharArray(String expression);

    default int extractIndexOfSymbol(char[] strToChar) {
        int index = 0;
        for (int i = 0; i < strToChar.length; i++) {
            for (int j = 0; j < SYMBOLS.length; j++) {
                if (strToChar[i] == SYMBOLS[j]) {
                    index = i;
                }
            }
        }
        return index;
    };

    String extractSymbol(char[] strToChar);

    String extractLeftNumber(char[] strToChar);

    String extractRightNumber(char[] strToChar);

    default String transformToRomanNumerals(String s) {
        for (int i = 0; i < ARABIC_NUMERALS.length; i++) {
            if (s.equals(ARABIC_NUMERALS[i])) {
                s = ROMAN_NUMERALS[i];
            }
        }
        return s;
    };





}




