package Typeinfo;

import Typeinfo.InnerPackage.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exe14_25 {
    public static void main(String[] args) throws Throwable {
        Ex25 e = new Ex25();
        Field f = e.getClass().getDeclaredField("name");
        f.setAccessible(true);
        f.set(e, "modified name");
        System.out.println(e);
        Field f2 = e.getClass().getDeclaredField("nameFinal");
        f2.setAccessible(true);
        f2.set(e, "modified nameFinal");
        System.out.println(e);
        Method m = e.getClass().getDeclaredMethod("printPrivate");
        m.setAccessible(true);
        m.invoke(e);
        Method m2 = e.getClass().getDeclaredMethod("printProtected");
        m2.setAccessible(true);
        m2.invoke(e);
    }
}
