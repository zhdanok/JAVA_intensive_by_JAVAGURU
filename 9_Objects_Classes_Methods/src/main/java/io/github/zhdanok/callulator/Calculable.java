package io.github.zhdanok.callulator;

public interface Calculable {

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
