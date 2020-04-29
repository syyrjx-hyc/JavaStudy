package java_study;

public class VampireNumber {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++) {
            for (int j=0;j<=10;j++) {
                int multiply = i*j;
                String s = String.valueOf(multiply);
                System.out.println(s);
            }
        }
    }
}
