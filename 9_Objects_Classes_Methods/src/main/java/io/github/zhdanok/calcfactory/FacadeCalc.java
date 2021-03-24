package io.github.zhdanok.calcfactory;

import static io.github.zhdanok.calcfactory.Demo.configureApplication;


public class FacadeCalc {

    public void  startCalc() throws Exception {
        Application app = configureApplication();
        CalcService calcService = new CalcService();
        String task = calcService.readFromConsole();
        char[] taskInChar = calcService.transformToCharArray(task);
        String leftNumber = calcService.extractLeftNumber(taskInChar);
        String symbol = calcService.extractSymbol(taskInChar);
        String rightNumber = calcService.extractRightNumber(taskInChar);
        String result = app.selectionOfOperation(leftNumber, symbol, rightNumber);
        calcService.printToConsole(task, result);
    }


}
