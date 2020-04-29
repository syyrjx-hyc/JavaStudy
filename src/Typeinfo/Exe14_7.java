package Typeinfo;

class Candy {
    static {
        System.out.println("Loading Candy"); }
}

class Gum {
    static { System.out.println("Loading Gum"); }
}

class Cookie {
    static { System.out.println("Loading Cookie"); }
}


public class Exe14_7 {
    public static void main(String[] args) {
        if (args.length<1) {
            System.out.println("Usage: Java Exe14_7 ");
            System.exit(0);
        }
        try {
            Class c = Class.forName(args[0]);
            System.out.println(c.getSimpleName());
        } catch (ClassNotFoundException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
