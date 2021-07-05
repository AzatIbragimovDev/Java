package Lesson1;

public class Human {
    private String name;
    private int range;
    private double jumpHeight;
    public boolean success = false;
    public Human(String name, int range, double jumpHeight) {
        this.name = name;
        this.range = range;
        this.jumpHeight = jumpHeight;

    }
    public boolean run(Track t) {
        success = t.runDistance(range, name, t.getDistance());
        if(success){
        return true;}
        else  return false;
    }
    public boolean jump(Wall w) {
        success = w.leap(jumpHeight, name, w.getHeight());

        if(success){
            return true;}
        else  return false;
    }
}
