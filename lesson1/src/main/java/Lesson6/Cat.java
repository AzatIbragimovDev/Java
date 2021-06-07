package Lesson6;

public class Cat extends Animal {

    public Cat(int distance, int swim) {
        super(distance, swim);
    }
    @Override
    public void run() {
        System.out.printf("The catBarsik is runing %s%n", getDistance());
    }
    @Override
    public void swim() {
        System.out.println("The Cat is can't swim");
    }
}
