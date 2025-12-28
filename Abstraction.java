// Abstraction: WHAT to do
abstract class Vehicle {
    abstract void start(); // method without implementation
}

// Implementation: HOW to do
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

// Using abstraction
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car(); // abstraction
        v.start();
    }
}
