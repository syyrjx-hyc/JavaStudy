package Normal;

interface Leg {
    String walk(String s);
    default void show() {
        System.out.println(getClass());
    }
}

public class Test {
    static void f() {}
    static String g(String s) {return s+"b";}
    public static void main(String[] args) {
        Leg l = s -> {
            System.out.println("walking "+s);
            return s+"a";
        };
        String b = l.walk("a");
        System.out.println(b);

        Leg l2 =Test::g;
        String b2 = l2.walk("a");
        System.out.println(b2);
        l2.show();
    }
}
