package Reusing;

class Art {
    Art() {
        System.out.println("art");
    }
}

class Draw extends Art {
    Draw() {
        System.out.println("draw");
    }
}

public class Exe7_3 extends Draw {
//    Exe7_3() {
//        System.out.println("exe7_3");
//    }

    public static void main(String[] args) {
        Exe7_3 e = new Exe7_3();
    }
}
