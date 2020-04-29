package Reusing;
class A23 {
    static int j = printInit("A.j initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 1;
    }
    A23() { System.out.println("A() constructor"); }
}

class B23 extends A23 {
    static int k = printInit("B.k initialized");
    B23() { System.out.println("B() constructor"); }
}

class C23 {
    static int n = printInitC("C.n initialized");
    static A23 a = new A23();
    C23() { System.out.println("C() constructor"); }
    static int printInitC(String s) {
        System.out.println(s);
        return 1;
    }
}

class D23 {
    D23() { System.out.println("D() constructor"); }
}

public class Exe7_23 extends B23 {
    static int i = printInit("Exe7_23.i initialized");
    Exe7_23() { System.out.println("Exe7_23() constructor"); }
    public static void main(String[] args) {
        // accessing static main causes loading (and initialization)
        // of A, B, & Exe7_23
        System.out.println("hi");
        // call constructors from loaded classes:
        Exe7_23 lc = new Exe7_23();
        // call to static field loads & initializes C:
        System.out.println(C23.a);
        // call to constructor loads D:
        D23 d = new D23();
    }
}