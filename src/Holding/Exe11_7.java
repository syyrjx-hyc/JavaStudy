package Holding;

import java.util.*;

class Banana {
    private static int count;
    private int id=count++;
    Banana() {
        System.out.println("id="+id);
    }

    @Override
    public String toString() {
        return "Banana{" +
                "id=" + id +
                '}';
    }
}

public class Exe11_7 {
    public static void main(String[] args) {
        Banana[] b = new Banana[5];
        for (int i=0;i<b.length;i++) {
            b[i] = new Banana();
        }
        List<Banana> l = new ArrayList<Banana>(Arrays.asList(b));
        System.out.println(l);
        List<Banana> sub = l.subList(1,3);
        sub.clear();
        System.out.println(l);

        Iterator<Banana> it = l.iterator();
        System.out.println(it);
        it.next();
        System.out.println(it);
        it.remove();
        System.out.println(l);
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        System.out.println(it.next());
    }
}
