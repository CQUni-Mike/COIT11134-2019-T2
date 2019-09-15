/*
     Author: Mike O'Malley (lecturer)
       File: Vehicle.java
Description: Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks
REF:


*/
public class Vehicle
{
   private String model;
   private String buildDate;
   private double fuelEcon;

   // Default Constructor
   public Vehicle ()
   {
      model     = "";
      buildDate = "";
      fuelEcon  = 0;
   }

   // Parameterised Constructor
   public Vehicle (String model, String buildDate,
                   double fuelEcon)
   {
      this.model     = model;
      this.buildDate = buildDate;
      this.fuelEcon  = fuelEcon;
   }

   // Accessors / Getter

   public String getModel ()
   {
      return model;
   }

   public String getBuildDate ()
   {
      return buildDate;
   }

   public double getFuelEcon ()
   {
      return fuelEcon;
   }

   // Mutators / Setters

   public void setModel (String model)
   {
      this.model     = model;
   }

   public void setBuildDate (String buildDate)
   {
      this.buildDate = buildDate;
   }

   public void setFuelEcon (double fuelEcon)
   {
      this.fuelEcon  = fuelEcon;
   }

   @Override
   public String toString()
   {
      return   String.format ("%-10s", getClass().getName ()) +
            String.format ("%-20s", model)     +
            String.format ("%-10s", buildDate) +
               String.format ("%8.2f", fuelEcon);
   }
} // public class Vehicle