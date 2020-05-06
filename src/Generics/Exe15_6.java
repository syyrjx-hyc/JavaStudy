package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Exe15_6<T> {
    private List<T> l = new ArrayList<>();
    private Random rand = new Random(1);
    void select() {
        System.out.print(l.get(rand.nextInt(l.size()))+"_");
    }

    public static void main(String[] args) {
        Exe15_6<Integer> e = new Exe15_6<>();
        for (int x=0;x<20;x++) {
            e.l.add(x);
        }
        for (int s=0;s<20;s++) {
            e.select();
        }
        System.out.println();
        Exe15_6<Character> e2 = new Exe15_6<>();
        for (Character c:"Hello World!".toCharArray()) {
            e2.l.add(c);
        }
        for (int s=0;s<20;s++) {
            e2.select();
        }
    }
}
