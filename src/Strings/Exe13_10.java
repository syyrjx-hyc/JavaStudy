package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exe13_10 {
    private static String test = "Java now has regular expressions";
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\\Breg.*");
        ArrayList<String> al = new ArrayList<String>
                (Arrays.asList("^Java","\\Breg.*","n.w\\s+h(a|i)s","s?","s*","s+","s{4}","s{1}.","s{0,3}"));
        for (String reg:al) {
            Pattern p = Pattern.compile(reg);
            Matcher m = p.matcher(test);
            System.out.println("Regulation expression: "+reg);
            while (m.find()) {
                System.out.println(m.group()+" at position "+m.start()+"-"+(m.end()-1));
            }
            System.out.println("");
        }
    }
}
