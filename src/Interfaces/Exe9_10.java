package Interfaces;

import static TestPackage.PrintMethods.*;

enum Note {
    MIDDLE_C, HIGH_G;
}

interface Playable {
    int i = 0;
    void play(Note n);
    void adjust();
}

class Wind implements Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Percussion implements Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Stringed implements Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Brass extends Wind {
    public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
    public String toString() { return "Woodwing"; }
}

public class Exe9_10 {
    static void tune(Playable p) {
        //...
        p.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] ps) {
        for(Playable p : ps)
            tune(p);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
