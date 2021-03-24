package io.github.zhdanok.calcfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static io.github.zhdanok.calcfactory.Calculable.SYMBOLS;
import static io.github.zhdanok.calcfactory.Demo.logger;


public class CalcService {

    public String readFromConsole() throws IOException {
        logger.info("Введите выражение арабскими или римскими цифрами в формате a + b");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        return text;
    }

    public char[] transformToCharArray(String expression) {
        expression = expression.replaceAll(" ", "");
        expression = expression.toUpperCase();
        char[] strToChar = expression.toCharArray();
        return strToChar;
    }

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

    public String extractSymbol(char[] strToChar) {
        int index = extractIndexOfSymbol(strToChar);
        return String.valueOf(strToChar[index]);
    }


    public String extractLeftNumber(char[] strToChar) {
        int index = extractIndexOfSymbol(strToChar);
        String leftNumber = String.valueOf(strToChar[0]);
        for (int i = 1; i < index; i++) {
            leftNumber += String.valueOf(strToChar[i]);
        }
        return leftNumber;
    }


    public String extractRightNumber(char[] strToChar) {
        int index = extractIndexOfSymbol(strToChar);
        String rightNumber = String.valueOf(strToChar[index + 1]);
        for (int i = index + 2; i < strToChar.length; i++) {
            rightNumber += String.valueOf(strToChar[i]);

        }
        return rightNumber;
    }

    public void printToConsole(String task, String result) {

        logger.info("{} = {}", task, result);
    }
}
