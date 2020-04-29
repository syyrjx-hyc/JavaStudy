package Strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exe13_171819 {
    public static void main(String[] args) throws IOException {
        if (args.length<2) {
            System.out.println
                    ("Usage: Java Exe13_171819 fileName readMode(int(0:annotations|1:normalWords)|2:className)");
            System.exit(0);
        }
        System.out.println("Reading: "+args[0]);
        Pattern p;
        switch (args[1]) {
            case "0": p = Pattern.compile("(//.+|\\*.+|/\\*.+)");break;
            case "1": p = Pattern.compile("\".*\"");break;
            case "2": p = Pattern.compile("class [A-Z]\\w+");break;
            default: p = null; System.exit(0);break;
        }
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);
        String nowLine = br.readLine();
        Matcher m = p.matcher(nowLine);
        while (nowLine != null) {
            m.reset(nowLine);
            while (m.find()) {
                System.out.println(" ["+m.group()+"]");
            }
            nowLine = br.readLine();
        }
    }
}
