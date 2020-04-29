package InnerClasses;

import java.util.Arrays;

interface U{
    void f();
    void g();
    void h();
}

class A{
    void showA() {}
    U uA() {
        return new U() {
            @Override
            public void f() {
                System.out.println("U f() in A");
            }

            @Override
            public void g() {
                System.out.println("U g() in A");
            }

            @Override
            public void h() {
                System.out.println("U h() in A");
            }
        };
    }
}

class B{
    public U[] us;
    B(int value) {
        us = new U[value];
    }
    void createU(int index, U u){
        if (index<us.length) {
            us[index] = u;
        }
    }

    void createNull(int index) {
        if (index<us.length) {
            us[index] = null;
        }
    }

    void traverse() {
        for (U u:us) {
            u.f();
            u.g();
            u.h();
            System.out.println("B");
        }
    }
}

public class Exe10_23 {
    public static void main(String[] args) {
        A[] as = new A[5];
        B b = new B(5);
        for (int x=0;x<as.length;x++) {
            as[x] = new A();
            b.createU(x,as[x].uA());
        }
        b.traverse();
        b.createNull(0);
        b.createNull(3);
        System.out.println(Arrays.toString(b.us));
    }
}
