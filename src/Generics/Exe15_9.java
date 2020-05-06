package Generics;

public class Exe15_9 {
    public <X,Y,Z> void f(X x,Y y,String s) {
        System.out.println(x.getClass().getSimpleName()+","+
                y.getClass().getSimpleName()+","+
                s.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Exe15_9 e = new Exe15_9();
        e.f(e,1.0,"e");
    }
}
