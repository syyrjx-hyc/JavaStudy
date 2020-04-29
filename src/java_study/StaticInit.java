package java_study;

class Bowl {
    Bowl (int marker) {
        System.out.println("Bowl:"+marker);
    }
    void f1 (int j) {
        System.out.println("f1:"+j);
    }
}

class Table {
    Table () {
        System.out.println("Table()");
        b2.f1(2);
    }
    static Bowl b1 = new Bowl(1);
    Bowl b2 = new Bowl(2);
    static Bowl b3 = new Bowl(3);
}

public class StaticInit {
    static Table t = new Table();
    public static void main(String[] args) {
        Table t2 = new Table();
        Other.pnt(new String[]{"a","b","cc"});
    }
}
