package InnerClasses;

class Outer {
    class Inner{}
}

public class Exe10_5 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
    }
}
