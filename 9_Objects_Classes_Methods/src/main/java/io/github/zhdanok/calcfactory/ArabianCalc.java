package io.github.zhdanok.calcfactory;


public class ArabianCalc implements Calculable {


    @Override
    public String addition(String leftNumber, String rightNumber) {
        int result = Integer.valueOf(leftNumber) + Integer.valueOf(rightNumber);
        return String.valueOf(result);
    }

    @Override
    public String subtraction(String leftNumber, String rightNumber) {
        int result = Integer.valueOf(leftNumber) - Integer.valueOf(rightNumber);
        return String.valueOf(result);
    }

    @Override
    public String multiplication(String leftNumber, String rightNumber) {
        int result = Integer.valueOf(leftNumber) * Integer.valueOf(rightNumber);
        return String.valueOf(result);
    }

    @Override
    public String division(String leftNumber, String rightNumber) throws Exception {
        int result = Integer.valueOf(leftNumber) % Integer.valueOf(rightNumber);
        if (result == 0) {
            result = Integer.valueOf(leftNumber) / Integer.valueOf(rightNumber);
        } else throw new Exception("Result is not integer number. Please change parameters");
        return String.valueOf(result);
    }
}
