package Lesson6;


public class Main {
    public static void main(String[] args) {
        Animal[]animals = {
                new Dog(500, 100),
                new Cat(300, 0)

        };
        goAnimals(animals);
    }
       public static void goAnimals(Animal[] animals) {
           for (int i = 0; i < animals.length; i++) {
               animals[i].run(500);
               animals[i].swim(100);

           }
       }
}

