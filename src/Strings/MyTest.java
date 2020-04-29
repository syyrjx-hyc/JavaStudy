package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class MyTest {

    public static BufferedReader input = new BufferedReader(new StringReader("Sir\n22 3.22 0.5"));

    public static void main(String[] args) throws IOException {
        Scanner stdin = new Scanner(input);
        System.out.println("What is your name");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println(stdin.nextInt());
        System.out.println(stdin.nextDouble());
        System.out.println(stdin.nextFloat());
    }
}