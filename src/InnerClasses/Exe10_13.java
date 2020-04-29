package InnerClasses;

interface Calculator13{
    double calculate(int i, int j);
}

public class Exe10_13 {

    public Calculator13 calculatorGenerator() {
        return new Calculator13() {
            @Override
            public double calculate(int i, int j) {
                return i-j;
            }
        };
    }

    public static void main(String[] args) {
        Exe10_13 e = new Exe10_13();
        System.out.println(e.calculatorGenerator().calculate(3,4));
    }
}
