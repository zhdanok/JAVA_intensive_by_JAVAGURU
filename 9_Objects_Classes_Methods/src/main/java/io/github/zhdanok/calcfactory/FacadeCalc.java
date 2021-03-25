package io.github.zhdanok.calcfactory;

import static io.github.zhdanok.calcfactory.Demo.configureApplication;


public class FacadeCalc {

    public void  startCalc() throws Exception {

        CalcService calcService = new CalcService();
        String task = calcService.readFromConsole();
        char[] taskInChar = calcService.transformToCharArray(task);
        String leftNumber = calcService.extractLeftNumber(taskInChar);
        String symbol = calcService.extractSymbol(taskInChar);
        String rightNumber = calcService.extractRightNumber(taskInChar);
        String resultOfSelection = calcService.selectionOfCalculatorsType(leftNumber, rightNumber);

        Application app = configureApplication(resultOfSelection);
        String result = app.selectionOfOperation(leftNumber, symbol, rightNumber);
        calcService.printToConsole(task, result);
    }


}
