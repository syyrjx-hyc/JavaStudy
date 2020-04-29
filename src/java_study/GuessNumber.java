package java_study;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    static int GetInt() {
        int str1 = 0;
        System.out.println("Guess a number:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            str1 = sc.nextInt();
            System.out.println("Input:" + str1);
        }
        sc.close();
        return str1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(10);
        if (GetInt() != target) {
            System.out.println("Wrong!");
            System.out.println("the answer is:"+target);
        }
        else
            System.out.println("Right");
    }
}
