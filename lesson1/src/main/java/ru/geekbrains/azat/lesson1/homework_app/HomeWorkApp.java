package ru.geekbrains.azat.lesson1.homework_app;

import java.lang.System;

public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords("Orange");
        printThreeWords("Banana");
        printThreeWords("Apple");
        checkSumSign(5,-10);
        printColor(100);
        compareNumbers(4,6);
    }
    public static void printThreeWords(String fruit) {

        String WordText ="" + fruit;
        System.out.println(WordText);
        /* System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");*/

    }
    public static void checkSumSign(int a, int b) {
        /*int a = 10;
        int b = 5;
        int sum = a + b;*/
        boolean checkEquality1 = ((a + b) >= 0);
        if (checkEquality1)
            System.out.println("Сумма положительная");
         else
            System.out.println("Сумма отрицательная");

            }
    public static void printColor(int value) {
        //int value = 100;
        boolean checkEquality2 = value <= 0;
        boolean checkEquality3 = (value > 0 & value <= 100);
        if (checkEquality2)
            System.out.println("Красный");
         else  if (checkEquality3)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");

    }
    public static void compareNumbers(int a, int b) {
        /*int a = 1;
        int b =5;*/
        boolean checkEquality4 = a >= b;
        if (checkEquality4)
            System.out.println("a >= b");
        else
            System.out.println("a < b");

    }
}
