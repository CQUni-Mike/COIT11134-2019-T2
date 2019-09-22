/*
     Author: Mike O'Malley (lecturer)
       File: Manufacturer.java
Description: Manufacturer class.

*/
public class Manufacturer
{
   private String name;
   private String address;
   private double buildCapacity; // per day

   // Default Constructor
   public Manufacturer ()
   {
      name     = "";
      address = "";
      buildCapacity  = 0;
   }

   // Parameterised Constructor
   public Manufacturer (String name, String address,
                   double buildCapacity)
   {
      this.name          = name;
      this.address       = address;
      this.buildCapacity = buildCapacity;
   }

   // Accessors / Getter

   public String getName ()
   {
      return name;
   }

   public String getAddress ()
   {
      return address;
   }

   public double getBuildCapacity ()
   {
      return buildCapacity;
   }

   // Mutators / Setters

   public void setName (String name)
   {
      this.name     = name;
   }

   public void setAddress (String address)
   {
      this.address = address;
   }

   public void setBuildCapacity (double buildCapacity)
   {
      this.buildCapacity  = buildCapacity;
   }


   @Override
   public String toString()
   {
      return   //String.format ("%-10s", getClass().getName ()) +
            String.format ("%-20s", name)     +
            String.format ("%-10s", address) +
            String.format ("%8.2f", buildCapacity);
   }

} // public class Manufacturer