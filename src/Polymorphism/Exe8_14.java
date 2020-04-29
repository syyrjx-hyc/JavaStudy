package Polymorphism;

import java.util.Random;

class Shared2 {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared2() {
        System.out.println("Creating " + this);
    }
    public void addRef() {
        refcount++;
    }
    public String toString() {
        return "Shared " + id;
    }
    public void showRefcount() {
        System.out.println("refcount = " + refcount);
    }
}

class RandomRodentGenerator {
    protected Shared2 shared = new Shared2();
	private Random rand = new Random();
	public Rodent next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Mouse(shared);
			case 1: return new Rat(shared);
			case 2: return new Squirrel(shared);
		}
	}
}

class Rodent {
    private Shared2 shared;
    private String name = "Rodent";
    Rodent(Shared2 shared) {
        System.out.println("Rodent()");
        this.shared = shared;
        shared.addRef();
    }
    public String toString() { return name; }
}

class Mouse extends Rodent {
    private String name = "Mouse";
    Mouse(Shared2 shared) { super(shared); System.out.println("Mouse()"); }
    public String toString() { return name; }
}

class Rat extends Rodent {
    private String name = "Rat";
    Rat(Shared2 shared) { super(shared); System.out.println("Rat()"); }
    public String toString() { return name; }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";
    Squirrel(Shared2 shared) { super(shared); System.out.println("Squirrel()"); }
    public String toString() { return name; }
}

public class Exe8_14 {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for(Rodent r : rodents) {
            r = gen.next();
            System.out.println(r);
        }
        gen.shared.showRefcount();
    }
}
