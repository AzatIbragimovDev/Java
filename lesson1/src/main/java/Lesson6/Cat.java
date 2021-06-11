package Lesson6;

public class Cat extends Animal {
    public Cat(int runDistance, int swimDistance) {
        super(runDistance,0);
    }


    @Override
    public void run(int distance) {
        System.out.println("Cat run distance: " + (distance <= getRunDistance()));
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat can't swim");

    }

}
