public class EmployeeTester
{
	public static void main (String[] args)
	{
		// Error:  cannot instantiate an interface
		//Payable pay = new Payable ();

		// Error: abstract class.
		//Employee  emp = new Employee ();

		SalariedEmployee em1 = new SalariedEmployee ();

		SalariedEmployee em2 = new SalariedEmployee
		    ("Mike", "Omalley", "1234345", 100.99);

		SalariedEmployee em3 = new SalariedEmployee
		    ("Mike", "Omalley", "1234345", 101.99);

		System.out.println (em1);
		System.out.println (em2);
		System.out.println ("em2 VS em3: "  + em2.compareTo (em3) );
		System.out.println ("em2 VS null: " + em2.compareTo (null) );
		System.out.println ("em3 VS em2: "  + em3.compareTo (em2) );
		System.out.println ("em3 VS em1: "  + em3.compareTo (em1) );

		System.out.println ("em3 VS em1: "  + em3.equals (em1) );
		System.out.println ("em1 VS em1: "  + em1.equals (em1) );

		// error: bad operand types for binary operator '<'
		//if (em2 < em3)
		//  System.out.println ("Less");

/*
You simply can't apply the > operator between objects.

int comparisonResult = comparator.compare(current.getValue(), t.getValue());
if (comparisonResult > 0) {
  // current "greater than" t
} else if (comparisonResult < 0) {
  // current "less than" t
} else {
  // Equal
}
*/
	}
}