package java_study;

class Hello {
    public Hello() {
        System.out.println("Hello constructor");
    }
    protected void print1() {
        System.out.println("hello1");
    }
}

public class HelloWorld {
    Hello h = new Hello();
    protected void print2() {
        h.print1();
        System.out.println("hello2");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        HelloWorld hw = new HelloWorld();
        hw.print2();

    }
}