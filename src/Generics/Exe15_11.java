package Generics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class New {
    public static <X ,Y> Map<X ,Y> map() {
        return new HashMap<>();
    }

    public static <T> List<T> list() {
        return new ArrayList<>();
    }
}

class A { public String toString() { return "A"; } }

class B { public String toString() { return "B"; } }

class C extends B { public String toString() { return "C"; }}

public class Exe15_11 {
    public static void f(Map<A, List<? extends B>> map) { }

    public static void main(String[] args) {
        List<B> lb = New.<B>list();
        lb.add(new C());
        System.out.println(lb);
        Map<A, List<B>> m = New.map();
        m.put(new A(),lb);
        System.out.println(m);

        f(New.map());
    }
}
