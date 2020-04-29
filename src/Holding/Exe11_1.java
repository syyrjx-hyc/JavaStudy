package Holding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Gerbil{
    private final int gerbilNumber = count++;
    private static int count = 0;
    public void hop() {
        System.out.println("I'm the "+gerbilNumber+" gerbil. Jumping...");
    }
}

public class Exe11_1 {
    public static void main(String[] args) {
        Set<Gerbil> gerbils = new LinkedHashSet<Gerbil>();
        for (int i=0;i<10;i++) {
            Gerbil g = new Gerbil();
            System.out.println(g+" ");
            gerbils.add(g);
        }

        for (Gerbil g:gerbils) {
            System.out.print(g+" ");
            g.hop();
        }
    }

}
