package java_study;

import java.util.Random;

public class BinaryTest {

    static void Print(String args) {
        System.out.println(args);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        int x = 2147483647;
        int y = -2147483648;
        System.out.println("i:"+i+" j:"+j);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(j));
        System.out.println(Integer.toBinaryString(i^j));
        System.out.println("x:"+x+" y:"+y);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        Print("aa");
    }
}
/*
10111010001001000100001010010101
01100110010110110000010100010110
11011100011111110100011110000011

*/
