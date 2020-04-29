package Holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Exe11_2 {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<Integer>();
        for (int i=0;i<10;i++) {
            c.add(i);
            c.add(i-1);
        }
        for (int i:c) {
            System.out.print(i+" ");
        }
    }
}
