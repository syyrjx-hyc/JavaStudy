package java_study;

class AA {}

public class VarargType {

    static void o(Object... args) {
        System.out.println(args.getClass()+" length: "+args.length);
        for (Object j:args) {
            System.out.print(j+"_");
        }
        System.out.print("\n");
    }

    static void c(char... args) {
        System.out.println(args.getClass()+" length: "+args.length);
    }

    static void i(int... args) {
        System.out.println(args.getClass()+" length: "+args.length);
    }

    public static void main(String[] args) {
        Object[] s = new Object[] {"a","b",new AA()};
        o(s);
        c('a','c');
        i(5);

    }
}
