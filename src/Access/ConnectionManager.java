package Access;

class Connection {
    private static int count = 0;
    private Connection() {
        System.out.println("private constructor "+count);
    }
    public static Connection cons() {
        count ++;
        return new Connection();
    }
    public int howMany() {
        return count;
    }
    public String toString() {
        return ("Connection "+count);
    }
}

public class ConnectionManager {
    static int howManyLeft = 3;
    static Connection[] ca = new Connection[3];
    {
        for (Connection c: ca) {
            c = Connection.cons();
        }
    }
    public static Connection getConnection() {
        if(howManyLeft > 0)
            return ca[--howManyLeft];
        else {
            System.out.println("No more connections");
            return null;
        }
    }
    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        System.out.println(cm.howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(cm.getConnection());
        System.out.println(howManyLeft);
    }
}
