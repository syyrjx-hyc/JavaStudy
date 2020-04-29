package Holding;

import java.util.*;


public class MyTest{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        System.out.println(a);

        Random rand = new Random();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i=0;i<10;i++) {
            pq.offer(i);
        }
        System.out.println(pq);
//        while (pq.peek()!=null) {
//            System.out.println(pq.poll());
//        }

//        for (Map.Entry entry:System.getenv().entrySet()) {
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }

//        List<Integer> sub2 = new ArrayList<>(i.subList(1,4));
//        System.out.println(sub2);
//        Collections.shuffle(sub2);
//        System.out.println(sub2);
//        sub2.set(1,9);
//        System.out.println(i);
//
//        sub2.retainAll(i);
//        System.out.println(sub2);
//
//        List<Integer> sub1 = i.subList(1,4);
//        System.out.println(sub1);
//        Collections.shuffle(sub1);
//        System.out.println(sub1);
//        sub1.set(1,9);
//        System.out.println(i);
//
//        sub1.retainAll(i);
//        System.out.println(sub1);
//        sub1.clear();
//        System.out.println(i);


    }
}






//class Fruit{
//    private static long counter;
//    protected final long id = counter++;
//    public String toString() {
//        return "Fruit id = "+id;
//    }
//}
//
//class Orange extends Fruit{ public String toString() { return "Orange id = "+super.id; }}
//
//class Apple extends Fruit{ public String toString() { return "Apple id = "+super.id; }}
//
//class Fuji extends Apple{ public String toString() { return "Fuji id = "+super.id; }}
//
//class Snake extends Apple{ public String toString() { return "Snake id = "+super.id; }}
//
//class SmallFuji extends Fuji { public String toString() { return "SmallFuji id = "+super.id; }}
//
//public class MyTest {
//    public static void main(String[] args) {
//        Collection<Fruit> c = Arrays.asList(new Apple(), new Orange(), new Fuji());
//        List<Fruit> l = Arrays.asList(new Fuji(), new Snake());
//        System.out.println(c);
//        System.out.println(l);
//        List<Fuji> l2 = Arrays.<Fuji>asList(new SmallFuji());
//        System.out.println(l2);
//    }
//}


//    Collection<Integer> c = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//        System.out.println(c);
//                Integer[] moreInts = {6,7,8,9,10};
//                c.addAll(Arrays.asList(moreInts));
//                System.out.println(c);
//                Collections.addAll(c,1,2,3,4,5);
//                System.out.println(c);
//                Collections.addAll(c,moreInts);
//                System.out.println(c);