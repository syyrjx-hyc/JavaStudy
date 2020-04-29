package Interfaces;

abstract class Dad4{
}

class Son4 extends Dad4 {
    protected void print() { System.out.println("Son"); }
}

abstract class SecondDad4 {
    private String name = "second dad";
    abstract protected void print();
}

class SecondSon4 extends SecondDad4 {
    protected void print() { System.out.println("SecondSon"); }
}

public class Exe9_4 {
    public static void testPrint(Dad4 d) {
        ((Son4) d).print();
    }
    public static void secondPrint(SecondDad4 d) {
        d.print();
    }

    public static void main(String[] args) {
        Dad4 s = new Son4();
        SecondSon4 ss = new SecondSon4();
        testPrint(s);
        secondPrint(ss);
    }
}
