package Typeinfo;

class Animal {
    private String a1;
    protected int a2;
    public float a3;
}

class Frog extends Animal{
    public String f2;
    protected Animal a2;
}

class BigFrog extends Frog{}

public class Exe14_8 {
    public static void printFields(Object o) {
        Object[] fields = o.getClass().getDeclaredFields();
        if (fields.length==0) {
            System.out.println("No field found in "+o.getClass().getName());
        } else {
            System.out.println("Fields of "+o.getClass().getName());
            for (Object oo:fields) {
                System.out.println(" ["+oo+"] ");
            }
        }
    }

    public static void printSuperClasses(Object o) {
        System.out.println("Son: "+o.getClass().getName());
        Class up = null;

        while (o.getClass().getSuperclass() != null) {
            printFields(o);
            up = o.getClass().getSuperclass();
            System.out.println("Father: "+up.getName());
            try {
                o = up.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BigFrog bf = new BigFrog();
        printSuperClasses(bf);
    }
}
