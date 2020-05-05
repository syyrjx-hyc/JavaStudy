package Generics;

class Pet{
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

class Dog extends Pet{}

class Cat extends Pet{}

class Holder1<T> {
    private T item;
    public Holder1(T item) {
        this.item = item;
    }
    public T get() {
        return this.item;
    }
    public void set(T item) {
        this.item = item;
    }
}

public class Exe15_1 {
    public static void main(String[] args) {
        Holder1<Pet> p = new Holder1<>(new Pet());
        System.out.println(p.get());
        p.set(new Dog());
        System.out.println(p.get());
        p.set(new Cat());
        System.out.println(p.get());
    }
}
