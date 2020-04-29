package InnerClasses.Exe10_6.Pack3;

import InnerClasses.Exe10_6.Pack1.MicroUSB;
import InnerClasses.Exe10_6.Pack2.Phone;

public class MyPhone extends Phone {
    MicroUSB charge() {
        return this.new BeCharged();
    }

    public static void main(String[] args) {
        MyPhone mp = new MyPhone();
        mp.charge().charging();
    }
}
