package Generics;

class SixTuple<A,B,C,D,E,F>{
    public final A first;
    public final B second;
    public final C third;
    public final D fourth;
    public final E fifth;
    public final F sixth;
    public SixTuple(A a, B b, C c, D d, E e, F f) {
        first = a; second = b; third = c; fourth = d; fifth = e; sixth = f;
    }

    @Override
    public String toString() {
        return "SixTuple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth=" + fifth +
                ", sixth=" + sixth +
                '}';
    }
}

public class Exe15_3 {
    public static void main(String[] args) {
        SixTuple<Integer, Float, Double, String, Cat, Dog> st =
                new SixTuple<Integer, Float, Double, String, Cat, Dog>
                        (1,2f,3d,"4",new Cat(), new Dog());
        System.out.println(st);
    }
}
