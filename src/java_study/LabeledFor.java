package java_study;

import javax.swing.plaf.IconUIResource;

public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        for (;true;) {
            inner:
            for (;i<10;i++) {
                System.out.println("i="+i);
                if (i == 2) {
                    System.out.println("break");
                    i++;
                    break;
                }

                if (i==3) {
                    System.out.println("continue");
                    continue;

                }

                if (i==6) {
                    System.out.println("continue outer");
                    i++;
                    continue outer;

                }

                if (i==8) {
                    System.out.println("break inner");
                    break outer;
                }
            }
        }
    }
}
