package Reusing;

class Test1 {
    static void pnt1(Test1 t) {
        System.out.println("test1");
    }
}

class Test2 extends Test1 {
    static void pnt1(Test2 t) {
        System.out.println("test2");
    }
}

public class MyTest extends Test2 {
    static void pnt1(MyTest t) {
        System.out.println("test3");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        MyTest t3 = new MyTest();
        Test1.pnt1(t3);
        Test2.pnt1(t1);
        MyTest.pnt1(t1);
    }
}