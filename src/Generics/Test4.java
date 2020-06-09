package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void f(List l) {
        l.add("a");
    }
    public static void main(String[] args) {
        List<? extends Integer> li = new ArrayList<>();

        f(li);
        System.out.println(li);
    }
}
