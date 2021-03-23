package io.github.zhdanok.callulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ArabianCalc implements Transformable, Consoleble {

    public ArabianCalc() {
    }

    @Override
    public char[] transformToCharArray(String expression) {
        expression = expression.replaceAll(" ", "");
        char[] strToChar = expression.toCharArray();
        return strToChar;
    }

    @Override
    public String readFromConsole() throws IOException {
        logger.info("Введите выражение арабскими или римскими цифрами в формате a + b");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        return text;
    }

    @Override
    public void printToConsole(String answer) {
        logger.info("{}", answer);
    }

    @Override//сделать дефолтным
    public int extractIndexOfSymbol(char[] strToChar) {
        int index = 0;
        for (int i = 0; i < strToChar.length; i++) {
            for (int j = 0; j < SYMBOLS.length; j++) {
                if (strToChar[i] == SYMBOLS[j]) {
                    index = i;
                }
            }
        }
        return index;
    }

    @Override
    public String extractSymbol(char[] strToChar) {
        int index = extractIndexOfSymbol(strToChar);
        return String.valueOf(strToChar[index]);
    }

    @Override
    public String extractLeftNumber(char[] strToChar) {
        int index = extractIndexOfSymbol(strToChar);
        String leftNumber = String.valueOf(strToChar[0]);
        for (int i = 1; i < index; i++) {
            leftNumber += String.valueOf(strToChar[i]);
        }
        return leftNumber;
    }

    @Override
    public String extractRightNumber(char[] strToChar) {
        int index = extractIndexOfSymbol(strToChar);
        String rightNumber = String.valueOf(strToChar[index + 1]);
        for (int i = index + 2; i < strToChar.length; i++) {
            rightNumber += String.valueOf(strToChar[i]);

        }
        return rightNumber;
    }








}
