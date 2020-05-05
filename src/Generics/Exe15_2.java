package Generics;

class Pet2{
    private String name;
    public Pet2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class Exe15_2<T> {
    private T x1, x2, x3;
    public Exe15_2(T x1, T x2, T x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    @Override
    public String toString() {
        return "Exe15_2{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", x3=" + x3 +
                '}';
    }

    public static void main(String[] args) {
        Pet2 p1 = new Pet2("Dog1");
        Pet2 p2 = new Pet2("Dog2");
        Pet2 p3 = new Pet2("Dog3");
        Exe15_2<Pet2> p = new Exe15_2<>(p1, p2, p3);
        System.out.println(p);
    }
}
