package Lesson1;

public class Track {
    private int distance;
    public Track(int distance) {
        this.distance = distance;
    }
    public int getDistance() {
        return distance;
    }
    public boolean runDistance(int range, String name, int distance) {
        if(range >= distance) {
            System.out.printf(" %s, пробежал %s m. и преодолел дистанцию в %s m. \n", name, range, distance);
            return true;
        }
        else
           // System.out.printf(" %s, пробежал %s m. и не преодолел дистанцию в %s m. ", name, range, distance);
           // System.out.println();

            return false;

    }
}
