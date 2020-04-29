package Typeinfo;

import java.util.Arrays;

public class Exe14_10 {
    public static void printInfo(Object c) {
        System.out.println(c.getClass().getName());
        System.out.println(c.getClass().getSimpleName());
        System.out.println(c.getClass().getCanonicalName());
        System.out.println(c.getClass().getSuperclass());
        System.out.println(Arrays.toString(c.getClass().getDeclaredFields()));
        System.out.println(c instanceof Object);
    }

    public static void main(String[] args) {
        char[] c = new char[12];
        char c2 = '2';
        printInfo(c);
        printInfo(c2);
    }
}
