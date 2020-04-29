package InnerClasses;



class Body{
    Body() {
        System.out.println("Body constructor");
    }
    class Leg extends Body {
        Leg() {
            System.out.println("Leg constructor");
        }
    }
}

public class MyTest {
    public static void main(String[] args) {
        System.out.println(1);
        Body b = new Body();
        System.out.println(2);
        Body.Leg bl = b.new Leg();
        System.out.println(3);
        Body.Leg.Leg bll = bl.new Leg();
        System.out.println(4);
        Body.Leg.Leg.Leg blll = bll.new Leg();
        System.out.println(b.getClass());
        System.out.println(bl.getClass());
        System.out.println(bll.getClass());
        System.out.println(blll.getClass());
    }
}
