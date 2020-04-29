package Strings;

public class Exe13_6 {
    private int a = 1;
    private long b = 2;
    private float c = 3;
    private double d = 4;

    @Override
    public String toString() {
        return String.format("%-4d%-4d%-6.2f%-6.2f",a,b,c,d);
    }

    public static void main(String[] args) {
        Exe13_6 e = new Exe13_6();
        System.out.println(e);
    }
}
