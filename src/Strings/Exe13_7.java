package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exe13_7 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[A-Z].*\\.$");
        String s = "ADD  ac.";
        Matcher m = p.matcher(s);
        System.out.println(m.matches());
    }
}
