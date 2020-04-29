package Exceptions;

class Exception4 extends Exception{
    private String exception;
    Exception4(String message) {
        super(message);
        this.exception = message;
        System.out.println("Exception4 detected");
    }
    public void showException() {
        System.out.println(this.exception);
    }
}

public class Exe12_4 {
    public static void f() throws Exception4{
        System.out.println("In f()");
        throw new Exception4("f() was wrong");
    }

    public static void main(String[] args) {
        try{
            f();
        } catch (Exception4 e) {
            e.showException();
            e.printStackTrace(System.out);
            System.out.println("wrong end");
        } finally {
            System.out.println("Exit exception");
        }
    }
}
