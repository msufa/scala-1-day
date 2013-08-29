package javax;

import java.util.*;

enum Garage {
  INSTANCE;
  private final static List<Vehicle> vehicleList = new LinkedList<Vehicle>();

  public static void addVehicle(Vehicle vehicle) {
    vehicleList.add(vehicle);
  }

  public static List<Vehicle> getVehicles() {
    return vehicleList;
  }
}

class Vehicle {
  private final String make;
  private final int wheelCount;

  protected Vehicle(final String make, final int wheelCount) { 
    this.make = make; 
    this.wheelCount = wheelCount; 
  }

  protected String getMake() { return make; }
  protected int getWheelCount() { return wheelCount; }
}

class Car extends Vehicle {
  public Car(final String make) { 
    super(make, 4); 
  }
}

class Truck extends Vehicle {
  public Truck(final String make) { 
    super(make, 18); 
  }
}

interface Convertible {
  void openTop();
  void closeTop();
}

class SportsCar extends Car implements Convertible {
  public SportsCar(final String make) { 
    super(make); 
  }

  @Override
  public void openTop() {
    System.out.println("Top is open");
  }

  @Override
  public void closeTop() {
    System.out.println("Top is closed");
  }
}

public class ClassesTraitsObjects {
  public static void main(String[] args) {
    Garage.addVehicle(new Car("BMW"));
    Garage.addVehicle(new SportsCar("Maserati"));
    Garage.addVehicle(new Truck("Scania"));

    for (Vehicle vehicle : Garage.getVehicles()) {
      System.out.println("This vehicle is a " + vehicle.getMake() + " and has " + vehicle.getWheelCount() + " wheels");
      if (vehicle instanceof Convertible) {
        System.out.println("Oooh, this vehicle is a convertible. Let's play with the top!");
        Convertible convertible = (Convertible)vehicle;
        convertible.openTop();
        convertible.closeTop();
      }
    }
  }
}
