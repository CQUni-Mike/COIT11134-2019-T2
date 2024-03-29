/*
     Author: Mike O'Malley (lecturer)
       File: VehicleTesterArray.java
Description: Question 02.
             Tester / Runner class for:
             Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks
             Change from Array to ArrayList.

See "README.md" for question details.


*/
import java.util.ArrayList;

public class VehicleTesterArrayList
{
   private static ArrayList<Vehicle> arr = new ArrayList<Vehicle> ();

   private static void loadData ()
   {
      //Vehicle v1 = new Vehicle ();
      //System.out.println (v1);

      //Vehicle v2 = new Vehicle ("Porsche", "2020-Dec", 3);
      //System.out.println (v2);

      Car c1 = new Car ("Lambo", "Dec-2020", 2, 2);
      //System.out.println (c1);

      arr.add (new Vehicle () );
      arr.add (new Vehicle ("Porsche", "2020-Dec", 3) );
      arr.add (new Car ("Lambo", "Dec-2020", 2, 2) );
      arr.add (c1);
      arr.add (new Truck ("Mac", "Jan-1980", 1, 20) );
      arr.add (new Car ("Ford", "Jan-2018", 2, 5) );
      arr.add (new Car ("Toyota Torago", "Feb-2017", 2, 9) );
      arr.add (new Truck ("Kenworth", "Jan-1980", 1, 18.6) );
      arr.add (new Truck ("Inter", "Jan-1980", 1, 4.7) );
   }

   private static void displayVehicles()
   {
      for (int k = 0; k < arr.size(); k++)
      {
         System.out.println (arr.get(k) );
      }
      System.out.println ("-> " + arr.size() +
         " vehicles listed.");

      System.out.println ("-> Total Capacity: " +
         getTotalTruckCapacity () );

      System.out.println ("-> Avg Pass: " +
               getAveragePassengersPerCar () );
      System.out.println ();
   }

   private static double getTotalTruckCapacity ()
   {
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

      return totalCapacity;
   }

   private static double getAveragePassengersPerCar ()
   {
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

      double average = 0;

      if (carCount > 0)
         average = 1.0 * totalPass /  carCount;

      return average;
   }

   public static void main (String[] args)
   {
      loadData ();

      displayVehicles();


      arr.remove (3); // Delete 4th item in arraylist

      // Insert truck at row 6
      arr.add (6, new Truck ("BigBoy", "Jan-1980", 1, 20) );

      displayVehicles();

      // Delete everything in the arraylist
      arr.clear();
   }
}