package Holding;

import java.util.*;

public class Exe11_11 {
    public static void display(Collection c) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        List<Integer> i = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        display(i);
    }

}
