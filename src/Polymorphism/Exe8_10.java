package Polymorphism;

class Fruit {
    protected String name = "Fruit";
    public void eat(Fruit f) {
        this.peel();
        System.out.println("Eat "+name);
    }
    public void peel() {
        System.out.println("Peel "+name);
    }
}

class Apple extends Fruit {
    private static int i = 3;
    private static final int j = i++;
    {name = "Apple";}
    @Override public void peel() {
        System.out.println("Peel "+name);
    }
    public void buy() {
        System.out.println(j);
        System.out.println("Buy "+name);
    }
}

public class Exe8_10 {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.eat(a);
        a.buy();
    }
}
