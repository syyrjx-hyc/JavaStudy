package Generics;

import java.lang.reflect.InvocationTargetException;

class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;
    public BasicGenerator(Class<T> type) {
        this.type = type;
    }
    @Override public T next() {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}

class CountedObject {
    private static int count = 0;
    private final int id = count++;

    @Override
    public String toString() {
        return "CountedObject{" +
                "id=" + id +
                '}';
    }
}

public class Exe15_14 {
    public static void main(String[] args) {
        Generator<CountedObject> g = new BasicGenerator<>(CountedObject.class);
        for (int i=0;i<10;i++) {
            System.out.println(g.next());
        }
    }
}
