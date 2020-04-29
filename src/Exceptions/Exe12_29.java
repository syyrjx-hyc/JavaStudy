package Exceptions;

class BaseballException extends RuntimeException {}
class Foul extends RuntimeException {}
class Strike extends RuntimeException {}

abstract class Inning {
    public Inning() {}
    public void event() {}
    public abstract void atBat();
    public void walk() {}
}

class StormException extends RuntimeException {}
class RainedOut extends RuntimeException {}
class PopFoul extends RuntimeException {}

interface Storm {
    public void event();
    public void rainHard();
}

public class Exe12_29 extends Inning implements Storm {
    public Exe12_29() {}
    public Exe12_29(String s) {}
    public void walk() {}
    public void event() {}
    public void rainHard() {}
    public void atBat() {}
    public static void main(String[] args) {
        Exe12_29 si = new Exe12_29();
        si.atBat();
        // What happens if you upcast?
        Inning i = new Exe12_29();
        i.atBat();
    }
}
