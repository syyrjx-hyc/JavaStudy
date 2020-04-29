package Interfaces;

interface InterOne { void f1();}

interface InterTwo extends InterOne {void f2();}

interface InterThree extends InterOne {void f3();}

interface  InterMulti extends InterThree, InterTwo {void f4();}

class Inter implements InterMulti {
    @Override public void f1() {};
    public void f2() {};
    public void f3() {};
    public void f4() {};
    public void f5() {};
}

public class Exe9_13 {
    public static void g(Inter i) {};
    public static void main(String[] args) {
        InterOne i = new Inter();
        i.f1();
        g((Inter) i);
        ((InterOne) i).f1();
        ((InterMulti) i).f4();
    }
}
