package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        CheckEquality(11, 10);
        CheckNumber(3);
        System.out.println(CheckNumber2(10));
        printWords("Hi man", 5);
        System.out.println(CheckYear(6231));

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

    public static boolean CheckNumber2(int a) {
        boolean check = a < 0;
        return check;

    }

    public static void printWords(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean CheckYear(int year) {
        boolean checkEquality1 = (year % 4 == 0 && year % 100 ==0 && year % 400 ==0);
        boolean checkEquality2 = (year % 4 == 0 && year % 100 == 0);
        boolean checkEquality3 = (year % 4 == 0);
        boolean checkEquality4 = (year % 2 != 0);
        boolean checkEquality = false;
        if (checkEquality1) {
            checkEquality = checkEquality1;
                if (checkEquality2) {
                    checkEquality = checkEquality2;
                        if (checkEquality3) {
                            checkEquality = checkEquality3;
                        }
            }

        }
        return checkEquality;
    }
}


