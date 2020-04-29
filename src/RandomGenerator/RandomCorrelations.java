package RandomGenerator;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class RandomCorrelations {
    private Random rand = new Random();
    private DecimalFormat df = new DecimalFormat("0.0000000000000000");
    private double[] x = new double[152];
    private double[] y = new double[152];

    void randomDoubleGenerator(double[] d, double magnification){
        for (int i=0;i<d.length;i++) {
            d[i] = rand.nextDouble()*magnification;
        }
    }

    double calExpect(double[] d) {
        double summary = 0;
        for (int i=0;i<d.length;i++) {
            summary += d[i];
        }
        return Double.parseDouble(df.format(summary/d.length));
    }

    double calCoExpect(double[] d1, double[] d2) {
        if (d1.length==d2.length) {
            double summary = 0;
            for (int i=0;i<d1.length;i++) {
                summary += d1[i]*d2[i];
            }
            return Double.parseDouble(df.format(summary/d1.length));
        }
        else {return 0;}
    }

    double calVariance(double[] d) {
        double[] dd = new double[d.length];
        for (int i=0;i<d.length;i++) {
            dd[i] = d[i]*d[i];
        }
        double expectD = calExpect(d);
        double expectDD = calExpect(dd);
        return expectDD-(expectD*expectD);
    }

    double calculateRelation(double[] d1, double[] d2) {
        if (d1.length==d2.length) {
            double expectD1 = calExpect(d1);
            double expectD2 = calExpect(d2);
            double expectD1D2 = calCoExpect(d1,d2);
            double covD1D2 = expectD1D2-expectD1*expectD2;
            double varD1 = calVariance(d1);
            double varD2 = calVariance(d2);
            System.out.println("Ex="+expectD1+" Ey="+expectD2+" Cov="+covD1D2+" Dx="+varD1+" Dy="+varD2);
            double r = Double.parseDouble(df.format(covD1D2/Math.sqrt(varD1*varD2)));
            return r*r;
        }
        else {return 0;}
    }

    public static void main(String[] args) {

//        RandomCorrelations r = new RandomCorrelations();
//        for (int i=0;i<152;i++) {
//            r.x[i] = i;
//            r.y[i] = -0.3*i+Math.random();
//        }
//        System.out.println(Arrays.toString(r.x));
//        System.out.println(Arrays.toString(r.y));
//        System.out.println(r.calculateRelation(r.x,r.y));

        RandomCorrelations r2 = new RandomCorrelations();
        r2.randomDoubleGenerator(r2.x,10);
        for (int i=0;i<152;i++) {
            r2.y[i] = (-0.2)*r2.x[i]+Math.random();
        }
        System.out.println(Arrays.toString(r2.x));
        System.out.println(Arrays.toString(r2.y));
        System.out.println(r2.calculateRelation(r2.x,r2.y));

    }

}
