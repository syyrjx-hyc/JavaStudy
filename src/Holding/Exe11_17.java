package Holding;

import java.util.*;

class Gerbil17{
    private final int gerbilNumber = count++;
    private static int count = 0;
    public String name() {
        return "I'm the "+gerbilNumber+" gerbil";
    }
    public void hop() {
        System.out.println(gerbilNumber+"jumping...");
    }
}

public class Exe11_17 {
    public static void main(String[] args) {
        Map<String, Gerbil17> m = new HashMap<String, Gerbil17>();
        for (int i=0;i<10;i++) {
            Gerbil17 g = new Gerbil17();
            m.put(g.name(), g);
        }
        System.out.println(m.keySet());
        for (String key:m.keySet()) {
            System.out.println(key+":"+m.get(key));
            m.get(key).hop();
        }
    }

}
