package Generics;

class Base {
    private int baseIntPrivate;
    int baseIntFriendly;
    protected int baseIntProtected;
    public int baseIntPublic;
    {
        System.out.println("Base nonstatic block");
    }
    static {
        System.out.println("Base static block");
    }

    static class InnerBaseStatic {
        private int innerBaseStaticIntPrivate;
        int innerBaseStaticIntFriendly;
        protected int innerBaseStaticIntProtected;
        public int innerBaseStaticIntPublic;
        {
            System.out.println("InnerBaseStatic nonstatic block");
        }
        static {
            System.out.println("InnerBaseStatic static block");
        }
    }

    class InnerBase {
        private int innerBaseIntPrivate;
        int innerBaseIntFriendly;
        protected int innerBaseIntProtected;
        public int innerBaseIntPublic;
        {
            System.out.println("InnerBase nonstatic block");
        }
//        static {
//            System.out.println("InnerBase static block");
//        } Inner classes cannot have static declarations
    }
}

class Son extends Base {
    static class InnerBaseStatic {
        private int innerBaseStaticIntPrivate;
        int innerBaseStaticIntFriendly;
        protected int innerBaseStaticIntProtected;
        public int innerBaseStaticIntPublic;
        {
            System.out.println("InnerSonStatic nonstatic block");
        }
        static {
            System.out.println("InnerSonStatic static block");
        }
    }

}

public class Test2<T> {
    public static void main(String[] args) {
        System.out.println(1);
        Son s = new Son();
        System.out.println(2);
        Base.InnerBase bi = s.new InnerBase();
        System.out.println(3);
        Son.InnerBaseStatic bis = new Son.InnerBaseStatic();
    }
}
