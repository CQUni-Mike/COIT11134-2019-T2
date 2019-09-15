/*share.zoom.us
	565 832 073
*/
public class Week08Q01
{
   public static <T> boolean isEqualTo (T first, T second)
   {
	   return first.equals (second);
   }

   public static void main( String[] args )
   {
	   Integer i1 = 15;
	   Integer i2 = 15;
	   System.out.println (isEqualTo (i1, i2) );

	   int i3 = 15;
	   int i4 = 15;
	   System.out.println (isEqualTo (i3, i4) );

	   String s1 = "Frankie";
	   String s2 = "frankIE";
	   System.out.println (isEqualTo (s1, s2) );

	   Object o1 = new Object ();
	   //Object o2 = new Object ();
	   Object o2 = o1;
	   System.out.println (isEqualTo (o1, o2) );

	   // Employee,
	   // Next week: Vehicles, Cars, Trucks
   }
}



