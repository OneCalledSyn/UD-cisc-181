import java.util.Random;

public class GuessingGame {
    public static void main (String[] args) {
        System.out.println("while " + whileGuess(72));
        System.out.println("Rec " + recGuess(42));
        System.out.println("for " + forGuess(27));
    }

    public static int whileGuess (int g) {
        Random r = new Random();
        int counter = 1;
        int x = r.nextInt(100);
        while (x != g) {
            x = r.nextInt(100);
            counter++;
        }
        return counter;
    }

    public static int recGuess(int g) {
        Random r = new Random();
        int x = r.nextInt(100);
        if (x == g) {
            return (1);
        }
        else {
            return (1+recGuess(g));
        }
    }

    public static int forGuess(int g) {
        Random r = new Random();
        int count = 1;
        for (int x = r.nextInt(100); x != g; x = r.nextInt(100), count++);
        return count;
    }
}