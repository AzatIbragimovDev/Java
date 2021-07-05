package Lesson1;

public class Cat {
    private String name;
    private int range;
    private double jumpHeight;
    private boolean success = false;
    public Cat(String name, int range, double jumpHeight) {
        this.name = name;
        this.range = range;
        this.jumpHeight = jumpHeight;
    }

    public boolean run(Track t) {
        success = t.runDistance(range, name, t.getDistance());
    return true;
    }
    public boolean jump(Wall w) {
        success = w.leap(jumpHeight, name, w.getHeight());
    return true;
    }

}
