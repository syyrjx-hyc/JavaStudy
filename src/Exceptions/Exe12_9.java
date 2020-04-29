package Exceptions;

class Exception9A extends Exception {
    Exception9A(String msg) {
        super(msg);
    }
}

class Exception9B extends Exception {
    Exception9B(String msg) {
        super(msg);
    }
}

class Exception9C extends Exception {
    Exception9C(String msg) {
        super(msg);
    }
}

public class Exe12_9 {
    private static Integer[] x = new Integer[1];
    public static void f(int x) throws Exception{
        if (x<0) throw new Exception9A("AAA");
        if (x==0) throw new Exception9B("BBB");
        if (x>0) throw new Exception9C("CCC");
    }

    public static void main(String[] args) {
        try{
            f(x[0]);
            f(22);
            f(0);
            f(-1);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getClass().getName());
            System.out.println(e.getClass().getSimpleName());

            System.out.println(1);
            System.out.println("Out: "+e);
            System.err.println("Err: "+e);

            System.out.println(2);
            e.printStackTrace();
            e.printStackTrace(System.out);
        } finally {
            System.out.println("finally");
        }
    }
}
