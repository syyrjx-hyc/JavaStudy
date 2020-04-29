package Exceptions;

class Exception1 extends Exception{
    Exception1(String s) {
        super(s);
        System.out.println("Exception1");
    }
}

public class Exe12_1 {
    public static void f(int i) throws Exception1 {
        if (i<10) {
            System.out.println(i*10);
        }
        else {
            throw new Exception1("Integer too big");
        }
    }
    public static void main(String[] args) {
        int input = 15;
        while (true) {
            try {
                System.out.println("Input:"+input);
                f(input);
                break;
            } catch (Exception1 e) {
                input -= 1;
                e.printStackTrace(System.out);
                System.out.println("Input too big, minus one and try again");
            }
        }
    }
}
