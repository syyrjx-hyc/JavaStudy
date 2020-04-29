package Strings;

import java.util.Scanner;

public class Exe13_20 {
    private int i;
    private long l;
    private float f;
    private double d;
    private String s;
    Exe13_20 (String msg) {
        Scanner sc = new Scanner(msg);
        this.i = sc.nextInt();
        this.l = sc.nextLong();
        this.f = sc.nextFloat();
        this.d = sc.nextDouble();
        this.s = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Exe13_20{" +
                "i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Exe13_20 e = new Exe13_20("1 2 3 4 555 qqq\n sss");
        System.out.println(e);
    }
}
