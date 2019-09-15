/*share.zoom.us
	565 832 073
*/
public class Week08Q03
{
   public static <T> void printArray (T[] array)
   {
	   // Replace ALL this with a method call.
	   printArray (array, 0, array.length - 1);

	   //if (array != null)
	   //{
		//   for (int k = 0; k < array.length; k++)
		//      System.out.print (array[k] + ", ");
        //
		//  System.out.println ();
	   //}
   }

   public static <T> void printArray (T[] array, int start, int end)
   {
	   start = Math.max (0, start);
	   end   = Math.max (0, end);
	   end   = Math.min (array.length - 1, end);
	   start = Math.min (end, start);

	   if (array != null)
	   {
		   for (int k = start; k <= end; k++)
		      System.out.print (array[k] + ", ");

		  System.out.println ();
	   }
   }


   public static void main( String[] args )
   {
	   //printArray ({"Mike", "Frankie", "Bella"});

	   String[] names = {"Mike", "Frankie", "Bella"};
	   printArray (names);

	   printArray (names, 1, 2);
	   printArray (names, 0, 1);
	   printArray (names, 1, 1);

	   //int[] ints = {1, 44, 196}; // Java wont autobox arrays !!!!
	   Integer[] ints = {1, 44, 196, 311, 10, 88, 77, 44};
	   printArray (ints);

	   printArray (ints, 2, 5);

	   printArray (ints, -10, 1000);
	   printArray (ints, 1000, -10);

	   // Home work:
	   //Employee[] emps = { new Employee ("Mike", 100, ....),
	   //                    new Employee ("Fred", 220, ....),
	   //                    :::);

   }
}



