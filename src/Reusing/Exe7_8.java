package Reusing;

class A8 {
    A8(char c, int i) { System.out.println("A("+c+" "+i+")"); }
}

public class Exe7_8 extends A8 {
    private char c = '0';
    private int i = 0;
    Exe7_8() {
        super('1',1);
        System.out.println("Exe7_8()");
    }

    Exe7_8(char a, int j){
        super(a,j);
        c = a;
        i = j;
        System.out.println("Exe7_8("+a+" "+j+")");
    }

    public static void main(String[] args) {
        Exe7_8 e1 = new Exe7_8();
        Exe7_8 e2 = new Exe7_8('3',3);

        System.out.println(e2.c+" "+e2.i);
    }
}

