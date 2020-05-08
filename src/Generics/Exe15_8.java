package Generics;

import java.util.Iterator;
import java.util.Random;

class StoryCharacter {
    private static int count = 0;
    private final int id = count++;
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+":"+this.id;
    }
}

class GoodGuys extends StoryCharacter {}
class GoodMale extends GoodGuys{}
class GoodFemale extends GoodGuys{}
class BadGuys extends  StoryCharacter {}
class BadMale extends BadGuys {}
class BadFemale extends BadGuys {}

public class Exe15_8 implements Generator<StoryCharacter>, Iterable<StoryCharacter> {
    private Class[] guys = {GoodMale.class, GoodFemale.class, BadMale.class, BadFemale.class};
    private Random rand = new Random(1);
    private int size;
    public Exe15_8() {}
    public Exe15_8(int x) {this.size = x;}

    public StoryCharacter next() {
        try {
            return (StoryCharacter) guys[rand.nextInt(guys.length)].getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    class StoryCharacterIterator implements Iterator<StoryCharacter> {
        private int count = size;
        public boolean hasNext() { return count>0; }
        public StoryCharacter next() {
            count--;
            return Exe15_8.this.next();
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<StoryCharacter> iterator() {
        return new StoryCharacterIterator();
    }

    public static void main(String[] args) {
        Exe15_8 e = new Exe15_8(12);
        for (StoryCharacter sc:e) {
            System.out.print(sc+"_");
        }
    }
}
