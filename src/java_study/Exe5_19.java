package java_study;

import java.util.Arrays;

class AcceptString {
    static void f(String... args) {
        System.out.println(Arrays.toString(args));
    }
}

public class Exe5_19 {
    public static void main(String[] args) {
        AcceptString.f("aa","bb","cc");
        AcceptString.f(new String[] {"11","22","33"});
    }
}
