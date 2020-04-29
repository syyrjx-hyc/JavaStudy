package InnerClasses;
import java.util.Arrays;
import java.util.Random;

interface ThrowGames {
    int[] throwNum(int times);
}

interface GameFactory {
    ThrowGames getGame();
}

class Coin implements ThrowGames {
    private int[] results;
    private Random rand = new Random();
    @Override
    public int[] throwNum(int times) {
        results = new int[times];
        for (int x=0;x<times;x++) {
            results[x] = rand.nextInt(2);
        }
        return results;
    }
    public static GameFactory factoryGenerator() {
        return new GameFactory() {
            @Override
            public ThrowGames getGame() {
                return new Coin();
            }
        };
    }
}


class Dice implements ThrowGames {
    private int[] results;
    private Random rand = new Random();
    @Override
    public int[] throwNum(int times) {
        results = new int[times];
        for (int x=0;x<times;x++) {
            results[x] = rand.nextInt(6);
        }
        return results;
    }
    public static GameFactory factoryGenerator() {
        return new GameFactory() {
            @Override
            public ThrowGames getGame() {
                return new Dice();
            }
        };
    }
}

public class Exe10_17 {
    public static void throwing(GameFactory gf, int times) {
        ThrowGames tg = gf.getGame();
        int[] finalResults = tg.throwNum(times);
        System.out.println(Arrays.toString(finalResults));
    }

    public static void main(String[] args) {
        throwing(Coin.factoryGenerator(), 8);
        throwing(Dice.factoryGenerator(), 16);
    }
}

