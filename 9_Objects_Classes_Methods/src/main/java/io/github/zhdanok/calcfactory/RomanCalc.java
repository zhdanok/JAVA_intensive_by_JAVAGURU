package io.github.zhdanok.calcfactory;




public class RomanCalc  implements  Calculable {


    @Override
    public String addition(String leftNumber, String rightNumber) {
        leftNumber = transformToArabianNumerals(leftNumber);
        rightNumber = transformToArabianNumerals(rightNumber);
        int result = Integer.valueOf(leftNumber) + Integer.valueOf(rightNumber);
        String romanResult = transformToRomanNumerals(String.valueOf(result));
        return romanResult;
    }

    @Override
    public String subtraction(String leftNumber, String rightNumber) {
        leftNumber = transformToArabianNumerals(leftNumber);
        rightNumber = transformToArabianNumerals(rightNumber);
        int result = Integer.valueOf(leftNumber) - Integer.valueOf(rightNumber);
        String romanResult = transformToRomanNumerals(String.valueOf(result));
        return romanResult;
    }

    @Override
    public String multiplication(String leftNumber, String rightNumber) {
        leftNumber = transformToArabianNumerals(leftNumber);
        rightNumber = transformToArabianNumerals(rightNumber);
        int result = Integer.valueOf(leftNumber) * Integer.valueOf(rightNumber);
        String romanResult = transformToRomanNumerals(String.valueOf(result));
        return romanResult;
    }

    @Override
    public String division(String leftNumber, String rightNumber) throws Exception {
        leftNumber = transformToArabianNumerals(leftNumber);
        rightNumber = transformToArabianNumerals(rightNumber);
        int result = Integer.valueOf(leftNumber) % Integer.valueOf(rightNumber);
        if (result == 0) {
            result = Integer.valueOf(leftNumber) / Integer.valueOf(rightNumber);
        } else throw new Exception("Result is not integer number. Please change parameters");
        String romanResult = transformToRomanNumerals(String.valueOf(result));
        return romanResult;
    }

    public String transformToRomanNumerals(String s) {
        for (int i = 0; i < ARABIC_NUMERALS.length; i++) {
            if (s.equals(ARABIC_NUMERALS[i])) {
                s = ROMAN_NUMERALS[i];
            }
        }
        return s;
    };

    public String transformToArabianNumerals(String s) {
        for (int i = 0; i < ROMAN_NUMERALS.length; i++) {
            if (s.equals(ROMAN_NUMERALS[i])) {
                s = ARABIC_NUMERALS[i];
            }
        }
        return s;
    };
}
