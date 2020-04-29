package Holding;

import java.util.*;

class MovieGenerator {
    private int index;
    public String next() {
        switch (index) {
            case 0: index++; return "movie1";
            case 1: index++; return "movie2";
            case 2: index=0; return "movie3";
            default: return "";
        }
    }
    public void fillArray(String[] a) {
        for (int i=0;i<a.length;i++) {
            a[i] = next();
        }
    }
    public Collection<String> fillCollection(Collection<String> c, int l) {
        for (int i=0;i<l;i++) {
            c.add(next());
        }
        return c;
    }
}

public class Exe11_4 {
    public static void main(String[] args) {
        MovieGenerator mg = new MovieGenerator();

        String[] a = new String[10];
        mg.fillArray(a);
        System.out.println(Arrays.toString(a));

        System.out.println(mg.fillCollection(new ArrayList<String>(),10));
        System.out.println(mg.fillCollection(new LinkedList<String>(),10));
        System.out.println(mg.fillCollection(new HashSet<String>(), 10));
        System.out.println(mg.fillCollection(new TreeSet<String>(), 10));
        System.out.println(mg.fillCollection(new LinkedHashSet<String>(), 10));
    }
}
