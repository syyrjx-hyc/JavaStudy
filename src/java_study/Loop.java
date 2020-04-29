package java_study;

public class Loop {
    public static void main(String[] args) {

        for (char c:"Hello World".toCharArray()) {
            System.out.println(c+"_");
        }

        double d[] = new double[10];
        for (int i=0;i<10;i++) {
            d[i] = Math.random();
        }

        for (double x:d) {
            System.out.println(x);
        }

        int i= 0;
        while (i<10) {
            System.out.println(++i+" ");
        }

        }
    }
