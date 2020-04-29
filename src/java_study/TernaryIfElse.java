package java_study;

public class TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i*100:i*10;
    }

    static int standardie(int i) {
        if (i<10)
            return i*100;
        else
            return i*10;
    }

    public static void main(String[] args) {

        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardie(9));
        System.out.println(standardie(10));

    }
}
