package Holding;

import java.util.*;

public class Exe11_12 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        for (int i=0;i<10;i++) {
            l1.add(i);
        }
        System.out.println(l1);
        List<Integer> l2 = new ArrayList<Integer>();
        ListIterator<Integer> it1 = l1.listIterator(l1.size());
        while (it1.hasPrevious()) {
            l2.add(it1.previous());
        }
        System.out.println(l2);
    }

}
