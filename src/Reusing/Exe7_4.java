package Reusing;
class A { A(int i){ System.out.println("A()"); } }

class B extends A { B(int i){ super(i); System.out.println("B()");} }

public class Exe7_4 extends B {
    Exe7_4(int i) {
        super(i);
        System.out.println("C()");
    }
    public static void main(String[] args) {
        Exe7_4 e = new Exe7_4(4);
    }
}

