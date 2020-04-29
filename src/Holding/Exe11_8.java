package Holding;

import java.util.*;

class Gerbil8{
    private final int gerbilNumber = count++;
    private static int count = 0;
    public void hop() {
        System.out.println("I'm the "+gerbilNumber+" gerbil. Jumping...");
    }
}

public class Exe11_8 {
    public static void display(Iterator<Gerbil8> it) {
        while (it.hasNext()) {
            it.next().hop();
        }
    }

    public static void main(String[] args) {
        Set<Gerbil8> gerbils = new LinkedHashSet<Gerbil8>();
        for (int i = 0; i < 10; i++) {
            Gerbil8 g = new Gerbil8();
            System.out.println(g + " ");
            gerbils.add(g);
        }
        display(gerbils.iterator());
    }
}

