package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        CheckEquality(11, 10);
        CheckNumber(3);

        }
    public static void CheckEquality (int a, int b) {
        boolean sum = ((a + b)>=10 && (a +b)<=20);
        System.out.println(sum);
    }

    public static void CheckNumber (int a) {
        if (a <0) {
            System.out.println("Число " +a+ " -отрицательное");
        } else {
            System.out.println ("Число " +a+ " -положительное");
        }

    }

}
