package Generics;

interface Move<T> {
    default void move() {
        System.out.println("interface move1");
    }
}

class Animal2 implements Move<Animal2> {
    public void move() {
        System.out.println("animal move");
    }
}

public class Test extends Animal2 {

    public void move() {
        new Inner().move();
    }

    static class Inner implements Move<Test> {

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.move();
    }

}