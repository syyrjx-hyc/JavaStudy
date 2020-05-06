package Generics;

import java.util.Iterator;

interface Generator<T> {
    T next();
}

public class Exe15_7 implements Generator<Integer>, Iterable<Integer>{
    private int count = 0;
    private int size;
    private int calFib(int i) {
        if (i<2) return 1;
        return calFib(i-1)+calFib(i-2);
    }
    public Integer next() {
        return calFib(count++);
    }
    public Exe15_7() {}
    public Exe15_7(int x) {this.size = x;}

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() { return size > 0; }
            public Integer next() {
                size--;
                return Exe15_7.this.next();
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        Exe15_7 e = new Exe15_7(12);
        for (int i:e) {
            System.out.print(i+" ");
        }
        System.out.println();
        Exe15_7 e2 = new Exe15_7(13);
        Iterator<Integer> it = e2.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        for (int j:new Exe15_7(14)) {
            System.out.print(j+" ");
        }
    }
}
