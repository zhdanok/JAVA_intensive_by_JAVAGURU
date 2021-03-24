package io.github.zhdanok.calcfactory;

public class Application {

    private Calculable calculator;

    public Application(AbstractCalcFactory factory) {
        calculator = factory.createCalculator();
    }

    public String selectionOfOperation(String leftNumber, String symbol, String rightNumber) throws Exception {
        switch (symbol) {
            case "+":
                return calculator.addition(leftNumber, rightNumber);
            case "-":
                return calculator.subtraction(leftNumber, rightNumber);
            case "*":
                return calculator.multiplication(leftNumber, rightNumber);
            case "/":
                return calculator.division(leftNumber, rightNumber);
            default:
                return "Данная операция недоступна";

        }
    }
}



