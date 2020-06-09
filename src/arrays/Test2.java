package arrays;

import java.util.Arrays;

public class Test2<T> {
    public static void main(String[] args) {
        int[] ia = new int[2];
        System.out.println(ia[0]);
        Object[] oa = new Object[2];
        oa[0] = 1;
        System.out.println(oa[0].getClass());
    }
}
