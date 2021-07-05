package Lesson1;

public class Wall {
    private double height;
    public Wall(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public boolean leap(double jumpHeight, String name, double height) {
        if(jumpHeight >= height) {
            System.out.printf(" %s, прыгнул в высоту на: %s метра и перепрыгнул трамплин высотой %s метра! \n", name, jumpHeight, height);
            return true;
        }
        else
            //System.out.printf(" %s, прыгнул в высоту на: %s метра и не перепрыгнул трамплин высотой %s метра!", name, jumpHeight, height);
            //System.out.println();
            return false;
    }
}
