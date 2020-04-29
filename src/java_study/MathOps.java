package java_study;

import java.util.*;

public class MathOps {
    static int i,j,k;
    public static void main(String[] args) {
        Random rand = new Random(47);

        j = rand.nextInt(1000)+1;
        k = rand.nextInt(1000)+1;
        System.out.println("i:"+i+" j:"+j+" k:"+k);

        i = j+k;
        System.out.println(i);

        j %= k;
        System.out.println(j);
    }
}
