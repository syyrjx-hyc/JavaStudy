package Typeinfo;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface Materials {}

class M {
    M() {}
}

class Toy extends M {
    public Toy() {
        System.out.println("Default constructor");
    }
    public Toy(int i) {
        System.out.println("NonDefault constructor");
    }
    public void print() {
        System.out.println("A toy walking");
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Materials {
    FancyToy() { super(1); }
}

public class Exe14_1 {
    static void printInfo(Class cc) {
        System.out.println("Class name: "+cc.getName()+" is Interface: "+cc.isInterface());
        System.out.println("Class: "+cc.getClass());
        System.out.println("Simple name: "+cc.getSimpleName());
        System.out.println("Canonical name: "+cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Typeinfo.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            System.exit(1);
            e.printStackTrace(System.out);
        }
        printInfo(c);

        for (Class face:c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(obj.getClass());
    }
}
