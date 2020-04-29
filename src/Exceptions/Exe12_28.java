package Exceptions;

class Exception28 extends RuntimeException{
    private String exception;
    Exception28(String message) {
        super(message);
        this.exception = message;
        System.out.println("Exception4 detected");
    }
    public void showException() {
        System.out.println(this.exception);
    }
}

public class Exe12_28 {
    public static void f() throws Exception28{
        System.out.println("In f()");
        throw new Exception28("f() was wrong");
    }

    public static void main(String[] args) {
        f();
    }
}
