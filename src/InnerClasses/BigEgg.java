package InnerClasses;

public class BigEgg extends Egg {
    private Yolk y;
    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }
    public BigEgg() {
        System.out.println("New BigEgg()");
        y = new Yolk();
    }
    public static void main(String[] args) {
        new BigEgg();
    }
}
class Egg
{
    private Yolk y;
    protected class Yolk
    {
        public Yolk() {
            System.out.println("Egg.yolk( )");
        }
    }
    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}
