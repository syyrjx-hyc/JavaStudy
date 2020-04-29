package java_study;

class MyString {
    String s;
    MyString(String s) {
        this.s = s;
        System.out.println("MyString");
        System.out.println(s);
    }
    MyString f() {
        this.s += "b";
        return this;
    }
    String GetString() {
        return this.s;
    }
}

public class StringTest {
    public static void main(String[] args) {
        MyString[] s = new MyString[3];
        for (int i=0;i<s.length;i++) {
            s[i] = new MyString("a"+i+"_");
        }
        for (MyString x:s) {
            System.out.print(x.f().GetString());
        }
    }
}
