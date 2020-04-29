package InnerClasses;

interface Animal20{
    void eat();
    class Frog20 implements Animal20{
        @Override
        public void eat() {
            System.out.println("eating bugs");
        }

        public static void swim(Animal20 a) {
            a.eat();
            System.out.println(a.getClass()+" swimming");
        }
    }
}

public class Exe10_20 implements Animal20 {
    @Override
    public void eat() {
        System.out.println("eating EX20");
    }

    public static void main(String[] args) {
        Animal20.Frog20 f = new Animal20.Frog20();
        f.eat();
        Animal20.Frog20.swim(f);
        Exe10_20 e = new Exe10_20();
        Animal20.Frog20.swim(e);
    }
}
