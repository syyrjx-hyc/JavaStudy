package Generics;

import java.util.*;

enum DAYS {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Exe15_17 {
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
//        try {
//            if(a instanceof EnumSet) {
//                Set<T> result = ((EnumSet<T>)a).clone();
//                result.addAll(b);
//                return result;
//            }
//        } catch(Exception e) {
//            throw new RuntimeException(e);
//        }
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
//        try {
//            if(a instanceof EnumSet) {
//                Set<T> result = ((EnumSet<T>)a).clone();
//                result.retainAll(b);
//                return result;
//            }
//        } catch(Exception e) {
//            throw new RuntimeException(e);
//        }
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }
    public static <T> Set<T>  difference(Set<T> superset, Set<T> subset) {
//        try {
//            if(superset instanceof EnumSet) {
//                Set<T> result = ((EnumSet<T>)superset).clone();
//                result.removeAll(subset);
//                return result;
//            }
//        } catch(Exception e) {
//            throw new RuntimeException(e);
//        }
        Set<T> result = new HashSet<T>(superset);
        result.removeAll(subset);
        return result;
    }
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }

    public static void main(String[] args) {
        Set<DAYS> set1 =
                EnumSet.range(DAYS.MONDAY, DAYS.FRIDAY);
        Set<DAYS> set2 =
                EnumSet.range(DAYS.WEDNESDAY, DAYS.SUNDAY);
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("union(set1, set2): " + union(set1, set2));
        Set<DAYS> subset = intersection(set1, set2);
        System.out.println("intersection(set1, set2): " + subset);
        System.out.println("difference(set1, set2): " +
                difference(set1, set2));
        System.out.println("difference(set2, subset): " +
                difference(set2, subset));
        System.out.println("complement(set1, set2): " +
                complement(set1, set2));
    }
}
