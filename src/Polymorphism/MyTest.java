package Polymorphism;

class Test{
}

class Test2 extends Test{
}

class Run{
    Test process() {return new Test();}
}

class Run2 extends Run{
    @Override Test2 process() {return new Test2();}
}

public class MyTest{
    public static void main(String[] args) {
        Test t = new Test();
        Test2 t2 = (Test2) t;
    }
}
