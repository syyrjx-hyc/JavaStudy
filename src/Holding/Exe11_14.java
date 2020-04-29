package Holding;

import java.util.LinkedList;
import java.util.ListIterator;

public class Exe11_14 {
    public static void main(String[] args) {
        Integer[] a = new Integer[] {0,1,2,3,4,5,6,7,8,9};

        LinkedList<Integer> l = new LinkedList<Integer>();

        for (Integer i: a) {
            ListIterator<Integer> it = l.listIterator(l.size()/2);
            it.add(i);
            System.out.println(l);
        }
    }
}
