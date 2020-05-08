package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<>();

        list.add(1);

        list.getClass().getMethod("add", Object.class).invoke(list, "asd");

        System.out.println(list);

    }

}