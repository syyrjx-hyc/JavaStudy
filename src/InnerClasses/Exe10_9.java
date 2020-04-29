package InnerClasses;

interface Calculator{
    double calculate(int i, int j);
}

public class Exe10_9 {
    Calculator c() {
        class Add implements Calculator {
            @Override
            public double calculate(int i, int j) {
                return i+j;
            }
        }
        return new Add();
    }

    public static void main(String[] args) {
        Exe10_9 e = new Exe10_9();
        System.out.println(e.c().calculate(3,4));
    }
}
