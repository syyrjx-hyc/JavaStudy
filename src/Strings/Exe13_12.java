package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exe13_12 {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch,\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The fdrumious Bandersnatch.";
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$");
        Pattern p = Pattern.compile("\\b[a-z][a-zA-Z]+\\b");
        Matcher m = p.matcher(POEM);
        while (m.find()) {
            System.out.println(m.group());
//            for (int j=0;j<=m.groupCount();j++)
//                System.out.print("["+m.group(j)+"]");
//            System.out.println("");
        }
    }
}
