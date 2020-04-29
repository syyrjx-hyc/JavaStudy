package InnerClasses;

class MyMoney {
    private int money;
    public MyMoney(int i) {
        money = i;
        System.out.println("There is "+money+" yuan!");
    }
}

public class Exe10_15 {

    public MyMoney getMoney(int x) {
        return new MyMoney(x) {
            private int money = x+1;
        };
    }

    public static void main(String[] args) {
        Exe10_15 e = new Exe10_15();
        e.getMoney(12);
    }
}
