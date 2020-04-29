package Typeinfo;

class InitSeq{
    static final int i1 = 1;
    static int i2 = 2;
    static InitSeq s;
    static {
        s = new InitSeq();
        System.out.println("Static block");
    }
    {
        System.out.println("NonStatic block");
    }
    final static void printFinalStatic() {
        System.out.println("Final Static Method");
    }
    static void printStatic() {
        System.out.println("Static method");
    }
    void printNonStatic() {
        System.out.println("NonStatic method");
    }
    InitSeq() {
        System.out.println("Constructor");
    }
}

public class InitializationOrder {
    public static void main(String[] args) {
        System.out.println(InitSeq.i2);
//        InitSeq.printStatic();

//        try {
//            Class s = Class.forName("Typeinfo.InitSeq");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        InitSeq.printFinalStatic();
//        System.out.println(InitSeq.i1);
//        InitSeq1 i = new InitSeq1();
    }
}