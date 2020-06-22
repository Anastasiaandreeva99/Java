package com.company;
 class Car
 {
       private boolean engine;
       private int cylinders;
       private String name;
       private int wheels;

     public Car(int cylinders, String name) {
         if(cylinders>0)
             this.cylinders = cylinders;
         else
             this.cylinders = 0;
         this.name = name;
         this.wheels=4;
     }
     public void accelarate()
     {
         System.out.println("We are accelerating : " + wheels*cylinders*1);
     }
     public void brake()
     {
         System.out.println("We are braking the car");
     }
     public boolean isEngine() {
         return engine;
     }

     public int getCylinders() {
         return cylinders;
     }

     public String getName() {
         return name;
     }

     public int getWheels() {
         return wheels;
     }
 }
 class Bicycle extends Car{
     public Bicycle(int cylinders, String name) {
         super(cylinders, name);
     }
     public void accelarate()
     {
         System.out.println("We are accelerating : " + super.getWheels()*super.getCylinders()*0.2);
     }
     public void brake()
     {
         System.out.println("We are braking the bicycle");
     }
 }
class SuperCar extends Car{
    public SuperCar(int cylinders, String name) {
        super(cylinders, name);
    }
    public void accelarate()
    {
        System.out.println("We are accelerating : " + super.getWheels()*super.getCylinders()*2);
    }
    public void brake()
    {
        System.out.println("We are braking the SuperCar");
    }
}
public class Main {

    public static void main(String[] args) {
       Car newCar = new SuperCar(3,"sisi");
    }
}
