package java_study;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("please input an integer:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int str1 = scanner.nextInt();
            System.out.println("Input:" + str1);
        }
        scanner.close();
    }
}
