import java.util.Random;

public class RandomManager {
    static Random rand = new Random();
    public static int getRandomHeight(){
        return rand.nextInt(220 - 150 + 1) + 150;
    }
    public static int getRandomNumberOfShows(){
        return rand.nextInt(40 - 1 + 1) + 1;
    }
    public static int getRandomChoirSize(){
        return rand.nextInt(100 - 50 + 1) + 50;
    }
}
