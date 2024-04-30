package creational.factoryobject;

import java.util.Objects;

abstract class Vehicle {
  abstract int getWheel();

  @Override
  public String toString() {
    return "Vehicle{" +
        "wheel=" + this.getWheel() +
        '}';
  }
}

class Car extends Vehicle {
  int wheel;

  public Car(int wheel) {
    this.wheel = wheel;
  }

  @Override
  int getWheel() {
    return wheel;
  }
}

class Bike extends Vehicle {
  int wheel;

  public Bike(final int wheel) {
    this.wheel = wheel;
  }

  @Override
  int getWheel() {
    return wheel;
  }
}

class FactoryVehicle {
  public static Vehicle getInstance(String type, int wheel){
    if(Objects.equals(type, "car")){
      return new Car(wheel);
    }
    if(Objects.equals(type, "bike")){
      return new Bike(wheel);
    }
    return null;
  }
}

class FactoryExample {
  public static void main (String[] args){
    Vehicle car = FactoryVehicle.getInstance("car", 4);
    Vehicle bike = FactoryVehicle.getInstance("bike", 2);

    if(car != null && bike != null){
      System.out.println(car);
      System.out.println(bike);
    }
  }
}


