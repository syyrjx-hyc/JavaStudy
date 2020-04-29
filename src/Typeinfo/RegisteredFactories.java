//package Typeinfo;
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Random;
//
//interface Factory<T> {
//    T create();
//}
//
//class Part {
//    @Override public String toString() { return getClass().getSimpleName(); }
//}
//
//class Filter extends Part {}
//class FuelFilter extends Filter {}
//class AirFilter extends Filter {}
//class CabinAirFilter extends Filter {}
//class OilFilter extends Filter {}
//
//class Belt extends Part {}
//class FanBelt extends Belt {}
//class GeneratorBelt extends Belt {}
//class PowerSteeringBelt extends Belt {}
//
//class PartFactories implements Factory<Part> {
//    Class<? extends Part> type;
//    PartFactories(Class<? extends Part> type) {
//        this.type = type;
//    }
//    @Override public Part create() {
//        Part p = null;
//        try {
//            p = type.getDeclaredConstructor().newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//        return p;
//    }
//}
//
//public class RegisteredFactories {
//    static List<Factory<? extends Part>> l = new ArrayList<Factory<? extends Part>>();
//    static {
//        l.add(new PartFactories(FuelFilter.class));
//        l.add(new PartFactories(AirFilter.class));
//        l.add(new PartFactories(CabinAirFilter.class));
//        l.add(new PartFactories(OilFilter.class));
//        l.add(new PartFactories(FanBelt.class));
//        l.add(new PartFactories(GeneratorBelt.class));
//        l.add(new PartFactories(PowerSteeringBelt.class));
//    }
//    private static Random rand = new Random(2);
//    public static Part createRandom() {
//        int n = rand.nextInt(l.size());
//        return l.get(n).create();
//    }
//    public static void main(String[] args) {
//        for (int i=0;i<10;i++) {
//            System.out.println(createRandom());
//        }
//    }
//}
