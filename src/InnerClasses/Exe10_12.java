package InnerClasses;

interface Inner12{
    void modifyOuter();
}

public class Exe10_12 {
    private String name = "Outer";
    private void show() {
        System.out.println("Outer class");
    }
    public Inner12 getInner() {
        return new Inner12() {
            @Override
            public void modifyOuter() {
                Exe10_12.this.name = "InnerOuter";
            }
            public void show2() {
                System.out.println("Inner");
                Exe10_12.this.show();
            }
        };
    }

    public static void main(String[] args){
        Exe10_12 e = new Exe10_12();
        System.out.println(e.name);
        e.getInner().modifyOuter();
        System.out.println(e.name);
//        e.getInner().show2();
    }
}
