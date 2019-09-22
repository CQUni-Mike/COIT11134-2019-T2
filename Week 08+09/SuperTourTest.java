/*
Required output:
	Name = Sydney, price = $250
	Name = National Parks, price = $110.75
*/
public class SuperTourTest
{
	public static void main( String [] args)
	{
		SuperTour<String,Integer> tour1 = new SuperTour<String,Integer>("Sydney", 250);
		SuperTour<String,Double>  tour2 = new SuperTour<String,Double>("National Parks", 110.75);

		System.out.println(tour1);
		System.out.println(tour2);

		SuperTour<String,String>  tour3 = new SuperTour<String,String>("National Parks", "Frankie");
		System.out.println(tour3);

		// Homework:
		//Employee e1 = new Employee ("Mike", 200);
		///SuperTour<String>  tour4 = new SuperTour<String>("National Parks", e1);
		//System.out.println(tour4);

		SuperTour<String,SuperTour>  tour5 = new SuperTour<String,SuperTour>("National Parks", tour1);
		System.out.println(tour5);
	}
}
