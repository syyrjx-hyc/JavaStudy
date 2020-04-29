package Typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicRobot implements InvocationHandler {
    private Object helped;
    private static int doCount = 0;
    private static int doElseCount = 0;
    public DynamicRobot(Object o) {
        this.helped = o;
    }

    @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("Proxy: "+proxy);
        System.out.println("**** proxy: "+proxy.getClass()+", method: "+method+", args: "+args);
        if (args!=null) {
            System.out.println("doSomethingElse call times: "+(++doElseCount));
            for (Object arg:args) {
                System.out.println("["+arg+"]");
            }
        } else {System.out.println("doSomething call times: "+(++doCount));}
        return method.invoke(helped, args);
    }
}

public class Exe14_22 {
    public static void command(Movement m) {
        m.doSomething();
        m.doSomethingElse("run");
    }

    public static void main(String[] args) {
        Person p = new Person();
        command(p);
        Movement m = (Movement) Proxy.newProxyInstance(
                Movement.class.getClassLoader(),
                new Class[] {Movement.class},
                new DynamicRobot(p)
        );
        command(m);
    }
}
