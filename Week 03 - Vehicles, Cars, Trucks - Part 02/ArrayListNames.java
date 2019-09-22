import java.util.ArrayList;

public class ArrayListNames
{
	ArrayList<Technician> techs = new ArrayList<Technician> ();

	Technician[] techArray = new Technician [10];
	int numAdded = 0;

	public static void main (String[] args)
	{
		ArrayList<String> names = new ArrayList<String> ();

		names.add ("Mike");
		names.add ("Frankie");

		if (nameTF.getText().trim().length() < 3)
		{
			jOptionPane.showMessageDialog (null, "Error ....");
		}
		else if  (phoneTF.getText().trim().length() < 3)
		{
			jOptionPane.showMessageDialog (null, "Error ....");
		}


		else
		{
			int k = 5;
			// All checks passed
			/*
			Technician t1 = new Technician (nameTF.getText(),
											phoneTF.getText(),
											....);
			techs.add (t1);
			*/
			techs.add (new Technician (nameTF.getText(),
											phoneTF.getText(),
											....) );

			techArray[numAdded] = new Technician (nameTF.getText(),
											phoneTF.getText(),
											....);
			numAdded++;

		}
		S.o.p (k); //






		String[] arr = new String [10];
		arr[0] = "Mike";
		arr[1] = "Frankie";
	}
}