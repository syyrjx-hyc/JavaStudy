package Strings;

import java.util.Arrays;

public class Exe13_14 {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(input.split("!!",3)));
    }
}
