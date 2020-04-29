package Access;

class Soup {
    int i = 5;
    private Soup() {}
    private static Soup s0 = new Soup();
    public static Soup construct() {
        System.out.println("constructed using private methods");
        return s0;
    }
    static void f() {
        System.out.println("drink!");
    }
}

public class PrivateConstructor {
    public static void main(String[] args) {
        Soup.construct();
        Soup.construct();

    }
}
