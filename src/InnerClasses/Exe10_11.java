package InnerClasses;

class NewCalculator {
    private class Minus implements Calculator{
        @Override
        public double calculate(int i, int j) {
            return i-j;
        }
    }

    public Calculator getCalculator() {
        return this.new Minus();
    }
}

public class Exe10_11 {


    public static void main(String[] args) {
        NewCalculator e = new NewCalculator();
        double result = (e.getCalculator()).calculate(4,3);
        System.out.println(result);
    }
}
