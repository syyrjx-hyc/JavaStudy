package Typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

//class Toy {
//    public Toy() {
//        System.out.println("Default constructor");
//    }
//    public Toy(int i) {
//        System.out.println("NonDefault constructor");
//    }
//    public void print() {
//        System.out.println("A toy walking");
//    }
//}

public class Exe14_19 {
    public static void main(String[] args) {
        Constructor[] c1 = Toy.class.getConstructors();
        System.out.println(Arrays.toString(c1));
        Object t19 = null;
        Toy t19b = null;

        try {
            t19 = c1[0].newInstance();
            t19 = c1[1].newInstance(2);
            ((Toy) t19).print();

            Constructor<Toy> c2 = Toy.class.getDeclaredConstructor(int.class);
            t19b = c2.newInstance(2);
            t19b.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
