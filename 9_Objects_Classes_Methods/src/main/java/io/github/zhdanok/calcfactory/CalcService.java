package io.github.zhdanok.calcfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static io.github.zhdanok.calcfactory.Calculable.*;
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


    public String selectionOfCalculatorsType(String leftNumber, String rightNumber) throws Exception {
        String leftIs = "";
        String rightIs = "";
        for (int i = 0; i < ROMAN_NUMERALS.length; i++) {
            if (leftNumber.equals(ROMAN_NUMERALS[i])) {
                leftIs = "roman";

            } else if (leftNumber.equals(ARABIC_NUMERALS[i])) {
                leftIs = "arabic";

            }
            if (rightNumber.equals(ROMAN_NUMERALS[i])) {
                rightIs = "roman";

            } else if (rightNumber.equals(ARABIC_NUMERALS[i])) {
                rightIs = "arabic";

            }
        }
        if (rightIs.equals(leftIs) && !(rightIs.equals(""))) {
            return rightIs;
        } else throw new Exception("incorrect input");


    }
}
