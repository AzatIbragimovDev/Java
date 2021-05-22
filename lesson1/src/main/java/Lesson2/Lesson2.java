package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        CheckEquality(11, 10);
        CheckNumber(3);
        CheckNumber2(-5);
        printWords("Hi man", 5);
        CheckYear(400);

    }

    public static void CheckEquality(int a, int b) {
        boolean sum = ((a + b) >= 10 && (a + b) <= 20);
        System.out.println(sum);
    }

    public static void CheckNumber(int a) {
        if (a < 0)
            System.out.println("Число " + a + " -отрицательное");
        else
            System.out.println("Число " + a + " -положительное");
    }

    public static void CheckNumber2(int a) {
        boolean check = a < 0;
        System.out.println(check);
    }

    public static void printWords(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static void CheckYear(int year) {
        boolean checkEquality1 = (year % 4 == 0);
        boolean checkEquality2 = ((year % 100) == 0);
        boolean checkEquality3 = (year % 400 == 0);
        if (checkEquality1 && !checkEquality2 || checkEquality3)
            System.out.println("true");

        else if (checkEquality2)
            System.out.println("false");
        else System.out.println("false");


    }
}


