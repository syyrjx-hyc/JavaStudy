package Holding;

import java.util.*;

class Command {
    private static int count=0;
    public String name = "Command"+(count++);
    public void operation() {
        System.out.println(name);
    }
}

class AddCommand {
    public static Queue<Command> addCommand(Queue<Command> q) {
        for (int i=0;i<10;i++) {
            q.offer(new Command());
        }
        return q;

    }
}

public class Exe11_27 {
    public static void main(String[] args) {


        Queue<Command> q = new LinkedList<Command>();
        AddCommand.addCommand(q);
        while (!q.isEmpty())
            q.poll().operation();

    }
}
