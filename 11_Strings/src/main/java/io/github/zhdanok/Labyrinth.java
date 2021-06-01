package io.github.zhdanok;


import org.apache.log4j.Logger;

import java.util.Scanner;


public class Labyrinth {

    Logger logger = Logger.getLogger(Labyrinth.class);

    public static String[][] gamePlace = {
            {"@", "+", "+", "+", "-", "-", "-", "+", "+", "+"},
            {"+", "-", "-", "+", "+", "-", "-", "-", "+", "+"},
            {"+", "+", "+", "+", "-", "-", "-", "-", "-", "-"},
            {"+", "-", "-", "-", "-", "-", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "-", "-", "+"},
            {"+", "-", "-", "-", "-", "-", "-", "-", "-", "+"},
            {"+", "-", "-", "-", "-", "-", "-", "-", "-", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"}
    };

    public static int indexI = 0;

    public static int indexJ = 0;


    public void startTheGame() {
        logger.info("Управляйте героем с помощью клавиш wasd. Двигайтесь по +. Цель: дойти до нижнего правого угла");
        printTheGamePlace();
        while (!isFinish()) {
            String move = scannerMove();
            chooseMove(move);
            printTheGamePlace();
        }
        logger.info("Вы выиграли!");
    }

    private void printTheGamePlace() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(gamePlace[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isFinish() {
        return ((indexI == 9) && (indexJ == 9));

    }

    private String scannerMove() {
        Scanner scanner = new Scanner(System.in);
        logger.info("Сделайте ход с помощью клавиш wasd");
        return scanner.nextLine();
    }

    private void chooseMove(String move) {
        switch (move) {
            case "w":
                checkW();
                break;
            case "a":
                checkA();
                break;
            case "s":
                checkS();
                break;
            case "d":
                checkD();
                break;
            default:
                logger.info("Ошибка ввода");
                break;
        }
        gamePlace[indexI][indexJ] = "@";

    }

    private void checkW() {
        if ((indexI > 0) && (gamePlace[indexI - 1][indexJ].equals("+"))) {
            gamePlace[indexI][indexJ] = "+";
            indexI--;
        } else {
            logger.info("Ход невозможен");
        }
    }

    private void checkA() {
        if ((indexJ > 0) && (gamePlace[indexI][indexJ - 1].equals("+"))) {
            gamePlace[indexI][indexJ] = "+";
            indexJ--;
        } else {
            logger.info("Ход невозможен");
        }
    }

    private void checkS() {
        if ((indexI < 9) && (gamePlace[indexI + 1][indexJ].equals("+"))) {
            gamePlace[indexI][indexJ] = "+";
            indexI++;
        } else {
            logger.info("Ход невозможен");
        }

    }

    private void checkD() {
        if ((indexJ < 9) && (gamePlace[indexI][indexJ + 1].equals("+"))) {
            gamePlace[indexI][indexJ] = "+";
            indexJ++;
        } else {
            logger.info("Ход невозможен");
        }
    }

}
