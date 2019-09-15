/*
Required output:
	Name = Sydney, price = $250
	Name = National Parks, price = $110.75
*/
public class TourTest
{
	public static void main( String [] args)
	{
		Tour<Integer> tour1 = new Tour<Integer>("Sydney", 250);
		Tour<Double>  tour2 = new Tour<Double>("National Parks", 110.75);

		System.out.println(tour1);
		System.out.println(tour2);

		Tour<String>  tour3 = new Tour<String>("National Parks", "Frankie");
		System.out.println(tour3);

		// Homework:
		//Employee e1 = new Employee ("Mike", 200);
		///Tour<String>  tour4 = new Tour<String>("National Parks", e1);
		//System.out.println(tour4);

		Tour<Tour>  tour5 = new Tour<Tour>("National Parks", tour1);
		System.out.println(tour5);
	}
}
