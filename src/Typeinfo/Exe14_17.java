package Typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.regex.Pattern;

class Exe14_17Nonpublic {

    Exe14_17Nonpublic() {}
    public Exe14_17Nonpublic(int i) {}
    private static String usage =
            "Usage:\n" + "[1]To show all methods in class: \n"+
            "Java Exe14_17 qualified.class.name\n" +
            "[2]or To search for methods involving 'word:\n" +
            "Java Exe14_17 qualified.class.name word";
    private static Pattern p = Pattern.compile("\\w+\\.|\\s*final|\\s*native");

    public static void main(String[] args) {
        if (args.length<1 | args.length>2) {
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] met = c.getMethods();
            Constructor[] con = c.getConstructors();
            System.out.println("All methods"+Arrays.toString(met));
            System.out.println("All constructors"+Arrays.toString(con));
            if (args.length == 1) {
                for (Method m : met) {
                    System.out.println(p.matcher(m.toString()).replaceAll(""));
                }
                for (Constructor cc : con) {
                    System.out.println(p.matcher(cc.toString()).replaceAll(""));
                }
            } else {
                for (Method m : met) {
                    if (m.toString().contains(args[1]))
                        System.out.println(p.matcher(m.toString()).replaceAll(""));
                }
                for (Constructor cc : con) {
                    if (cc.toString().contains(args[1]))
                        System.out.println(p.matcher(cc.toString()).replaceAll(""));
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            System.exit(1);
        }
    }
}

public class Exe14_17 {
    public static void main(String[] args) {
        Exe14_17Nonpublic.main(args);
    }
}
