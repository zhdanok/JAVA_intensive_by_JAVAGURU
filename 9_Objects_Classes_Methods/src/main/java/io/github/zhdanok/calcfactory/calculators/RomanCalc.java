package io.github.zhdanok.calcfactory.calculators;


import java.util.TreeMap;

public class RomanCalc  implements  Calculable {

    private final static TreeMap<Integer, String> MAP = new TreeMap<Integer, String>();

    static {

        MAP.put(1000, "M");
        MAP.put(900, "CM");
        MAP.put(500, "D");
        MAP.put(400, "CD");
        MAP.put(100, "C");
        MAP.put(90, "XC");
        MAP.put(50, "L");
        MAP.put(40, "XL");
        MAP.put(10, "X");
        MAP.put(9, "IX");
        MAP.put(5, "V");
        MAP.put(4, "IV");
        MAP.put(1, "I");

    }


    @Override
    public String addition(String leftNumber, String rightNumber) {
        int a = transformToArabianNumerals(leftNumber);
        int b = transformToArabianNumerals(rightNumber);
        int result = a + b;
        String romanResult = transformToRomanNumerals(result);
        return romanResult;
    }

    @Override
    public String subtraction(String leftNumber, String rightNumber) {
        int a = transformToArabianNumerals(leftNumber);
        int b = transformToArabianNumerals(rightNumber);
        int result = a - b;
        String romanResult = transformToRomanNumerals(Math.abs(result));
        if (result < 0) {
            return ("-" + romanResult);
        }
        return romanResult;
    }

    @Override
    public String multiplication(String leftNumber, String rightNumber) {
        int a = transformToArabianNumerals(leftNumber);
        int b = transformToArabianNumerals(rightNumber);
        int result = a * b;
        String romanResult = transformToRomanNumerals(result);
        return romanResult;
    }

    @Override
    public String division(String leftNumber, String rightNumber) throws Exception {
        int a = transformToArabianNumerals(leftNumber);
        int b = transformToArabianNumerals(rightNumber);
        int result = a % b;
        if (result == 0) {
            result = a / b;
        } else throw new Exception("Result is not integer number. Please change parameters");
        String romanResult = transformToRomanNumerals(result);
        return romanResult;
    }



    public int transformToArabianNumerals(String number) {
        for (int i = 0; i < ROMAN_NUMERALS.length; i++) {
            if (number.equals(ROMAN_NUMERALS[i])) {
                number = ARABIC_NUMERALS[i];
            }
        }
        return Integer.valueOf(number);
    };


    public String transformToRomanNumerals(int number) {
        int l =  MAP.floorKey(number);
        if ( number == l ) {
            return MAP.get(number);
        }
        return MAP.get(l) + transformToRomanNumerals(number-l);
    }
}
