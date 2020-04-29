package Interfaces;
import TestPackage.*;

class AButton implements Exe9_5_Interface {
    private String name = "A";
    @Override
    public void click() {
        System.out.println("Click A");
    }

    @Override
    public void delete() {
        System.out.println("Delete A");
    }

    @Override
    public void construct() {
        System.out.println("Construct A");
    }
    public String toString() {
        return name;
    }
}

public class Exe9_5 {
    public static void main(String[] args) {
        AButton a = new AButton();
        a.click();
        a.delete();
        a.construct();
        System.out.println(a);
        System.out.println(a.i);
    }
}
