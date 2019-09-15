/*
     Author: Mike O'Malley (lecturer)
       File: VehicleTesterArray.java
Description: Question 02.
             Tester / Runner class for:
             Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks
             Add: Array.
REF:

*/
public class VehicleTesterArray
{
   public static void main (String[] args)
   {
      Vehicle v1 = new Vehicle ();
      System.out.println (v1);

      Vehicle v2 = new Vehicle ("Porsche", "2020-Dec", 3);
      System.out.println (v2);

      Car c1 = new Car ("Lambo", "Dec-2020", 2, 2);
      System.out.println (c1);

      Vehicle[] arr = new Vehicle [9];
      arr[0] = new Vehicle ();
      arr[1] = new Vehicle ("Porsche", "2020-Dec", 3);
      arr[2] = new Car ("Lambo", "Dec-2020", 2, 2);
      arr[3] = c1;
      arr[4] = new Truck ("Mac", "Jan-1980", 1, 20);
      arr[5] = new Car ("Ford", "Jan-2018", 2, 5);
      arr[6] = new Car ("Toyota Torago", "Feb-2017", 2, 9);
      arr[7] = new Truck ("Kenworth", "Jan-1980", 1, 18.6);
      arr[8] = new Truck ("Inter", "Jan-1980", 1, 4.7);

      System.out.println ("\n\n");
      for (int k = 0; k < arr.length; k++)
      {
         System.out.println (arr[k]);
      }

      // Total carrying capacity for all trucks:
      double totalCapacity = 0.0;
      for (Vehicle v : arr)
      {
         if (v instanceof Truck) // Is v a truck ???
         {
            totalCapacity +=  // Typecasting
                 ((Truck) v).getLoadingCapacity ();
         }
      }
      System.out.println ("Total Capacity: " + totalCapacity);

      // Average number of passengers per Car:
      int totalPass = 0;
      int carCount  = 0;
      for (Vehicle v : arr)
      {
         if (v instanceof  Car)  // Is v a Car ???
         {
            totalPass +=  // Typecasting
                  ((Car)v).getNumPass ();
             carCount++;
         }
      }
      if (carCount == 0)
         System.out.println ("Avg Pass: 0 (no cars)");
      else
         System.out.println ("Avg Pass: " +
               1.0 * totalPass /  carCount);

   }
} // public class VehicleTesterArray