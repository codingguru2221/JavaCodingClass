// Parent Class (Base Class)
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

// Child Class (Car inherits Vehicle)
class Car extends Vehicle {
    int doors;

    void openTrunk() {
        System.out.println("Car trunk is opened.");
    }
}

// Child Class (Bike inherits Vehicle)
class Bike extends Vehicle {
    boolean hasCarrier;

    void doWheelie() {
        System.out.println("Bike is doing a wheelie!");
    }
}

class Student {
    private String name;  // private data member
    private int age;

    // Getter and Setter (Encapsulation)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0) this.age = age;
    }
}

class MathOperation {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a ,int b ,int c){
        return a+b+c;
    }

    double add(double a, double b) {
        return a + b;
    }
}


public class Day_05 {
    public static void main(String[] args) {
        // Car Object
        Car myCar = new Car();
        myCar.brand = "Tesla";
        myCar.wheels = 4;
        myCar.doors = 4;
        myCar.start();        // inherited
        myCar.openTrunk();    // specific to Car
        myCar.stop();

        System.out.println();

        // Bike Object
        Bike myBike = new Bike();
        myBike.brand = "Yamaha";
        myBike.wheels = 2;
        myBike.hasCarrier = true;
        myBike.start();       // inherited
        myBike.doWheelie();   // specific to Bike
        myBike.stop();


        Student s = new Student();
        s.setName("Codex");
        s.setAge(20);
        System.out.println(s.getName() + " " + s.getAge());

        MathOperation m = new MathOperation();
        System.out.println(m.add(5, 10));
        System.out.println(m.add(5.5, 6.5));
    }
}
