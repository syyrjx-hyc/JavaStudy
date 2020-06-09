package Interfaces;

class Run {}
class FastRun extends Run {}

interface move1 {
    Run move();
}
interface move2 extends move1{
    FastRun move();
}

public class MyTest{

}



