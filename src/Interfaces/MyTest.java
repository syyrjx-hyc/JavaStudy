package Interfaces;


import java.util.Random;

interface Test{
     Random RAND = new Random();
     int i = RAND.nextInt();

}

public class MyTest implements Test {
    public static void main(String[] args) {
        System.out.println(i);

    }
}
