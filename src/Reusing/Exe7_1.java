package Reusing;


class DelayedInit {
    private String s;
    DelayedInit () {
        System.out.println("delay constructor");
        s = "delayed";
    }
    public String toString() {
        return s;
    }
}

public class Exe7_1 {
    private int i;
    private DelayedInit d;

    public String toString() {
        if (d==null) {
            d = new DelayedInit();
        }
        return i+" "+d;
    }

    public static void main(String[] args) {
        Exe7_1 e = new Exe7_1();
        System.out.println(e);
    }
}
