
import ????.????.Scanner;
import ????.????.FileReader;

:::::

try
{
	Scanner inFile = new Scanner(new FileReader("file.txt"));

	while(inFile.hasNext()) // more data ?
	{
		// NOTE:
		// The order you write the data needs to be exactly
		// the same as the order in which read the data !!

		String field1 = inFile.nextLine();
		String field2 = inFile.nextLine();
		int    field3 = inFile.nextInt();
		::: etc
		Vehicle v = new Vehicle (???, ????, ????);
		arraylist.add (v);
	 }

	 inFile.close();
   }
   catch(FileNotFoundException ex)
   {
	   ???
   }
   catch(NoSuchElementException ex)
   {
	   ???
   }


