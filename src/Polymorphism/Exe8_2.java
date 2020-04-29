package Polymorphism;

import java.util.Random;

class Shape {
    public void draw() { System.out.println("Draw a shape"); }
    public void erase() { System.out.println("Erase a shape"); }
    public void pnt() { System.out.println("A shape"); }
}

class Circle extends Shape {
    @Override public void draw() { System.out.println("Draw a circle"); }
    @Override public void erase() { System.out.println("Erase a circle"); }
}

class Square extends Shape {
    @Override public void draw() { System.out.println("Draw a square"); }
    @Override public void erase() { System.out.println("Erase a square"); }
}

class RandomShapeGenerator {
    private Random rand = new Random(2);
    public Shape next() {
        switch (rand.nextInt(2)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
        }
    }
}

public class Exe8_2 {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i=0;i<s.length;i++) {
            s[i] = gen.next();
        }
        for (Shape sh:s) {
            sh.draw();
            sh.pnt();
        }
    }
}
