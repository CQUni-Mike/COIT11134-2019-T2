/*
     Author: Mike O'Malley (lecturer)
       File: VehicleGUI.java
Description: Question 04.
             GUI class for:
             Inheritance Tutorial Question:  The Basics
             Vehicles-Cars-Trucks

See "README.md" for question details.

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class VehicleGUI extends JFrame
{
   JLabel makeLabel              = new JLabel ("Make: ");
   JTextField makeTextField      = new JTextField (20);
   JLabel buildDateLabel         = new JLabel ("Build Date: ");
   JTextField buildDateTextField = new JTextField (10);
   JLabel fuelEconLabel          = new JLabel ("Fuel Economy: ");
   JTextField fuelEconTextField  = new JTextField (5);

   JTextArea reportTextArea = new JTextArea ();
   JScrollPane scrollPane   = new JScrollPane (reportTextArea);
   JButton addButton        = new JButton ("Add");
   JButton displayButton    = new JButton ("Display");
   JButton exitButton       = new JButton ("Exit");
   JButton testDataButton   = new JButton ("Test Data");

   private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle> ();



   public VehicleGUI()
   {
      setVisible (true);
      setTitle ("My Vehicles App v0.001");
      setLocation (100, 100);
      setSize (600, 500);
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      JPanel gridPanel = new JPanel (new GridLayout (3, 2) );//R,C
      gridPanel.add (makeLabel);
      gridPanel.add (makeTextField);
      gridPanel.add (buildDateLabel);
      gridPanel.add (buildDateTextField);
      gridPanel.add (fuelEconLabel);
      gridPanel.add (fuelEconTextField);

      JPanel buttonsPanel = new JPanel ();
      buttonsPanel.add (testDataButton);
      buttonsPanel.add (new JLabel ("    ") );
      buttonsPanel.add (addButton);
      buttonsPanel.add (displayButton);
      buttonsPanel.add (exitButton);

      add (gridPanel,    BorderLayout.NORTH);
      add (scrollPane,   BorderLayout.CENTER);
      add (buttonsPanel, BorderLayout.SOUTH);

      addButton.addActionListener      (event -> addVehicle() );
      displayButton.addActionListener  (event -> display() );
      exitButton.addActionListener     (event -> exitApplication() );
      testDataButton.addActionListener (event -> testData() );

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
   }

   private void addVehicle()
   {
      String make        = makeTextField.getText().trim();
      String buildDate   = buildDateTextField.getText().trim();
      String fuelEconStr = fuelEconTextField.getText().trim();
      double fuelEcon    = 0;

      try
      {
         fuelEcon    = Double.parseDouble (fuelEconStr);
      }
      catch (Exception err)
      {
          fuelEcon    = 0;
      }

      // Set all colours to show all is OK.
      makeTextField.setBackground      (Color.white);
      buildDateTextField.setBackground (Color.white);
      fuelEconTextField.setBackground  (Color.white);


      if (make.length() == 0)
      {
         // Display an error
         JOptionPane.showMessageDialog (VehicleGUI.this,
            "Error: Make cannot be blank.");

         // Error with this input:
         makeTextField.setBackground (Color.red);
         makeTextField.requestFocus ();
      }

      else if (buildDate.length() == 0)
      {
         // Display an error
         JOptionPane.showMessageDialog (VehicleGUI.this,
            "Error: Build Date cannot be blank.");

         // Error with this input:
         buildDateTextField.setBackground (Color.red);
         buildDateTextField.requestFocus ();
      }

      // TODO: make these threshold values constants.
      else if ((fuelEcon < 5) || (fuelEcon > 10))
      {
         // Display an error
         JOptionPane.showMessageDialog (VehicleGUI.this,
            "Error: Fuel Economy must be in range 5 to 10.");

         // Error with this input:
         fuelEconTextField.setBackground (Color.red);
         fuelEconTextField.requestFocus ();
      }

      else
      {
         // The user inputs are valid.

         // Create a vehicle:
         Vehicle v = new Vehicle (make, buildDate, fuelEcon);

         // Add in to the arraylist:
         vehicles.add (v);

         // Display vehicle in textarea:
         reportTextArea.setText (v.toString() + "\n");

         // Clear input fields:
         clearInputs();

         // Put the cursor back in the first input field:
         makeTextField.requestFocus ();
      }
   }

   private void clearInputs()
   {
      makeTextField.setText      ("");
      buildDateTextField.setText ("");
      fuelEconTextField.setText  ("0");
   }

   private void display()
   {
      reportTextArea.setText ("");

      // Loop through all vehicles and add them to textarea
      for (int k = 0; k < vehicles.size(); k++)
      {
         reportTextArea.append (vehicles.get(k).toString() + "\n");
      }
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

   private void testData()
   {
      /*
      Vehicle v1 = new Vehicle ("Porsche", "2020-Dec", 3);
      Vehicle v2 = new Vehicle ("Ford",    "2011-Dec", 4);
      Vehicle v3 = new Vehicle ("Mini",    "2009-Jan", 4);

      vehicles.add (v1);
      vehicles.add (v2);
      vehicles.add (v3);
      */

      // TODO: use random numbers, generate random dates, etc.
      vehicles.add (new Vehicle ("Porsche", "2020-Dec", 3) );
      vehicles.add (new Vehicle ("Ford",    "2011-Dec", 4) );
      vehicles.add (new Vehicle ("Mini",    "2009-Jan", 4) );

      display();
   }



   public static void main (String[] args)
   {
      VehicleGUI app = new VehicleGUI ();
   }
}