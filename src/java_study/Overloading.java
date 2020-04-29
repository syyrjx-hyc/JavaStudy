package java_study;

class Dog{
    void bark() {
        System.out.println("sleeping...");
    }

    void bark(byte i, int j) {
        System.out.println("barking!");
    }

    void bark(int i, byte j) {
        System.out.println("howling!");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Dog p = new Dog();
        long x = 1L;
        p.bark();
        p.bark((byte)x, (int)x);
        p.bark((int)x, (byte)x);
    }
}
