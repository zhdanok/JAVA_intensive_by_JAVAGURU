package io.github.zhdanok.calcfactory;

public interface Calculable {

    char[] SYMBOLS = {'*', '/', '+', '-'};
    String[] ARABIC_NUMERALS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] ROMAN_NUMERALS = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


    String addition(String leftNumber, String rightNumber);

    String subtraction(String leftNumber, String rightNumber);

    String multiplication(String leftNumber, String rightNumber);

    String division(String leftNumber, String rightNumber) throws Exception;

    default String selectionOfOperation(String leftNumber, String symbol, String rightNumber) throws Exception {
        switch (symbol) {
            case "+":
                return addition(leftNumber, rightNumber);
            case "-":
                return subtraction(leftNumber, rightNumber);
            case "*":
                return multiplication(leftNumber, rightNumber);
            case "/":
                return division(leftNumber, rightNumber);
            default:
                return "Данная операция недоступна";

        }
    }
}
