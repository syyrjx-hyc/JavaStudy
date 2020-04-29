package InnerClasses;

public class Exe10_7 {
    private String name = "Outer";
    private void printName() {
        System.out.println("Outer");
    }

    class Inner {
        private String innerName = "Inner";
        public void changeOuterName(String newName) {
            Exe10_7.this.name = newName;
        }
        public void showOuterName() {
            Exe10_7.this.printName();
        }
    }

    public void useInner() {
        Exe10_7.Inner i = this.new Inner();
        i.changeOuterName("InnerOuter");
        i.showOuterName();
        System.out.println(i.innerName);
    }

    public static void main(String[] args) {
        Exe10_7 e = new Exe10_7();
        e.useInner();
        System.out.println(e.name);
        System.out.println(e.new Inner().innerName);
    }
}
