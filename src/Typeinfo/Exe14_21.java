package Typeinfo;

interface Movement{
    void doSomething();
    void doSomethingElse(String args);
}

class Person implements Movement{
    @Override public void doSomething() {
        System.out.println("Person doSomething");
    }
    @Override public void doSomethingElse(String msg) {
        System.out.println("Person doSomethingElse "+msg);
    }
}

class Robot implements Movement {
    private static int doCount = 0;
    private static int doElseCount = 0;
    private Movement move;
    Robot(Movement move) {
        this.move = move;
    }
    @Override public void doSomething() {
        System.out.println("Robot doSomething");
        move.doSomething();
        System.out.println("doSomething call times: "+(++doCount));
    }
    @Override public void doSomethingElse(String msg) {
        System.out.println("Robot doSomethingElse "+msg);
        move.doSomethingElse(msg);
        System.out.println("doSomethingElse call times: "+(++doElseCount));
    }
}

public class Exe14_21 {
    public static void command(Movement m) {
        m.doSomething();
        m.doSomethingElse("run");
    }

    public static void main(String[] args) {
        command(new Person());
        command(new Robot(new Person()));
        command(new Robot(new Person()));
        command(new Robot(new Person()));
    }
}
