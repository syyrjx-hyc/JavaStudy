package Exceptions;

class LevelOneException extends Exception {}
class LevelTwoException extends LevelOneException {}
class LevelThreeException extends LevelTwoException {}

class A {
    void f() throws LevelOneException {
        System.out.println("A");
        throw new LevelOneException();
    }
}

class B extends A {
    void f() throws LevelTwoException {
        System.out.println("B");
        throw new LevelTwoException();
    }
}

class C extends B {
    void f() throws LevelThreeException {
        System.out.println("C");
        throw new LevelThreeException();
    }
}

public class Exe12_25 {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.f();
        }	catch(LevelThreeException e3) {
            System.out.println("Caught e3");
        }	catch(LevelTwoException e2) {
            System.out.println("Caught e2");
        }	catch(LevelOneException e1) {
            System.out.println("Caught e1");
        }
    }
}