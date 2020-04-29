package Typeinfo;

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; }
}

public class Exe14_3 {
    public static void rotate(Shape s) {
        if (!(s instanceof Circle)) {
            System.out.println(s+" has been rotated...");
        } else {
            System.out.println("A circle can not be rotated!");
        }
    }

    public static void main(String[] args) {
        Rhomboid r = new Rhomboid();
        Shape s = (Shape) r;
        System.out.println(s instanceof Shape);
        System.out.println(r instanceof Shape);
        System.out.println(s instanceof Rhomboid);
        s.draw();
        Rhomboid r2 = (Rhomboid) s;
        r2.draw();
        System.out.println(r==r2);
        try {
            Circle c = (Circle) s;
        } catch (ClassCastException e) {
            System.out.println("Casting failed");
            e.printStackTrace(System.out);
        }

        Circle c2 = new Circle();
        rotate(c2);
    }
}
