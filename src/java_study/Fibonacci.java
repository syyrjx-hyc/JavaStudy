package java_study;

public class Fibonacci {
    static void CalFibo(int start, int times) {
        int next = start;
        for (int i=0;i<times;i++) {
            int sum = next+start;
            System.out.println(sum);
            start = next;
            next = sum;
        }
    }

    public static void main(String[] args) {
        CalFibo(1,10);
    }
}
