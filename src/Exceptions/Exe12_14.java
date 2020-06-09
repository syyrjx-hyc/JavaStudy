package Exceptions;

class Switch {
    private boolean state = false;
    public void on() {state=true;System.out.println(this);}
    public void off() {state=false;System.out.println(this);}
    @Override public String toString() { return state ? "on":"off"; }
}

class OnOffException1 extends Exception{}
class OnOffException2 extends Exception{}

public class Exe12_14 {
    private static Switch sw = new Switch();
    static Integer[] x = new Integer[1];
    public static void f(int i)
            throws OnOffException1, OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
            f(x[0]);
            sw.off();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}

