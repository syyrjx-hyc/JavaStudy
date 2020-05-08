package Generics;

import java.util.Arrays;

public class GenericArray<T> {
    private T[] array;
    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }
    public void set(int index, T item) {
        array[index] = item;
    }
    public T get(int index) {
        return array[index];
    }
    public T[] replicate() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(4);
        System.out.println(Arrays.toString(gai.array));

//        Integer[] oa = gai.replicate();
        Object[] ia = gai.replicate();
        System.out.println(Arrays.toString(ia));

        gai.set(0,1);
        System.out.println(Arrays.toString(gai.array));
        System.out.println(Arrays.toString(ia));

        System.out.println(gai.get(0));

//        System.out.println(gai.array[0]);

//        gai.array[1] = 3;

    }
}
