package java_study;

public class Exe5_21 {
    public enum Money {
        One, Five, Ten, Twenty, Fifty, Hundred
    }

    public void describe(Money m) {
        switch (m) {
            case One:
                System.out.println(1);break;
            case Five:
                System.out.println(5);break;
            case Ten:
                System.out.println(10);break;
            case Twenty:
                System.out.println(20);break;
            case Fifty:
                System.out.println(50);break;
            case Hundred:
                System.out.println(100);break;
            default:break;
        }
    }

    public static void main(String[] args) {
    }
}
