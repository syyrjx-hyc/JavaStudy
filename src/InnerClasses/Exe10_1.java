package InnerClasses;

public class Exe10_1 {
    private String value;

    class Inner {
        Inner(String s) {
            value = s;
        }
        public String toString() {return value;}
    }

    Inner createInnerClass(String value) {
        return new Inner(value);
    }

    public static void main(String[] args) {
        Exe10_1 e = new Exe10_1();
        Exe10_1.Inner i = e.new Inner("haha");
        System.out.println("haha"==i.toString());

    }
}