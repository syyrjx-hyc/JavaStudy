package Reusing;

class A2 {
    A2(char c, int i) { System.out.println("A("+c+" "+i+")"); }
}

class B2 extends A2 {
    B2(String s, float f){
        super(' ', 0);
        System.out.println("B("+s+" "+f+")");
    }
}

public class Exe7_7 extends A2 {
    private char c;
    private int i;
    Exe7_7(char a, int j) {
        super(a, j);
        c = a;
        i = j;
    }
    B2 b = new B2("hi", 1f); // will then construct another A and then a B
    public static void main(String[] args) {
        Exe7_7 c = new Exe7_7('b', 2); // will construct an A first
    }
}
