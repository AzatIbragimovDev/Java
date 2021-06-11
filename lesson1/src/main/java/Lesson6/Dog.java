package Lesson6;

public class Dog extends Animal {
    public Dog(int runDistance, int swimDistance) {
        super(runDistance,swimDistance);
    }


    @Override
    public void run(int distance) {
        System.out.println("Dog run distance: " + (distance <= getRunDistance()));
    }

    @Override
    public void swim(int distance) {
        System.out.println("Dog swim distance: " + (distance <= getSwimDistance()));

    }

}
