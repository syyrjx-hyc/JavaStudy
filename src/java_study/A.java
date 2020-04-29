package java_study;

public class A {
    public static void main(String[] args) {
        Other.pnt(new String[]{"a","b","cc"});
    }
}

class Other{
    public static void pnt(String[] args) {
        for (String x:args) {
            System.out.println(x+" ");
        }
    }
}