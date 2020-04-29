package Typeinfo;

import java.lang.reflect.InvocationTargetException;

class Test {
    public Test create() {
        return new Test();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}

public class MyTest {
    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = t.create();
        Test t3 = null;
        try {
            t3 = Test.class.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Object t4 = null;
        try {
            t4 = t.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(t+" "+t2+" "+t3+" "+t4);
    }
}