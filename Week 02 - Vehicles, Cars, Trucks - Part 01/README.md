# COIT11134 - Inheritance Vehicles Cars Trucks

The questions below are in addition to the set tutorial questions and to the questions from relevant chapters of the textbook.

I very highly recommend that all students work through these questions and refer to the code solutions only if you are stuck / confused / cannot proceed.


## SOLUTIONS:

Please make sure you attempt and work through the questions for yourself.  Don't fall into the trap of looking at the solutions and thinking "Oh, I could do that".  It is only by doing that you will learn.  :)

* Question solutions see sub-folders here:
https://github.com/CQUni-Mike/COIT11134-2019-T2


## Question 1: Inheritance Hierarchy of 3 Classes plus a Tester Class

1A.	Create a **Vehicle** class with the following members:
* A field for the vehicle model description (a string).
* A field for the year and month that the vehicle was built (a string).
* A field for the fuel economy per litre (a double).
* A Default Constructor
* A Parameterised Constructor
* Appropriate accessors and mutators for all class fields.
* A toString() method that displays the necessary vehicle detail.

1B.	Create a **VehicleTester** class with a main() that creates at least 2 Vehicles and executes all of the methods in the **Vehicle** class to ensure everything works, and that you understand everything.  :)

1C.	Implement the **Car** class that extends the **Vehicle** class, and includes the following members:
* A field for the maximum number of passenger (an int).
* A Default Constructor
* A Parameterised Constructor
* Appropriate accessors and mutators for all class field(s).
* A toString() method that invokes the toString() method in the superclass and displays relevant information on a Car object.

1D.	Add code to the **VehicleTester** class to create at least 2 Cars and executes all of the methods in the **Car** class to ensure everything works, and that you understand everything.  :)  i.e. Your tester class should create and invoke methods for at least 2 Vehicles and 2 Cars.


1E.	Implement the **Truck** class that extends the **Vehicle** class, and includes the following members:
* A field for the loading capacity in tonnage (a double).
* A Default Constructor
* A Parameterised Constructor
* Appropriate accessors and mutators for all class field(s).
* A toString() method that invokes the toString() method in the superclass and displays relevant information on a Car object.

1F.	Add code to the **VehicleTester** class to create at least 2 Trucks and executes all of the methods in the **Truck** class to ensure everything works, and that you understand everything.  :)  i.e. Your tester class should create and invoke methods for at least 2 Vehicles and 2 Cars and 2 Trucks.

1G.	Homework: to have fun and explore and build your understanding, add more classes to the Vehicle class hierarchy:
* Motorbike: engine capacity, on-road or off road, ...
* Car subclass/child -> Electric Car, range, etc
* Aircraft
* Boats
* etc, whatever you like.  The key is to explore and build your understanding.

1Z.	Homework: students please make sure you do all of the tutorial questions
for this week, and get extra practice doing questions from relevant chapters of the textbook.



## Question 2: Arrays and ArrayLists

2A. 	Add code to the **VehicleTester** class to create an **Array** of Vehicles.  Add existing Vehicles and Cars and Trucks that you have already declared to the Array.  Also declare new Vehicles and Cars and Trucks and store these directly into the array.  Have at least 4 Vehicles, 4 Cars, and 4 Trucks in your Array.  i.e. Have at least 12 objects in your array.

2B.	Add code to the **VehicleTester** class to loop through all Vehicles in the array and display them to the screen (call each object’s toString() method).  Use a *counter controlled for loop* and then do the same thing again using a *for each loop* (aka an *enhanced for loop*).

2C. 	Add code to the **VehicleTester** class to loop through all Vehicles in the array and calculate and display the total loading (carrying) capacity of all Trucks in the array.
* **Hint:** use *instanceof* to determine which Vehicles are Trucks, and use *typecasting* to invoke the getLoadingCapacity() method.

2D.	Use a loop to count the number of Cars and calculate the total passengers of all Cars in the array, and display the *average passengers per vehicle* to the screen.
* **Hint:** use *instanceof* to determine which Vehicles are Cars, and use *typecasting* to invoke the getNumPassengers() method.

2E.	Change over from using an Array to an ArrayList.

2Z.	Homework: students please make sure you do all of the tutorial questions
for this week, and get extra practice doing questions from relevant chapters of the textbook.


## Question 3: Slap a GUI on it

3A.	Add a prompt label and textfield for vehicle make,
	a textarea, scrollpane, and a button called "Add".
* "Add" button should trim leading and trailing white space from inputs.
* **Hint:** trim().
* "Add" button should also validate all user inputs.
* If Make is blank, display an error dialog,
sets textfield background colour to red, and
sets cursor focus to textfield.
* Otherwise, if all user inputs are valid, create a vehicle,
add it to ArrayList, and
display the latest vehicle in the textarea, clear all user inputs,
and place the cursor in the first field ready for the user to enter another Vehicle.

3B.	Add prompt labels and textfields for build date and fuel economy.
Add validations:
* build date cannot be blank,
* fuel economy must be a double between 5.0 and 10.0 inclusive.
and fit these into the existing validation structure.

* **Hint:** You will need to convert the user input from a String to a
double, and you can do this using **Exception Handling** like this:

```
	// Convert String to double using Exception Handling:
	double fuelEcon    = 0;

	try
	{
		fuelEcon    = Double.parseDouble (fuelEconStr);
	}
	catch (Exception err)
	{
		 fuelEcon    = 0;
	}
```


3C.	Add an "Exit" button that calls an exitApplication() method to
	display a confirmation dialog prompting the
	user to confirm that they want to exit.

3D.	Perform the same processing if the user clicks the
	"X" icon in the top corner of the JFrame.
* **Hint:** use *addWindowListener* to override the default *windowClosing*
	method to call your exitApplication() method, such as:
```
      // Setup my own "Window Closing" method that runs when
      // the user clicks the "X" icon.
      addWindowListener (new WindowAdapter()
      {
         public void windowClosing (WindowEvent e)
         {
            exitApplication ();
         }
      });
```

3E.	Add a method to clear all user inputs, and call this when
	the application starts up and whenever a Vehicle is added to the array.

3F.	Add a "Display" button to invoke a display() method to
	display all vehicles in the ArrayList
	to the textarea.

3G.	Add a "Test Data" button to add some Vehicles to the ArrayList and invoke
	the display() method.  Generate random values for fuel economy.

3Z.	Homework: students please make sure you do all of the tutorial questions
for this week, and get extra practice doing questions from relevant chapters of the textbook.


## Question 4: More GUI, Aggregation (Composition)

4A.	Add radiobuttons to enable the user to select the
Vehicle, Car, Truck, .... they want to input.
* **Hint:** don't forget the ButtonGroup.

4B.	Add a prompt label and textfield for each of the fields associated with these
new types of Vehicles and only enable them if the particular type of
Vehicle is selected.
e.g. if Car radiobutton is selected, then number of passengers label and text field
should be enabled, otherwise these gui components should be disabled.
* **Hint:** setEnabled().

4C.	Add validations which apply for each type of Vehicle
when the "Add" button is pressed.
* if Car radiobutton is selected, then number of passengers
must be between 0 and 10 inclusive.
* if Truck radiobutton is selected, then truck loading capacity must be between 3.5 and 40.0 inclusive.

4D.	Change to using constants for all threshold values (minimum passengers, etc)
and update your ifstatements, error messages, etc to use theseconstants.

4E.	Activate each Vehicle, Car, Truck radiobutton so that when it is clicked, the
appropriate GUI components are enabled/disabled or made visible/invisible.
e.g. if the Car radio button is selected, then the car passengers label and textfield should be enabled, but the truck loading capacity label and textfield should be disabled.
* **Hint:** add an action listener to each radio button to run code whenever a radiobutton is clicked.

4F. 	**Assignment 1** spec says: "*Wherever necessary, you need to use the inheritance and/or aggregation concept of OOD.*"
We already have **Inheritance** (Vehicle, Car, Truck).
Let's add **Aggregation** to cover all bases.

* Suggest adding a **Manufacturer** class: name, address, etc fields, and all of the usual constructors, setters / getters (Mutators / Accessors), toString.
Update Vehicle class to include a Manufacturer object, and update constructors and toString(), and add settter and getter for Manufacturer.

* In your GUI class, create an arraylist of Manufacturers and store 3-4 manufacturers in this arraylist.  Use this arraylist to populate a ComboBox of Strings.  Loop through all manufacturers in the arraylist and add them as a String to the ComboBox.
* **Hint:** addItem().

* For each Vehicle, Car, Truck we add, user must also select a "Manufacturer" from a combobox, and this needs to be stored for each Vehicle.

4G.	Formatting #1: font.
Set the font of the textarea to "Courier New" or some other non-proportional font.  i.e. a font where all of the characters have the same width.

```
	reportTextArea.setFont (new Font ("Courier New", Font.BOLD, 16) );
```

4H.	Formatting #2: columns.
Change the toString() methods in each of your classes to use String.format to format data so that it lines up in neat columns when displayed in the textarea.  For example, for the toString() in the Vehicle class:

```
return 	String.format ("%-10s", getClass().getName ()) +
	String.format ("%-20s", model)     +
	String.format ("%-10s", buildDate) +
	String.format ("%8.2f", fuelEcon);
```

4I.	Formatting #3: Column Headings.
Add a *public static void toStringHeader()* method to your Vehicle class and invoke this method when you need to get the column headings in the textarea.  For example when you display all vehicles:

```
      // Erase the textarea:
      reportTextArea.setText ("");

      // Display the headings:
      reportTextArea.append (Vehicle.toStringHeader() + "\n");

      // Loop through all vehicles and add them to textarea
      for (int k = 0; k < vehicles.size(); k++)
      {
         reportTextArea.append (vehicles.get(k).toString() + "\n");
      }
```

4Y.	Homework: Instead of using a ComboBox for Manufacturers, students should add data entry fields and labels for Manufacturer (name, address, etc) and validate these when the Add button is clicked, and if all is OK, use the contents of the fields to construct a Manufacturer object, and assign this to the Vehicle.
* **Hint:** you've just done this for Vehicles, you know how to do it.

4Z.	Homework: students please make sure you do all of the tutorial questions
for this week, and get extra practice doing questions from relevant chapters of the textbook.


## Question 5: File I/O, Delete, Exception Handling and Validation, JTabbedPane, Design / Multi-Application / Cross Platform issues, ....
TBA

### DONE:
5A.	Make textarea readonly / display only.
* **Hint:** setEditable().

5B.	Auto-create test data when application starts-up.

5C.	Search for vehicles for an entered manufacturer.

5D.	Display number of vehicles listed.

5E.	Add a demo JTabbedPane.

5F.	Fix the Exit button (only exit if they click YES).



### TODO:

??.	Vehicles Delete: Add a combobox to enable the user to select a Vehicle in the ArrayList
and a "Delete" button which prompts the user to confirm the deletion and
deletes the selected Vehicle from the ArrayList if the user confirms the deletion.

??.	Vehicles Edit: Add a combobox to enable the user to select a Vehicle in the ArrayList
and a "Edit" button which allows you to edit any of the Vehicle details and save them.

??.	Manufacturers: Add/Edit/Delete

??.	Manufacturers: save to file, load form file.

??.	JTabbedPane
* Place all of the "Add" vehicle related functionality / components to it's own tab,
* Place all of the "Delete" related functionality / components to it's own tab,
* Place all of the "Display" related functionality / components to it's own tab,

* Each Vehicle, Car, Truck must be unique.
* implement Comparable for Vehicle and search for Vehicle before adding it.


???.	Exception Handling and Validation.
* When Vehicle data is validated, where should it be cheched ?  In which class ?
i.e. Which class is responsible for handling / storing / processing Vehicle data ?
* When Car data is validated, where should it be cheched ?  In which class ?
* When Truck data is validated, where should it be cheched ?  In which class ?
* Change your "Add" button functionality, so that all validation processing occurs in the classes which are responsible the data.

??.	JTable - much nicer way to display your data than textareas !

??.	Timers

???.	Design / Multi-Application / Cross Platform issues.
* Our Java GUI app will run on any operating system that supports the Java run-time, this includes
Windows, Linux, Mac, Raspberry Pi, ....
* It does NOT include iOS, Android (without a lot of re-work), Windows Phone, Web, etc, etc ...
* So much for Java's long-time promise of "Write Once, Run Anywhere" ....  but that's another story ...

* What if we wanted to create a Console app (command line) version of our application ?
* What if we wanted to create a Web App version of our application ?
* What if we wanted to create a Android version of our application ?
* Should we copy our VehicleGUI class and paste it and adapt it's code to other platforms ?  NO !!!!
* Why ?  Our GUI app does a lot more than just handle the GUI ....
* Why repeat all of that business logic in multiple places ?
* This would result in the same code being duplicated in many places ... a MAINTENANCE DISASTER.

* Solution:
* Model View Controller (MVC) design
* Add another class: the Controller, which contains all of the business logic.
* All the GUI class should do is handle the GUI components and talk to the Controller to get the work done.
* We can then re-use this Controller in Console apps, Web apps, etc.


5Z.	Homework: students please make sure you do all of the tutorial questions
for this week, and get extra practice doing questions from relevant chapters of the textbook.



# Want more practice questions ?

See:

* Mike O's Programming Practice Questions - v0.008.pdf (39 pages, PDF, 513 KB)

https://www.mediafire.com/file/dpk59wchfu715to/Mike_O%27s_Programming_Practice_Questions_-_v0.008.pdf/file

Questions cover:
* Visualising data - a simple Bar Chart tool
* Euler's number - e
* Pi Calculator - Dart Board method
* Google's Recruitment Billboard (2004) - Wanna Work for Google ??? (Expired)
* Cable Car - Position and Velocity
* Radioactive Decay of Thorium
* Gravity: Planets, Stars, and Black Holes
* Gravity: Escape Velocity and Event Horizons
* Rocket Ship - Take Off and Landing
* Space Race: 3 Spaceships to Alpha Centauri
* Visualising Data - Interference Pattern
* Factorials - Stirling's Approximation
* Pi Calculator - Trapezoids and Circles
* Trend Line by Method of Least Squares
* Graph of Current in Circuit
* Isothermal Metal Plate - Temperature Distribution in Metal Plate
* And more !!!


# Need Help ?

My videos show you how to solve Java problems, discuss and explain various Java topics,
and show you how to build simple Java applications.  See:

* Mike's Java Software Development Tutorial Videos:
http://tinyurl.com/MikesJavaVideos

.
