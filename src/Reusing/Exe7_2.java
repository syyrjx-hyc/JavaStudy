package Reusing;

class Cleanser {
    private int len = 7;
    private String c = "Cleanser";
    public void append(String s) {
        this.c+=" "+s;
    }
    public void scrub() {
        append("scrub");
    }
    public void apply() {
        append("apply");
    }
    public String toString() {
        return this.c;
    }
    public static void main(String[] args) {
        Cleanser cl = new Cleanser();
        cl.scrub(); cl.apply();
        System.out.println(cl);
    }

}

class Detergent extends Cleanser {
    public void scrub() {
        append("Detergent scrub");
    }
    public void foam() {
        append("foam");
    }

    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.scrub(); d.foam();
        System.out.println(d);
        Cleanser.main(args);
    }
}

public class Exe7_2 extends Detergent {
    public void scrub() {
        append("Exe7_2 scrub");
    }
    public void sterilize() {
        append("sterilize");
    }

    public static void main(String[] args) {
        Exe7_2 e = new Exe7_2();
        e.scrub(); e.sterilize();
        System.out.println(e);
        Detergent.main(args);
        Cleanser.main(args);
    }
}
