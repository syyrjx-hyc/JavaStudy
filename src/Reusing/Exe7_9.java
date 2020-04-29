package Reusing;

class Component1 {private String n; Component1(String s) { n=s;System.out.println("C1"+s); }
    void dispose() { System.out.println("C1"+n+" dispose"); }}
class Component2 {private String n; Component2(String s) { n=s;System.out.println("C2"+s); }
    void dispose() { System.out.println("C2"+n+" dispose"); }}
class Component3 {private String n; Component3(String s) { n=s;System.out.println("C3"+s); }
    void dispose() { System.out.println("C3"+n+" dispose"); }}

class Root {
    Component1 c1root = new Component1("root");
    Component2 c2root = new Component2("root");
    Component3 c3root = new Component3("root");
    Root() { System.out.println("Root"); }
    void dispose() {
        c3root.dispose();
        c2root.dispose();
        c1root.dispose();
        System.out.println("Root dispose");
    }
}

public class Exe7_9 extends Root {
    Component1 c1ex = new Component1("ex");
    Component2 c2ex = new Component2("ex");
    Component3 c3ex = new Component3("ex");
    Exe7_9() {System.out.println("Exe7_9");}
    void dispose() {
        System.out.println("Exe7_9 dispose");
        super.dispose();
    }
    public static void main(String[] args) {
        System.out.println("hh");
        Exe7_9 e = new Exe7_9();
        try {} finally { e.dispose(); }
    }
}
