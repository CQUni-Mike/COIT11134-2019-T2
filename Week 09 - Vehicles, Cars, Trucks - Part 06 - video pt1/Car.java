/*
     Author: Mike O'Malley (lecturer)
       File: Car.java
Description: Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks
REF:

*/
public class Car extends Vehicle
{
   private int numPass;

   public Car ()
   {
      super();
      numPass = 0;
   }

   public Car (String model, String buildDate,
               double fuelEcon, int numPass)
   {
      super (model, buildDate, fuelEcon);
      this.numPass = numPass;
   }

   public Car (String model, String buildDate,
               double fuelEcon, Manufacturer manufacturer, int numPass)
   {
      super (model, buildDate, fuelEcon, manufacturer);
      this.numPass = numPass;
   }

   public int getNumPass ()
   {
      return numPass;
   }

   public void setNumPass (int numPass)
   {
      this.numPass = numPass;
   }

   @Override
   public String toString()
   {
      return   super.toString() + " " +
               String.format ("%5d", numPass) + " pass";
   }

} // public class Car
