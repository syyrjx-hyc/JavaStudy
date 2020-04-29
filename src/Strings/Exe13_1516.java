package Strings;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exe13_1516 {
    public static void main(String[] args) throws IOException {
        if (args.length<3) {
            System.out.println("Usage:Java Exe13_1516 filePath regex flag");
            System.exit(0);
        }

        File[] files = new File(args[0]).listFiles();
        System.out.println(Arrays.toString(files));

        int flag = 0;
        if(args[2].equals("Pattern.CASE_INSENSITIVE"))
            flag = Pattern.CASE_INSENSITIVE;
        else if(args[2].equals("Pattern.CANON_EQ"))
            flag = Pattern.CANON_EQ;
        else if(args[2].equals("Pattern.COMMENTS"))
            flag = Pattern.COMMENTS;
        else if(args[2].equals("Pattern.DOTALL"))
            flag = Pattern.DOTALL;
        else if(args[2].equals("Pattern.LITERAL"))
            flag = Pattern.LITERAL;
        else if(args[2].equals("Pattern.MULTILINE"))
            flag = Pattern.MULTILINE;
        else if(args[2].equals("Pattern.UNICODE_CASE"))
            flag = Pattern.UNICODE_CASE;
        else if(args[2].equals("Pattern.UNIX_LINES"))
            flag = Pattern.UNIX_LINES;

        Pattern p = Pattern.compile(args[1],flag);
        for (File file:files) {
            System.out.println("\n\nReading: "+file);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String nowLine = br.readLine();
            Matcher m = p.matcher(nowLine);
            while (nowLine != null) {
                m.reset(nowLine);
                if (m.find()) {
                    System.out.println("\nSearching: "+nowLine);
                    System.out.print("Result:");
                    System.out.print(" ["+m.group()+"]");
                }
                while (m.find()) {
                    System.out.print(" ["+m.group()+"]");
                }
                nowLine = br.readLine();
            }

        }


    }
}

