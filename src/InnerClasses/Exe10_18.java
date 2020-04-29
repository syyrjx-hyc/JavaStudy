package InnerClasses;

public class Exe10_18 {
    private static class Test{
        private int i;
        private String name="test";
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.name);
    }
}
