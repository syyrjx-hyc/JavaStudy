package Holding;

import java.util.LinkedList;

class Stack2<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T t) {storage.addFirst(t);}
    public T peek() {return storage.getFirst();}
    public T pop() {return storage.removeFirst();}
    public boolean empty() {return storage.isEmpty();}

}

public class Exe11_15 {
    public static void main(String[] args) {
        Stack2<String> st = new Stack2<String>();
        String[] s = "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---".split("");
        for (int i=0;i<s.length;i++) {
            switch (s[i]) {
                case "+":st.push(s[i+1]);break;
                case "-":
                    System.out.print(st.pop());break;
                default:break;
            }
        }
    }
}
