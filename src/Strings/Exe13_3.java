package Strings;

import java.io.PrintStream;
import java.util.Formatter;

public class Exe13_3 {
    private String name;
    private Formatter f;
    public Exe13_3(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s is at (%d, %d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream ps = System.err;
        Exe13_3 e1 = new Exe13_3("E1",new Formatter(ps));
        Exe13_3 e2 = new Exe13_3("E2",new Formatter(System.out));
        e1.move(1,2);
        e2.move(2,3);
        e1.move(3,4);
        e2.move(4,5);
    }
}
