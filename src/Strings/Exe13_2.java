package Strings;

import java.util.ArrayList;

public class Exe13_2 {
    @Override
    public String toString() {
        return "ID: "+super.toString();
    }

    public static void main(String[] args) {
        ArrayList<Exe13_2> a = new ArrayList<Exe13_2>();
        for (int i=0;i<10;i++) {
            a.add(new Exe13_2());
        }
        System.out.println(a);
    }
}
