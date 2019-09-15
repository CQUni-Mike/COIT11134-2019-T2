<<<<<<< HEAD
/*
     Author: Mike O'Malley (lecturer)
       File: Truck.java
Description: Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks
REF:
https://github.com/CQUni-Mike/COIT11134-Week-02-Vehicles-Cars-Trucks

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
      return   super.toString() + "\t" +
               loadingCapacity;
   }

=======
/*
     Author: Mike O'Malley (lecturer)
       File: Truck.java
Description: Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks
REF:
https://github.com/CQUni-Mike/COIT11134-Week-02-Vehicles-Cars-Trucks

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
      return   super.toString() + "\t" +
               loadingCapacity;
   }

>>>>>>> 929af2c9987c25be0a4988ea901ed5ba0fd38f6d
} // public class Truck