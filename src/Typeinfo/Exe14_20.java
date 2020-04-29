package Typeinfo;

import java.util.Arrays;

public class Exe14_20 {
    public static void main(String[] args) {
        if (args.length<1) {
            System.out.println("Usage: Java Exe14_20 ClassName");
            System.exit(0);
        }

        Class<?> c = null;
        try {
            c = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            System.exit(1);
        }

        System.out.println("getAnnotatedInterfaces[A]: "+Arrays.toString(c.getAnnotatedInterfaces()));
        System.out.println("getAnnotatedSuperclass: "+c.getAnnotatedSuperclass());
        System.out.println("getAnnotation[A]: "+Arrays.toString(c.getAnnotations()));
        System.out.println("getCanonicalName: "+c.getCanonicalName());
        System.out.println("getClasses[A]: "+Arrays.toString(c.getClasses()));
        System.out.println("getDeclaredAnnotations[A]: "+Arrays.toString(c.getDeclaredAnnotations()));
        System.out.println("getDeclaredClasses[A]: "+Arrays.toString(c.getDeclaredClasses()));
        System.out.println("getDeclaredConstructors[A]: "+Arrays.toString(c.getDeclaredConstructors()));
        System.out.println("getDeclaredFields[A]: "+Arrays.toString(c.getDeclaredFields()));
        System.out.println("getDeclaredMethods[A]: "+Arrays.toString(c.getDeclaredMethods()));
        System.out.println("getEnumConstants[A]: "+Arrays.toString(c.getEnumConstants()));
        /*...*/
    }
}
