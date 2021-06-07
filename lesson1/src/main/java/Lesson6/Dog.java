package Lesson6;

public class Dog extends Animal {

    public Dog(int distance, int swim) {

        super (distance, swim);
    }
    @Override
    public void run() {
        System.out.printf("The dogBobik is runing %s%n", getDistance());
    }
    @Override
    public void swim() {
        System.out.printf("The dogBobik is swim %s%n", getSwim());

    }

}
