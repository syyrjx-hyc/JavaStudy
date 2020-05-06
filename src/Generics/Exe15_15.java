package Generics;

class Tuple {
    public static <A,B,C,D,E,F> SixTuple<A,B,C,D,E,F> tuple(A a, B b, C c, D d, E e, F f) {
        return new SixTuple<>(a,b,c,d,e,f);
    }
}

public class Exe15_15 {
    static SixTuple<Integer, Float, Double, String, Cat, Dog> f() {
        return new SixTuple<>(1, 2f, 3d, "4", new Cat(), new Dog());
    }
    static SixTuple f2() {
        return new SixTuple(1, 2f, 3d, "4", new Cat(), new Dog());
    }

    public static void main(String[] args) {
        SixTuple<Integer, Float, Double, String, Cat, Dog> st1 = f();
        SixTuple<Integer, Float, Double, String, Cat, Dog> st2 = f2();
    }
}
