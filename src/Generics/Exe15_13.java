package Generics;

import java.util.*;

public class Exe15_13 {
    public static <T> Collection<T> fill(Collection<T> collection, Generator<T> generator, int n) {
        System.out.println("1:"+collection.getClass().getSimpleName());
        for (int index=0;index<n;index++) { collection.add(generator.next()); } return collection;
    }
    public static <T> List<T> fill(List<T> collection, Generator<T> generator, int n) {
        System.out.println("2:"+collection.getClass().getSimpleName());
        for (int index=0;index<n;index++) { collection.add(generator.next()); } return collection;
    }
    public static <T> LinkedList<T> fill(LinkedList<T> collection, Generator<T> generator, int n) {
        System.out.println("3:"+collection.getClass().getSimpleName());
        for (int index=0;index<n;index++) { collection.add(generator.next()); } return collection;
    }
    public static <T> Set<T> fill(Set<T> collection, Generator<T> generator, int n) {
        System.out.println("4:"+collection.getClass().getSimpleName());
        for (int index=0;index<n;index++) { collection.add(generator.next()); } return collection;
    }
    public static <T> Queue<T> fill(Queue<T> collection, Generator<T> generator, int n) {
        System.out.println("5:"+collection.getClass().getSimpleName());
        for (int index=0;index<n;index++) { collection.add(generator.next()); } return collection;
    }

    public static void main(String[] args) {
        Collection<Integer> c1 = fill(new ArrayList<>(), new Exe15_7(), 12);
        Collection<Integer> c2 = fill(new LinkedList<>(), new Exe15_7(), 12);
        Collection<Integer> c3 = fill(new HashSet<>(), new Exe15_7(), 12);
        Collection<Integer> c4 = fill(new PriorityQueue<>(), new Exe15_7(), 12);
    }
}
