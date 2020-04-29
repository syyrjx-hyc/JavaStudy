package Holding;

import java.util.*;

public class Exe11_16 {
    public static void vowelCounter(String[] st) {
        Set<String> vowel = new HashSet<String>(Arrays.asList("A","E","I","O","U","a","e","i","o","u"));
        Map<String, Integer> vowelC = new HashMap<String, Integer>();
        int allVowel = 0;
        for (String s:st) {
            int eachVowel = 0;
            for (String c:s.split("")) {
                if (vowel.contains(c)) {
                    eachVowel++;
                    allVowel++;
                    Integer freq = vowelC.get(c);
                    vowelC.put(c, freq==null ? 1:freq+1);
                }
            }
            System.out.println(s+":"+eachVowel);
        }
        System.out.println("All vowel:"+allVowel);
        System.out.println(vowelC);
    }

    public static void main(String[] args) {
        vowelCounter(args);

    }
}
