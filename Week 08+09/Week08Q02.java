/*share.zoom.us
	565 832 073
*/
public class Week08Q02
{
   public static <T> void printArray (T[] array)
   {
	   if (array != null)
	   {
		   for (int k = 0; k < array.length; k++)
		      System.out.print (array[k] + ", ");

		  System.out.println ();
	   }
   }

   public static void main( String[] args )
   {
	   //printArray ({"Mike", "Frankie", "Bella"});

	   String[] names = {"Mike", "Frankie", "Bella"};
	   printArray (names);

	   //int[] ints = {1, 44, 196}; // Java wont autobox arrays !!!!
	   Integer[] ints = {1, 44, 196};
	   printArray (ints);


	   // Home work:
	   //Employee[] emps = { new Employee ("Mike", 100, ....),
	   //                    new Employee ("Fred", 220, ....),
	   //                    :::);

   }
}



