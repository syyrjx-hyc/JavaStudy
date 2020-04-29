package Exceptions;

class Exception10 extends Exception{
    Exception10(String msg) {super(msg);}
}

public class Exe12_10 {

    public static void f() throws Exception {
        System.out.println("This is f()");
        throw new Exception10("Exception from f()");
    }
    public static void g() throws Exception {

        try {
            System.out.println("This is g()");
            f();
        } catch (Exception e) {
            System.out.println("In g()");
            e.printStackTrace(System.out);
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        try{
            System.out.println("This is main");
            g();
        } catch (Exception e) {
            System.out.println("In main");
            e.printStackTrace(System.out);
        }
    }

}
