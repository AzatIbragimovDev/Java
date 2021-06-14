package Lesson6;

public class Animal {
    private int distance;
    private int swim;
    public Animal(int distance, int swim) {
        this.distance = distance;
        this.swim = swim;

    }

    public  int getDistance() {
        return distance;
    }
    public  int getSwim() {
        return swim;
    }
    public void run() {
        System.out.printf("The animal is runing %s metrs %n", distance);
    }

    public  void swim() {
        System.out.printf("The animal is swim %s metrs %n", swim);
    }

}
