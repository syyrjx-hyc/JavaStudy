package java_study;

class MyFloat {
    float f;
}

public class CalculateSpeed {
    public static void main(String[] args) {
        float speed;
        MyFloat distance = new MyFloat();
        MyFloat time = new MyFloat();
        distance.f = 200;
        time.f = 200;
        speed = distance.f/time.f;
        System.out.println(speed);
        System.out.println(distance.f==time.f);
        System.out.printf(Float.toString(speed)+"a\n");
        System.out.println((-12346>>>1<<1)+" "+Integer.toBinaryString(-12345>>>1));
    }
}
