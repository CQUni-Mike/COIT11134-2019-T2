/*
 Author: Mike O'Malley
 Source: .java
Descrtn: TBA ... :)

Ammendment History
Ver   Date        Author    Details
----- ----------- --------  ---------------------------------------------------
0.001 04-Sep-2019 Mike O    Created.


Create SalariedEmployee class as a concrete
subclass of Employee class with the following
instance field and complete the class with
parameterized constructor, getters, setters,
toString and getPaymentAmount() method:

	double weeklySalary;

Note: getPaymentAmount() method should return
weeklySalary value.

Extras:
* Add a compare method (implements what ???)

*/
public class SalariedEmployee  extends Employee
                               //Payable
{
	private double weeklySalary;

   // Default Consructor:
   public SalariedEmployee ()
   {
		this("", "", "", 0); // Call Parameterised Consructor
   }

   // Parameterised Consructor:
   public SalariedEmployee (String firstName, String lastName,
             String socialSecurityNumber, double weeklySalary)
   {
		// Call Employee constructor
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
   }

   // Accessors / Getters:

   public double getWeeklySalary ()
   {
      return weeklySalary;
   }

   // Mutators / Setters:

   public void setWeeklySalary (double weeklySalary)
   {
      this.weeklySalary = weeklySalary;
   }


   @Override
   public String toString ()
   {
      return super.toString() +
         " " + weeklySalary;
   }

// ERROR: SalariedEmployee is not abstract and does not
// override abstract method getPaymentAmount() in Payable

	@Override
   public double getPaymentAmount()
   {
	   return weeklySalary;
   }

   //SalariedEmployee is not abstract and does not
   //override abstract method compareTo(Object)
   //in Comparable

   @Override
   public int compareTo (Object obj2)
   {
	   if (obj2 == null)
	      return -1;  // Not equal.

	   if (obj2 instanceof SalariedEmployee)
	   {
		   double obj2Salary = ((SalariedEmployee)obj2).getPaymentAmount();

		   if (weeklySalary < obj2Salary)
		      return -1;
		   else if (weeklySalary == obj2Salary)
		      return 0;
		   else
		      return 1;
	   }
	   else
	   {
	      return -1;  // Not equal.
	   }
   }


} //
