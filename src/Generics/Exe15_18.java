package Generics;

import java.util.*;

class BigFish {
    private static int count = 0;
    private final int id = count++;
    private BigFish() {}
    @Override public String toString() {
        return "BigFish" + id;
    }
    public static Generator<BigFish> create() {
        return new Generator<BigFish>() {
            @Override public BigFish next() {
                return new BigFish();
            }
        };
    }
}

class SmallFish {
    private static int count = 0;
    private final int id = count++;
    private SmallFish() {}
    @Override public String toString() {
        return "SmallFish" + id;
    }
    public static Generator<SmallFish> create() {
        return new Generator<SmallFish>() {
            @Override public SmallFish next() {
                return new SmallFish();
            }
        };
    }
}

public class Exe15_18 {
    private static Random rand = new Random(2);
    public static void prey(BigFish bf, SmallFish sf) {
        System.out.println(bf+" eating "+sf);
    }
    public static void main(String[] args) {
        List<BigFish> qbf = new ArrayList<>();
        List<SmallFish> lsf = new ArrayList<>();
        Exe15_13.fill(qbf,BigFish.create(),6);
        Exe15_13.fill(lsf,SmallFish.create(),23);
        for (SmallFish sf:lsf) {
            prey(qbf.get(rand.nextInt(qbf.size())),sf);
        }
    }
}
