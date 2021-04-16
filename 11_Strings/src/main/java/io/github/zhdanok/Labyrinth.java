package io.github.zhdanok;


import org.apache.log4j.Logger;

import java.util.Scanner;

public class Labyrinth {

    Logger logger = Logger.getLogger(Labyrinth.class);

    public static String[][] gamePlace = {
            {"@", "+", "+", "+", "-", "-", "-", "+", "+", "+"},
            {"-", "-", "-", "+", "+", "-", "-", "-", "+", "+"},
            {"+", "+", "+", "+", "-", "-", "-", "-", "-", "-"},
            {"+", "-", "-", "-", "-", "-", "+", "+", "+", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "-", "-", "+"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "+"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "+"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
            {"+", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"}
    };

    public static int indexI = 0;

    public static int indexJ = 0;

    public void printTheGamePlace() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(gamePlace[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void chooseMove() {
        Scanner scanner = new Scanner(System.in);
        logger.info("Сделайте ход с помощью клавиш wasd");
        String move = scanner.nextLine();
        gamePlace[indexI][indexJ] = "+";
        switch (move) {
            case "w":
                indexI--;
                break;
            case "a":
                indexJ--;
                break;
            case "s":
                indexI++;
                break;
            case "d":
                indexJ++;
                break;
        }
        gamePlace[indexI][indexJ] = "@";

    }













    /*public void fillTheGamePlace() {
        Scanner scanner = new Scanner(System.in);
        logger.info("Заполните игровое поле 10*10 по строкам с пробелами. Герой будет находиться в левом верхнем углу. " +
                "# - тропа, * - препятствие");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gamePlace[i][j] = scanner.next();
            }
        }
        scanner.close();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(gamePlace[i][j] + " ");
            }
        }
    }*/


}
