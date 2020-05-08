package Generics;

import java.util.*;

class Animal<T> {
    void f() {}
}

enum Plant {
    TREE, GRASS, FLOWER
}

class MyTest{

//    static <T> Set<T> f(Set<T> l) {
//        if (l instanceof EnumSet) {
//            System.out.println("EnumSet");
//            return ((EnumSet<T>) l).clone();
//        }
//        else {
//            System.out.println("Not EnumSet");
//            return l;
//        }
//    }
//
//    static Set<Plant> g(Set<Plant> l) {
//        if (l instanceof EnumSet) {
//            System.out.println("EnumSet");
//            return ((EnumSet<Plant>) l).clone();
//        }
//        else {
//            System.out.println("Not EnumSet");
//            return l;
//        }
//    }



    public static void main(String[] args) {

        Animal<Plant>[] a = new Animal[3];

        Set<Plant> pl = EnumSet.range(Plant.TREE,Plant.GRASS);

        List<?> l = new ArrayList<>(Arrays.asList(new Animal(), Plant.GRASS));
        for (Object o:l) {
            ((Animal) o).f();
        }
        System.out.println(Arrays.toString(l.getClass().getTypeParameters()));
    }
}
