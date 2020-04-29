package Reusing;

class Amphibian {
    void sleep () {
        System.out.println("Amphibian sleeping");
    }
    void eat(Amphibian a) {
        System.out.println("Amphibian eating");
    }
}

public class Exe7_16 extends Amphibian {
    void sleep() {
        System.out.println("Frog sleeping");
    }
    void eat(Amphibian f) {
        System.out.println("Frog eating");
    }
    public static void main(String[] args) {
        Exe7_16 e = new Exe7_16();
        e.sleep();
        e.eat(e);
        Amphibian a = new Amphibian();
        e.eat(a);
        a.eat(e);
        a.sleep();
    }
}
