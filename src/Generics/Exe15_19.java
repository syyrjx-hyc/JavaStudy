package Generics;

import java.util.*;

class Product {
    private final int id;
    private final String name;
    private int room;
    public static Random rand = new Random(3);
    public Product(int productId, String productName, int productPosition) {
        this.id = productId; this.name = productName; this.room = productPosition;
    }

    @Override public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + ", position=" + room + '}';
    }
    public void moveProduct(int newProductPosition) {
        this.room = newProductPosition;
    }
    public static Generator<Product> buyProduct() {
        return new Generator<Product>() {
            @Override public Product next() {
                return new Product(rand.nextInt(100000), "Product",rand.nextInt(100));
            }
        };
    }
}

class Room extends ArrayList<Product> {
    public Room(int productNumber) {
        Exe15_13.fill(this,Product.buyProduct(),Product.rand.nextInt(productNumber));
    }
}

class Floor extends ArrayList<Room> {
    public Floor(int roomNumber, int productNumber) {
        for (int i=0;i<roomNumber;i++) add(new Room(productNumber));
    }
}

public class Exe15_19 extends ArrayList<Floor> {
    public Exe15_19(int floorNumber, int roomNumber, int productNumber) {
        for (int i=0;i<floorNumber;i++) add(new Floor(roomNumber, productNumber));
    }

    public static void main(String[] args) {
        Exe15_19 ship = new Exe15_19(3,2,5);
        for (Floor f:ship){
            for (Room r:f) {
                System.out.println(r);
            }
        }
    }
}
