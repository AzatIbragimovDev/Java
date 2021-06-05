package Lesson3;

public class Lesson3 {

    public static void main(String[] args) {
        //replacingArrayNumbers ();
        //fillingArray();
        //arrayMultiplyTwo();
        //twoDimArray();
        for (int i = 0; i < returnArray().length; i++) {
        System.out.println("[" + i + "] => " + returnArray());
        }




    }

    public static void printArray() {

    }
    static public void replacingArrayNumbers () {
        int array[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = array[i] - 1;
            } else array[i] = array[i] + 1;
            System.out.println("[" + i + "] =>" + array[i]);
        }
    }
    static public void fillingArray () {
        int array[] = new int [100];
        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println("[" + i + "] =>" + array[i]);
        }

    }
    static public void arrayMultiplyTwo() {
        int[] numbers =  { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] = numbers[i] * 2;
            }
            System.out.println("[" + i + "] => " + numbers[i]);
        }
    }
    static public void twoDimArray() {
        int arr [][] = new int [5][5];
        for(int i =0; i < arr.length; i++) {
            for( int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                } else if ((i + j) == 4) {
                    arr[i][j] = 1;
                }
            System.out.print(arr[i][j]);
            System.out.print(" ");
            }
            System.out.println();
        }
    }

    static int[] returnArray() {
        int len = 5;
        int initialValue = 1;
        int [] arr1 = new int [len];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = initialValue;
        }
        return arr1;
    }
    static public void minMaxNumbersArray() {

        int[] arr = {1, 4, 10, 12, 3};
        for(int i = 0; i < arr.length; i++) {

        }

    }



}
    







