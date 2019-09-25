/*
     Author: Mike O'Malley (lecturer)
       File: VehicleGUI.java
Description: Question 05.
             GUI class for:
             Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks

See "README.md" for question details.

*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class VehicleGUI extends JFrame
{
   public static final double MIN_FUEL_ECON      = 5.0;  // L/Km
   public static final double MAX_FUEL_ECON      = 10.0;
   public static final int    MIN_CAR_PASSENGERS = 0;    // Excl. driver
   public static final int    MAX_CAR_PASSENGERS = 10;
   public static final double MIN_TRUCK_LOADING  = 3.5;  // Tons
   public static final double MAX_TRUCK_LOADING  = 40.0;


   JLabel makeLabel              = new JLabel ("Make: ");
   JTextField makeTextField      = new JTextField (20);
   JLabel buildDateLabel         = new JLabel ("Build Date: ");
   JTextField buildDateTextField = new JTextField (10);
   JLabel fuelEconLabel          = new JLabel ("Fuel Economy: ");
   JTextField fuelEconTextField  = new JTextField (5);
   JLabel vehicleLabel             = new JLabel ("Select vehicle type: ");
   JLabel carPassengersLabel          = new JLabel ("Car Passengers: ");
   JTextField carPassengersTextField  = new JTextField (5);
   JLabel truckLoadingCapacityLabel         = new JLabel ("Truck Loading Capacity: ");
   JTextField truckLoadingCapacityTextField = new JTextField (5);


   JRadioButton vehicleRadioButton = new JRadioButton ("Vehicle");
   JRadioButton carRadioButton     = new JRadioButton ("Car");
   JRadioButton truckRadioButton   = new JRadioButton ("Truck");
   ButtonGroup  vehiclesGroup      = new ButtonGroup ();

   JLabel manufacturersLabel               = new JLabel ("Manufacturer: ");
   JComboBox<String> manufacturersComboBox = new JComboBox<String> ();

   JTextArea reportTextArea = new JTextArea ();
   JScrollPane scrollPane   = new JScrollPane (reportTextArea);
   JButton addButton        = new JButton ("Add");
   JButton displayButton    = new JButton ("Display");
   JButton exitButton       = new JButton ("Exit");
   JButton testDataButton   = new JButton ("Test Data");
   JButton searchButton     = new JButton ("Search");
   JButton fileReadButton   = new JButton ("File Read");
   JButton fileWriteButton  = new JButton ("File Write");


   private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle> ();

   private ArrayList<Manufacturer> manufacturers
           = new ArrayList<Manufacturer>();



   public VehicleGUI()
   {
      setVisible (true);
      setTitle ("My Vehicles App v0.001");
      setLocation (100, 100);
      setSize (600, 500);
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);


      JTabbedPane pane = new JTabbedPane ();
      pane.addTab ("Display",   null, createDisplayPanel (), "Tab 1 tool tip");
      pane.addTab ("Tab2",      null, new JPanel (),         "Tab 2 tool tip");
      pane.addTab ("Tab3",      null, new JPanel (),         "Tab 3 tool tip");

      add (pane, BorderLayout.CENTER);


      // Setup my own "Window Closing" method that runs when
      // the user clicks the "X" icon.
      addWindowListener (new WindowAdapter()
      {
         public void windowClosing (WindowEvent e)
         {
            exitApplication ();
         }
      });

      clearInputs();


      manufacturers.add (new Manufacturer ("Holden", "Adelaide", 2000));
      manufacturers.add (new Manufacturer ("Ford",   "Geelong",  2500));
      manufacturers.add (new Manufacturer ("Mazda",  "Adelaide", 1500));

      for (int k = 0; k < manufacturers.size(); k++)
      {
         manufacturersComboBox.addItem (manufacturers.get(k).toString() );
      }

      //testData();
      fileRead();
      display("");

	}

   private JPanel createDisplayPanel ()
   {
	  JPanel displayPanel = new JPanel(new BorderLayout() );

      reportTextArea.setFont (new Font ("Courier New", Font.BOLD, 16) );
      reportTextArea.setEditable (false);

      JPanel gridPanel = new JPanel (new GridLayout (7, 2) );//R,C

      JPanel vehicleTypePanel = new JPanel (new
                                FlowLayout(FlowLayout.CENTER) );

      //vehicleTypePanel.add (vehicleLabel);
      vehicleTypePanel.add (vehicleRadioButton);
      vehicleTypePanel.add (carRadioButton);
      vehicleTypePanel.add (truckRadioButton);

      vehiclesGroup.add (vehicleRadioButton);
      vehiclesGroup.add (carRadioButton);
      vehiclesGroup.add (truckRadioButton);

      gridPanel.add (vehicleLabel);
      gridPanel.add (vehicleTypePanel);

      gridPanel.add (makeLabel);
      gridPanel.add (makeTextField);
      gridPanel.add (buildDateLabel);
      gridPanel.add (buildDateTextField);
      gridPanel.add (fuelEconLabel);
      gridPanel.add (fuelEconTextField);
      gridPanel.add (manufacturersLabel);
      gridPanel.add (manufacturersComboBox);

      gridPanel.add (carPassengersLabel);
      gridPanel.add (carPassengersTextField);
      gridPanel.add (truckLoadingCapacityLabel);
      gridPanel.add (truckLoadingCapacityTextField);


      JPanel buttonsPanel = new JPanel ();
      buttonsPanel.add (testDataButton);
      buttonsPanel.add (new JLabel ("    ") );
      buttonsPanel.add (addButton);
      buttonsPanel.add (displayButton);
      buttonsPanel.add (searchButton);
      buttonsPanel.add (fileReadButton);
      buttonsPanel.add (fileWriteButton);
      buttonsPanel.add (exitButton);

      displayPanel.add (gridPanel,    BorderLayout.NORTH);
      displayPanel.add (scrollPane,   BorderLayout.CENTER);
      displayPanel.add (buttonsPanel, BorderLayout.SOUTH);


      addButton.addActionListener       (event -> addVehicle() );
      displayButton.addActionListener   (event -> display("") );
      exitButton.addActionListener      (event -> exitApplication() );
      testDataButton.addActionListener  (event -> testData() );
      searchButton.addActionListener    (event -> searchByManufacturer() );
      fileReadButton.addActionListener  (event -> fileRead() );
      fileWriteButton.addActionListener (event -> fileWrite() );

      vehicleRadioButton.addActionListener (event -> vehicleSelected() );
      carRadioButton.addActionListener     (event -> vehicleSelected() );
      truckRadioButton.addActionListener   (event -> vehicleSelected() );

      return displayPanel;
   }

   private void vehicleSelected()
   {
      //System.out.println ("You clicked a radiobutton");

      carPassengersLabel.setEnabled            (false);
      carPassengersTextField.setEnabled        (false);
      truckLoadingCapacityLabel.setEnabled     (false);
      truckLoadingCapacityTextField.setEnabled (false);

      if (carRadioButton.isSelected() == true)
      {
         carPassengersLabel.setEnabled            (true);
         carPassengersTextField.setEnabled        (true);
      }
      else if (truckRadioButton.isSelected() == true)
      {
         truckLoadingCapacityLabel.setEnabled     (true);
         truckLoadingCapacityTextField.setEnabled (true);
      }

   }

   private void addVehicle()
   {
      String make        = makeTextField.getText().trim();
      String buildDate   = buildDateTextField.getText().trim();
      String fuelEconStr = fuelEconTextField.getText().trim();
      String carPassengersStr = carPassengersTextField.getText().trim();
      String truckLoadingCapacityStr = truckLoadingCapacityTextField.getText().trim();
      double fuelEcon    = 0;
      int    carPassengers        = 0;
      double truckLoadingCapacity = 0;

      try
      {
         fuelEcon    = Double.parseDouble (fuelEconStr);
      }
      catch (Exception err)
      {
          fuelEcon    = MIN_FUEL_ECON - 1; // An Error
      }

      try
      {
         carPassengers    = Integer.parseInt (carPassengersStr);
      }
      catch (Exception err)
      {
          carPassengers   = MIN_CAR_PASSENGERS - 1; // An Error
      }

      try
      {
         truckLoadingCapacity   = Double.parseDouble (truckLoadingCapacityStr);
      }
      catch (Exception err)
      {
          truckLoadingCapacity  = MIN_TRUCK_LOADING - 1; // An Error
      }

      makeTextField.setBackground                  (Color.white);
      buildDateTextField.setBackground             (Color.white);
      fuelEconTextField.setBackground              (Color.white);
      carPassengersTextField.setBackground         (Color.white);
      truckLoadingCapacityTextField.setBackground  (Color.white);


      if (make.length() == 0)
      {
         // Display an error
         JOptionPane.showMessageDialog (VehicleGUI.this,
            "Error: Make cannot be blank.");

         makeTextField.setBackground (Color.red);
         makeTextField.requestFocus ();
      }

      else if (buildDate.length() == 0)
      {
         // Display an error
         JOptionPane.showMessageDialog (VehicleGUI.this,
            "Error: Build Date cannot be blank.");

         buildDateTextField.setBackground (Color.red);
         buildDateTextField.requestFocus ();
      }

      else if ((fuelEcon < MIN_FUEL_ECON) || (fuelEcon > MAX_FUEL_ECON))
      {
         // Display an error
         JOptionPane.showMessageDialog (VehicleGUI.this,
            "Error: Fuel Economy must be in range " +
            MIN_FUEL_ECON + " to " + MAX_FUEL_ECON + ".");

         fuelEconTextField.setBackground (Color.red);
         fuelEconTextField.requestFocus ();
      }

      else if ((carRadioButton.isSelected() == true)  &&
               ((carPassengers < MIN_CAR_PASSENGERS)  ||
                (carPassengers > 10)) )
      {
         // Display an error
         JOptionPane.showMessageDialog (VehicleGUI.this,
            "Error: Car Passengers must be in a whole number " +
               " in the range " + MIN_CAR_PASSENGERS + " to " +
               MAX_CAR_PASSENGERS + ".");

         carPassengersTextField.setBackground (Color.red);
         carPassengersTextField.requestFocus ();
      }

      else if ((truckRadioButton.isSelected() == true)      &&
               ((truckLoadingCapacity < MIN_TRUCK_LOADING)  ||
                (truckLoadingCapacity > MAX_TRUCK_LOADING)) )
      {
         // Display an error
         JOptionPane.showMessageDialog (VehicleGUI.this,
            "Error: Truck Loading Capacity must be in " +
               " in the range " + MIN_TRUCK_LOADING + " to " +
               MAX_TRUCK_LOADING + ".");

         truckLoadingCapacityTextField.setBackground (Color.red);
         truckLoadingCapacityTextField.requestFocus ();
      }

      else
      {
         // The user inputs are valid
         // Create a vehicle:
         Vehicle v = null;

         /* Other Way: pass manufacturer to Constructors:

         int manIndex = manufacturersComboBox.getSelectedIndex();

         // Create vehicle by type - depends on radiobuttons
         if (vehicleRadioButton.isSelected() == true)
            v = new Vehicle (make, buildDate, fuelEcon,
                (Manufacturer) manufacturers.get (manIndex));
         else if (carRadioButton.isSelected() == true)
            v = new Car (make, buildDate, fuelEcon,
                (Manufacturer) manufacturers.get (manIndex), carPassengers);
         else if (truckRadioButton.isSelected() == true)
            v = new Truck (make, buildDate, fuelEcon,
                (Manufacturer) manufacturers.get (manIndex), truckLoadingCapacity);
         */

         // OLD Way: easier / shorter:

         // Create vehicle by type - depends on radiobuttons
         if (vehicleRadioButton.isSelected() == true)
            v = new Vehicle (make, buildDate, fuelEcon);
         else if (carRadioButton.isSelected() == true)
            v = new Car (make, buildDate, fuelEcon, carPassengers);
         else if (truckRadioButton.isSelected() == true)
            v = new Truck (make, buildDate, fuelEcon, truckLoadingCapacity);

         int manIndex = manufacturersComboBox.getSelectedIndex();
         v.setManufacturer ( (Manufacturer) manufacturers.get (manIndex) );


         // Add vehicle to the arraylist:
         vehicles.add (v);


         // Erase the textarea:
         reportTextArea.setText ("");

         // Display the headings:
         reportTextArea.append (Vehicle.toStringHeader() + "\n");

         // Display vehicle in textarea:
         reportTextArea.append (v.toString() + "\n");

         //reportTextArea.setText (Vehicle.toStringHeader() + "\n" +
         //                        v.toString() + "\n");

         // Clear input fields:
         clearInputs();

         // Put the cursor back in the first input field
         makeTextField.requestFocus ();
      }
   }

   private void clearInputs()
   {
      makeTextField.setText                  ("");
      buildDateTextField.setText             ("");
      fuelEconTextField.setText              ("0");
      carPassengersTextField.setText         ("0");
      truckLoadingCapacityTextField.setText  ("0");

      vehicleRadioButton.setSelected (true);

      vehicleSelected();
   }

   private int display(String name)
   {
      int count = 0;

      // Erase the textarea:
      reportTextArea.setText ("");

      // Display the headings:
      reportTextArea.append (Vehicle.toStringHeader() + "\n");

      // Loop through all vehicles and add them to textarea
      for (int k = 0; k < vehicles.size(); k++)
      {
		 if ((name.length() == 0) ||
		     (name.equalsIgnoreCase (vehicles.get(k).getManufacturer ().getName ()) == true) )
		 {
			 reportTextArea.append (vehicles.get(k).toString() + "\n");
			 count++;
		 }
      }

      reportTextArea.append ("\n" + count + " vehicles found." + "\n");

      return count;
   }

   private void exitApplication()
   {
      int result = JOptionPane.showConfirmDialog
         (VehicleGUI.this,
          "Are you sure you want to lose all you work ?",
         "Exit ?", JOptionPane.YES_NO_OPTION);

      if (result == JOptionPane.YES_OPTION)
      {
         // Save to file
         // Do any tidying up ...
         // Exit
         System.exit (0); // All OK
      }
   }
	// https://github.com/CQUni-Mike/COIT11134-2019-T2

   private void testData()
   {
	  Vehicle v1 = new Vehicle ("Porsche", "2020-Dec", 3);
	  v1.setManufacturer (manufacturers.get(0) );

	  Vehicle v2 = new Vehicle ("Ford",    "2011-Dec", 4);
	  v2.setManufacturer (manufacturers.get(0) );

	  Vehicle v3 = new Vehicle ("Mini",    "2009-Jan", 4);
	  v3.setManufacturer (manufacturers.get(0) );

      vehicles.add (v1);
      vehicles.add (v2);
      vehicles.add (v3);

      display("");
   }

   public void searchByManufacturer()
   {
	   // Prompt user for a search name.
	   // Loop through all vehicles and
	   // display the ones with that Manufacturer.

	   String name = JOptionPane.showInputDialog (VehicleGUI.this,
	                     "Enter Manufacturer name: ");
		System.out.println ("name: " + name);

	  // Check a valid name was entered:
	  if (name != null) // if user did not click the Cancel button
	  {
		  // if name is blank or user only entered spaces, tabs
		  if (name.trim().length() == 0)
	  	  {
			 JOptionPane.showMessageDialog (VehicleGUI.this,
				 "ERROR: dude, enter a manufacturer.",
				 "Error:", JOptionPane.ERROR_MESSAGE);
          }
		  else
		  {
			  // Name is valid, let's search:
			  int count = display(name);

			  if (count == 0)  // None found, display an error.
				 JOptionPane.showMessageDialog (VehicleGUI.this,
					 "ERROR: no vehicles found for '" + name + "'.",
					 "Error:", JOptionPane.ERROR_MESSAGE);
          }
      }
   }
   private void fileRead ()
   {
		String fileName = "file.txt";

		vehicles.clear();

		try
		{
			Scanner inFile = new Scanner(new FileReader(fileName));

			while(inFile.hasNext()) // more data ?
			{
				// NOTE:
				// The order you write the data needs to be exactly
				// the same as the order in which read the data !!

				String makeModel = inFile.nextLine();
				String buildDate = inFile.nextLine();
				double fuelEconomy = inFile.nextDouble();
				//inFile.nextLine(); // Clear buffer (CRLF).

			   //String name          = inFile.nextLine();
			   //String address       = inFile.nextLine();
			   //double buildCapacity = inFile.nextDouble();
			    int manuIndex = inFile.nextInt();
				inFile.nextLine(); // Clear buffer (CRLF).

				 //Manufacturer m = new Manufacturer (name, address, buildCapacity);
				  Manufacturer m = new Manufacturer  ();
				  if (manuIndex >= 0)
				 	 m = manufacturers.get(manuIndex);

				//Vehicle v = new Vehicle (makeModel, buildDate, fuelEconomy, m);

				Vehicle v = new Vehicle (makeModel, buildDate, fuelEconomy);
				v.setManufacturer (m);

				vehicles.add (v);
			 }

			 inFile.close();
	   }
	   catch(FileNotFoundException | NoSuchElementException ex)
	   {
		 System.out.println ("Error reading to file: " + fileName);
		 System.exit(-1);
	   }
   }

   private void fileWrite ()
   {
		String fileName = "file.txt";

		try
		{
		 Formatter outputFile = new Formatter (fileName);

		 for (int k = 0; k < vehicles.size (); k++)
		 {
			// NOTE:
			// The order you write the data needs to be exactly
			// the same as the order in which read the data !!

			outputFile.format ("%s\n", vehicles.get (k).getModel () );
			outputFile.format ("%s\n", vehicles.get (k).getBuildDate () );
			outputFile.format ("%s\n", vehicles.get (k).getFuelEcon () );

			//Manufacturer m = vehicles.get (k).getManufacturer ();
			//outputFile.format ("%s\n", m.getName () );
			//outputFile.format ("%s\n", m.getAddress () );
			//outputFile.format ("%s\n", m.getBuildCapacity () );

			int manuIndex = -1;
			for (int m = 0; m < manufacturers.size(); m++)
			{
				if (manufacturers.get(m) == vehicles.get (k).getManufacturer ())
				   manuIndex = m;
			}
			outputFile.format ("%s\n", manuIndex );
		 }

		 outputFile.close();

		 System.out.println (vehicles.size () + " lines written to: " + fileName);
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

   }

   public static void main (String[] args)
   {
      VehicleGUI app = new VehicleGUI ();
   }
}
