package Interfaces;

abstract class Nogo1 {
    Nogo1() { print(); System.out.println("Nogo1()"); }
    abstract void print();
}


class Go1 extends Nogo1 {
    private int i = 3;
    Go1() { System.out.println("Go1()"); }
    @Override protected void print() {
        System.out.println(i);
    }
}

public class Exe9_2 {
    public static void main(String[] args) {
        Go1 g = new Go1();
        g.print();
    }
}
