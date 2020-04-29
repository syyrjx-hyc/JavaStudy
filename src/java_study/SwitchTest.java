package java_study;

import java.util.Random;

public class SwitchTest {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int x=0;x<20;x++) {
            switch (x) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                default:
                    System.out.println("nothing");
            }
        }
    }
}
