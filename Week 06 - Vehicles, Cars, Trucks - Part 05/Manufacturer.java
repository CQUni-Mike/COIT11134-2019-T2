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

   public static String toStringHeader()
   {
      return String.format ("%-12s", "Name")     +
            String.format  ("%-12s", "Address")  +
            String.format  ("%-10s", "Build pw");
   }

   @Override
   public String toString()
   {
      return   //String.format ("%-10s", getClass().getName ()) +
            String.format ("%-12s", name)     +
            String.format ("%-12s", address) +
            String.format ("%10.2f", buildCapacity);
   }

   public static void main(String[] args)
   {
      Manufacturer m = new Manufacturer ("Super Motors", "123 Smith St", 100);

      System.out.println (toStringHeader());
      System.out.println (m);
   }

} // public class Manufacturer