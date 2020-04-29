package Exceptions;

class Apple{
    public void f() {}
}

public class MyTest {
    public static void main(String[] args) {
        int i;
        System.out.println(i=3);
        Apple a = null;
        try{
            a.f();
        } catch (NullPointerException r1) {

            r1.printStackTrace();//System.out
            System.out.println("Wrong1");
            try {
                a.f();
            } catch (NullPointerException r2) {
                r2.printStackTrace();
                System.out.println("Wrong2");
            } finally {
                System.out.println("Exit wrong2");
            }
        } finally {
            System.out.println("Exit wrong1");
        }
    }
}
