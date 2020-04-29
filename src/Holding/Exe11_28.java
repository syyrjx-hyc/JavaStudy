package Holding;

import java.util.*;

class Apple{}

public class Exe11_28 {
    public static void main(String[] args) {
        Random rand = new Random();
        PriorityQueue<Double> d = new PriorityQueue<Double>();
        for(int i = 0; i < 10; i++)
            d.offer(rand.nextDouble() * i);
        while(d.peek() != null)
            System.out.print(d.poll() + " ");

        PriorityQueue<Apple> a = new PriorityQueue<Apple>();
        a.offer(new Apple());
        a.offer(new Apple());
    }
}
