package io.github.zhdanok.callulator;

import java.io.IOException;

public class ArabianCalcService {

    ArabianCalc calc = new ArabianCalc();

    void startCalculate() throws Exception {
        String task = calc.readFromConsole();
        char[] taskInChar = calc.transformToCharArray(task);
        String leftNumber = calc.extractLeftNumber(taskInChar);
        String symbol = calc.extractSymbol(taskInChar);
        String rightNumber = calc.extractRightNumber(taskInChar);
        String result = calc.selectionOfOperation(leftNumber, symbol, rightNumber);
        calc.printToConsole(task, result);

    }
}
