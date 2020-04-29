package Interfaces;

interface Days {
    int SUNDAY = 1, MONDAY = 2, TUESDAY = 3, WEDNESDAY = 4,
            THURSDAY = 5, FRIDAY = 6, SATURDAY = 7;
}

class Week implements Days {
    private static int count = 0;
    private int id = count++;
    public Week() {
        System.out.println("Week "+id);
    }
}

public class Exe9_17 {
    public static void main(String[] args) {
        System.out.println(Days.FRIDAY);
        Week w0 = new Week();
        Week w1 = new Week();
        System.out.println(w1.FRIDAY);
    }
}
