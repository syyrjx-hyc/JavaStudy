package Typeinfo.InnerPackage;

public class Ex25 {
    private final String nameFinal = "final name";
    private String name = "name";
    protected char c25 = 'a';
    private void printPrivate() {
        System.out.println("private print");
    }
    protected void printProtected() {
        System.out.println("protected print");
    }
    public String toString() {
        return name+", "+nameFinal;
    }
}
