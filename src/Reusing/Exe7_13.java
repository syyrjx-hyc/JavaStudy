package Reusing;

class Overload1 {
    void method1(int i) {
        System.out.println("int");
    }
    void method1(String s) {
        System.out.println("String");
    }
    void method1(char c) {
        System.out.println("char");
    }
}

public class Exe7_13 extends Overload1{
    void method1(float f) {
        System.out.println("float");
    }

    public static void main(String[] args) {
        Exe7_13 e = new Exe7_13();
        e.method1(1);
        e.method1("1");
        e.method1('1');
        e.method1(1f);
    }
}
