// ---------- Inheritance Example ----------
class Vehicle {
    String brand;
    int wheels;

    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car extends Vehicle {
    int doors;

    void openTrunk() {
        System.out.println("Car trunk is opened.");
    }
}

class Bike extends Vehicle {
    boolean hasCarrier;

    void doWheelie() {
        System.out.println("Bike is doing a wheelie!");
    }
}

// ---------- Encapsulation Example ----------
class Student {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if(age > 0) this.age = age;
    }
}

// ---------- Polymorphism Example ----------
class MathOperation {
    int add(int a, int b) { return a + b; }
    int add(int a ,int b ,int c){ return a+b+c; }
    double add(double a, double b) { return a + b; }
}

// ---------- Abstraction Example (Abstract Class) ----------
abstract class Vehicle1 {
    abstract void start();

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car1 extends Vehicle1 {
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike1 extends Vehicle1 {
    void start() {
        System.out.println("Bike starts with a kick or button.");
    }
}

// ---------- Abstraction Example (Interface) ----------
interface Payment {
    void pay(int amount);
}

class CreditCardPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UpiPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

// ---------- Main Class ----------
public class Day_05 {
    public static void main(String[] args) {
        // Inheritance
        Car myCar = new Car();
        myCar.brand = "Tesla";
        myCar.wheels = 4;
        myCar.doors = 4;
        myCar.start();
        myCar.openTrunk();
        myCar.stop();

        System.out.println();

        Bike myBike = new Bike();
        myBike.brand = "Yamaha";
        myBike.wheels = 2;
        myBike.hasCarrier = true;
        myBike.start();
        myBike.doWheelie();
        myBike.stop();

        System.out.println();

        // Encapsulation
        Student s = new Student();
        s.setName("Codex");
        s.setAge(20);
        System.out.println("Student: " + s.getName() + " " + s.getAge());

        System.out.println();

        // Polymorphism
        MathOperation m = new MathOperation();
        System.out.println("Add 2 ints: " + m.add(5, 10));
        System.out.println("Add 3 ints: " + m.add(2, 3, 4));
        System.out.println("Add 2 doubles: " + m.add(5.5, 6.5));

        System.out.println();

        // Abstraction with Abstract Class
        Vehicle1 v1 = new Car1();
        v1.start();
        v1.stop();

        Vehicle1 v2 = new Bike1();
        v2.start();
        v2.stop();

        System.out.println();

        // Abstraction with Interface
        Payment p1 = new CreditCardPayment();
        p1.pay(1000);

        Payment p2 = new UpiPayment();
        p2.pay(500);
    }
}
