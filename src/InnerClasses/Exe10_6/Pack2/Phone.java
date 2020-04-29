package InnerClasses.Exe10_6.Pack2;

import InnerClasses.Exe10_6.Pack1.MicroUSB;

public class Phone {
    protected class BeCharged implements MicroUSB {
        public BeCharged() {}
        @Override
        public void charging() {
            System.out.println("I'm being charged by MicroUSB...");
        }
    }
}
