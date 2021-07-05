package Lesson1;

public class Robot {
    private String name;
    private int range;
    private double jumpHeight;
    private boolean success = false;
    public Robot(String name, int range, double jumpHeight) {
        this.name = name;
        this.range = range;
        this.jumpHeight = jumpHeight;
    }
    public void run(Track t) {
        success = t.runDistance(range, name, t.getDistance());
    }
    public void jump(Wall w) {
        success = w.leap(jumpHeight, name, w.getHeight());
    }

}
