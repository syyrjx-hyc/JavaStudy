package Polymorphism;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Creating "+this);
    }
    public void addRef() {refcount++;}
    protected void finalize() {
        if(refcount > 0)
            System.out.println("Error: " + refcount + " Shared " + id + " objects in use");
    }
    protected void dispose() {
        if (--refcount==0) {
            System.out.println("Disposing "+this);
        }
    }
    @Override public String toString() {
        return "Shared "+id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Creating "+this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("Disposing "+this);
        shared.dispose();
    }
    @Override public String toString() { return "Composing "+id; }
}

public class Exe8_13 {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] c = {new Composing(shared),new Composing(shared),new Composing(shared)
        ,new Composing(shared),new Composing(shared)};
        for (Composing cp:c) {
            cp.dispose();
        }
        Composing compTest = new Composing(shared);
        Composing compTest2 = new Composing(shared);
        // Test finalize():
        shared.finalize();
        Shared sharedTest = new Shared();
        Composing compTest3 = new Composing(sharedTest);
        // Test sharedTest finalize():
        compTest3.dispose();
        sharedTest.finalize();
    }
}
