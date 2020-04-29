package Polymorphism;

class Cycle {
    String name = "Cycle";
    @Override
    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {
    { name = "Unicycle"; }
//    @Override
//    public String toString() {
//        return this.name;
//    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";
}

class Tricycle extends Cycle {
    private String name = "Tricycle";
}

public class Exe8_1 {
    public static void checkRun(Cycle c) {
        System.out.println(c);
    }

//    public static void checkRun(Unicycle c) {
//        System.out.println(c);
//    }

    public static void main(String[] args) {
        Unicycle c1 = new Unicycle();
        Bicycle c2 = new Bicycle();
        Tricycle c3 = new Tricycle();
        Exe8_1.checkRun(c1);
        Exe8_1.checkRun(c2);
        Exe8_1.checkRun(c3);
    }
}
