package Exceptions;

import java.util.Random;

class Exception22 extends Exception {}

public class Exe12_22 {
    private Random rand = new Random();
    private int index;
    Exe12_22() throws Exception22 {
        index = rand.nextInt(20);
        System.out.println("Produce random int: "+index);
        if (index>10) {
            try {
                throw new Exception22();
            } catch (Exception22 e) {
                System.out.println("Construction failed");
                e.printStackTrace();
            } finally {
                index -= 10;
            }
        } else {
            System.out.println("Constructed successfully");
        }
    }

    public static void main(String[] args) throws Exception22 {
        Exe12_22 ex = new Exe12_22();
        System.out.println("End");
    }
}
