package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Fruit {
    Fruit f;
}
class Apple extends Fruit {}
class Fuji extends Apple {}
class Small extends Apple {}
class Orange extends Fruit {}

class Holder<T> {
    List<? extends Fruit> list;
//    void add(T i) {
//        list.add(i);
//    }
}

public class Test3 {
    public static void main(String[] args) {
        Fruit f = Fruit.class.cast(new Orange());
        ArrayList<Integer> ai = new ArrayList<>();
        Class type = getaClass(ai);
        System.out.println();
        Holder h = new Holder();
        h.list = new ArrayList<>(Arrays.asList(new Orange(), new Apple()));
        System.out.println(h.list.getClass());
        System.out.println(h.list.get(0).getClass());
        System.out.println(h.list.get(1).getClass());
        h.list = new ArrayList<String>();
        System.out.println(h.list.getClass());
//        System.out.println(h.list.get(0).getClass());
    }

    private static Class<? extends ArrayList> getaClass(ArrayList<Integer> ai) {
        return ai.getClass();
    }
}
