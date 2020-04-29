package java_study;


public class AllOps {

    static boolean f(boolean b) {
        System.out.println("1:"+b);
        return b;
    }

    static boolean BoolTest(int x, int y) {
        boolean res = f(x==y);
        System.out.println("2:"+res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println("3:"+BoolTest(2,2));
    }
}
