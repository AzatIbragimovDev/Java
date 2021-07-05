package Lesson1;

public class Main {
    public static void main(String[] args) {

        Object[] players = new Object[6];
        players[0] = new Human("Vasya", 900, 2.4);
        players[1] = new Cat("Bysinka", 900, 1.1);
        players[2] = new Human("Leva", 1900, 2.3);
        players[3] = new Cat("Barsik", 900, 2.4);
        players[4] = new Robot("Wally", 800, 2.5);

        Object[] obstacle = new Object[4];
        obstacle[0] = new Track(870);
        obstacle[1] = new Track(1500);
        obstacle[2] = new Wall(1.8);
        obstacle[3] = new Wall(2.4);

        playersGo(players, obstacle);
    }
    public static void playersGo(Object[]players, Object[]obstacle) {
        for(Object currentObject: players) {
            if(currentObject instanceof Human) {
                for (Object currentObstacle: obstacle) {
                    if(currentObstacle instanceof Track) {
                        ((Human)currentObject).run((Track)currentObstacle);
                    } else if(currentObstacle instanceof Wall) {
                        ((Human)currentObject).jump((Wall)currentObstacle);
                    }
                }
            } else if (currentObject instanceof Cat) {
                for (Object currentObstacle: obstacle) {
                    if(currentObstacle instanceof Track) {
                        if(((Cat)currentObject).run((Track)currentObstacle)) {
                        }
                    } else if(currentObstacle instanceof Wall) {
                        if(((Cat)currentObject).jump((Wall)currentObstacle)) {
                        }
                    }
                }
            } else if (currentObject instanceof Robot) {
                for (Object currentObstacle : obstacle) {
                    if (currentObstacle instanceof Track) {
                        ((Robot) currentObject).run((Track) currentObstacle);
                        continue;
                    } else if(currentObstacle instanceof Wall) {
                        ((Robot)currentObject).jump((Wall)currentObstacle);
                        continue;
                    }
                }
            }
        }
    }
}