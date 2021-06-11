package Lesson6;

public abstract class Animal {
   private final int runDistance;
   private final int swimDistance;



   public abstract void run(int distance);
   public abstract void swim(int distance);
   public Animal(int runDistance, int swimDistance) {
      this.runDistance = runDistance;
      this.swimDistance = swimDistance;
   }
   public int getRunDistance() {
      return runDistance;
   }
   public int getSwimDistance() {
      return swimDistance;
   }

}
