package Lesson6;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal(100, 30),
                new Dog(500, 10),
                new Cat(200, 0),
        };
        movingAnimals(animals);

    }

    static void movingAnimals(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].run();
            animals[i].swim();
        }
        System.out.println("Sum of animals is: " + animals.length);
    }
}

