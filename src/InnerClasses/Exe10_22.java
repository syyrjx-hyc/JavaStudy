package InnerClasses;

import javax.sound.midi.Sequence;
import java.util.Arrays;

interface Selector22 {
    boolean end();
    Object current();
    void next();
}

public class Exe10_22 {
    private Object[] item;
    private int next;
    public Exe10_22(int size) {
        item = new Object[size];
    }
    public void add(Object x) {
        if (next<item.length){
            item[next++] = x;
        }
    }

    private class SequenceSelector22 implements Selector22 {
        private int count;
        private String reverseSeq="";
        @Override
        public boolean end() {
            return count==item.length;
        }

        @Override
        public Object current() {
            return item[count];
        }

        @Override
        public void next() {
            if (count<item.length) {
                count++;
            }
        }

        public void reverseSelector() {
            System.out.print("_"+item[item.length-1-count]+"_");
            reverseSeq += item[item.length-1-count]+"";
        }
    }

    public Selector22 selector() {
        return new SequenceSelector22();
    }

    public static void main(String[] args) {
        Exe10_22 e = new Exe10_22(10);
        for (int x=0;x<e.item.length;x++) {
            e.add(x);
        }
        SequenceSelector22 s = e.new SequenceSelector22();
        System.out.println(Arrays.toString(e.item));
        while (!s.end()) {
            s.reverseSelector();
            System.out.print(s.current()+" ");
            s.next();
        }
        System.out.println("");
        System.out.println(s.reverseSeq);
    }
}
