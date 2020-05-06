package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Exe15_4<T> {
    private List<T> items = new ArrayList<>();
    private int next = 0;
    public Exe15_4(List<T> l) {items = l;}
    void add(T t) { items.add(t); }

    class SeqSelector implements Selector {

        private int index = 0;

        @Override
        public boolean end() {
            return index == items.size();
        }

        @Override
        public Object current() {
            return items.get(index);
        }

        @Override
        public void next() {
            if (index<items.size()) {
                index++;
            }
        }
    }

    Selector getSelector() {
        return new SeqSelector();
    }

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>(Arrays.asList("Hello".split("")));
        Exe15_4 e = new Exe15_4(l1);
        Selector ss1 = e.getSelector();
        while(!ss1.end()) {
            System.out.println(ss1.current());
            ss1.next();
        }
    }

}
