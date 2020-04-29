package Exceptions;

class VeryImportantException extends Exception {
    @Override public String toString() { return "Very important"; }
}

class TrivialException extends Exception {
    @Override public String toString() { return "Trivial important"; }
}

class LittleException extends Exception {
    @Override public String toString() { return "Little important"; }
}

public class Exe12_18 {
    public static void f() throws VeryImportantException {throw new VeryImportantException();}
    public static void g() throws TrivialException {throw new TrivialException();}
    public static void h() throws LittleException {throw new LittleException();}

    public static void main(String[] args) {
        try { f(); } catch (Exception e) { System.out.println(e); } finally {
            try { g(); } catch (Exception e) { System.out.println(e); } finally {
                try { h(); } catch (Exception e) { System.out.println(e); } finally {
                    System.out.println("Ends");
                }
            }
        }
    }
}
