import ???.???.Formatter;
import ???.???.FileNotFoundException;
import ???.???.NoSuchElementException;
import ???.???.FormatterClosedException;

  String fileName = "file.txt";

  try
  {
	 Formatter outputFile = new Formatter (fileName);

	 for (int k = 0; k < arrayList.size (); k++)
	 {
		// NOTE:
		// The order you write the data needs to be exactly
		// the same as the order in which read the data !!

		outputFile.format ("%s\n", stringArrayList.get (k).get????() );
		outputFile.format ("%s\n", stringArrayList.get (k).get????() );
		outputFile.format ("%s\n", stringArrayList.get (k).get????() );
		:::: etc
	 }

	 outputFile.close();

	 System.out.println (arrayList.size () + " lines written to: " + fileName);
  }
  catch(FileNotFoundException ex)
  {
	 System.out.println  ("File not found: " + fileName);
	 System.exit(-1);
  }
  catch(NoSuchElementException | FormatterClosedException ex)
  {

	 System.out.println ("Error writing to file: " + fileName);
	 System.exit(-1);
  }
