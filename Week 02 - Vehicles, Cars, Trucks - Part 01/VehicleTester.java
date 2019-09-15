<<<<<<< HEAD
/*
     Author: Mike O'Malley (lecturer)
       File: VehicleTester.java
Description: Question 01.
             Tester / Runner class for:
             Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks
REF:
https://github.com/CQUni-Mike/COIT11134-Week-02-Vehicles-Cars-Trucks

*/
public class VehicleTester
{
   public static void main (String[] args)
   {
      // Create some individual Vehicle, Car objects:

      Vehicle v1 = new Vehicle ();
      System.out.println (v1);

      Vehicle v2 = new Vehicle ("Porsche", "2020-Dec", 3);
      System.out.println (v2);

      Car c1 = new Car ("Lambo", "Dec-2020", 2, 2);
      System.out.println (c1);



      // Use an Array:

      Vehicle[] arr = new Vehicle [5];
      arr[0] = new Vehicle ();
      arr[1] = new Vehicle ("Porsche", "2020-Dec", 3);
      arr[2] = new Car ("Lambo", "Dec-2020", 2, 2);
      arr[3] = c1;
      arr[4] = new Truck ("Mac", "Jan-1980", 1, 20);

      System.out.println ("\n\n");
      for (int k = 0; k < arr.length; k++)
      {
         System.out.println (arr[k]);
      }

   }
=======
/*
     Author: Mike O'Malley (lecturer)
       File: VehicleTester.java
Description: Question 01.
             Tester / Runner class for:
             Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks
REF:
https://github.com/CQUni-Mike/COIT11134-Week-02-Vehicles-Cars-Trucks

*/
public class VehicleTester
{
   public static void main (String[] args)
   {
      // Create some individual Vehicle, Car objects:

      Vehicle v1 = new Vehicle ();
      System.out.println (v1);

      Vehicle v2 = new Vehicle ("Porsche", "2020-Dec", 3);
      System.out.println (v2);

      Car c1 = new Car ("Lambo", "Dec-2020", 2, 2);
      System.out.println (c1);



      // Use an Array:

      Vehicle[] arr = new Vehicle [5];
      arr[0] = new Vehicle ();
      arr[1] = new Vehicle ("Porsche", "2020-Dec", 3);
      arr[2] = new Car ("Lambo", "Dec-2020", 2, 2);
      arr[3] = c1;
      arr[4] = new Truck ("Mac", "Jan-1980", 1, 20);

      System.out.println ("\n\n");
      for (int k = 0; k < arr.length; k++)
      {
         System.out.println (arr[k]);
      }

   }
>>>>>>> 929af2c9987c25be0a4988ea901ed5ba0fd38f6d
} // public class VehicleTester