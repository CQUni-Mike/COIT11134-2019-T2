<<<<<<< HEAD
/*
     Author: Mike O'Malley (lecturer)
       File: Car.java
Description: Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks
REF:
https://github.com/CQUni-Mike/COIT11134-Week-02-Vehicles-Cars-Trucks

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
      return   super.toString() + "\t" +
               numPass;
   }

=======
/*
     Author: Mike O'Malley (lecturer)
       File: Car.java
Description: Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks
REF:
https://github.com/CQUni-Mike/COIT11134-Week-02-Vehicles-Cars-Trucks

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
      return   super.toString() + "\t" +
               numPass;
   }

>>>>>>> 929af2c9987c25be0a4988ea901ed5ba0fd38f6d
} // public class Car