package arrays;

import java.lang.reflect.*;
import java.util.HashMap;

class Fruit {
    private int price = 3;

    public boolean equals(Object o) {
        return false;
    }

    public int hashCode() {
        return 1;
    }
}

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        HashMap<Fruit,Integer> hm = new HashMap<>();
        Field threshold =  hm.getClass().getDeclaredField("threshold");
        threshold.setAccessible(true);
        Method capacity = hm.getClass().getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        for (int i=0;i<30;i++) {
            System.out.print(i+", ");
            hm.put(new Fruit(),i);
            System.out.println("容量："+capacity.invoke(hm)+"    阈值："+threshold.get(hm)+"    元素数量："+hm.size());
        }
    }
}
