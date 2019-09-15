/*
     Author: Mike O'Malley (lecturer)
       File: Truck.java
Description: Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks
REF:

*/
public class Truck extends Vehicle
{
   private double loadingCapacity; // Tons

   public Truck ()
   {
      super();
      loadingCapacity = 0;
   }

   public Truck (String model, String buildDate,
               double fuelEcon, double loadingCapacity)
   {
      super (model, buildDate, fuelEcon);
      this.loadingCapacity = loadingCapacity;
   }

   public double getLoadingCapacity ()
   {
      return loadingCapacity;
   }

   public void setLoadingCapacity (double loadingCapacity)
   {
      this.loadingCapacity = loadingCapacity;
   }

   @Override
   public String toString()
   {
      return   super.toString() + " " +
               String.format ("%8.2f", loadingCapacity) + "T";
   }

} // public class Truck