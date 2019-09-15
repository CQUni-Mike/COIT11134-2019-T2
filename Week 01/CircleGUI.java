/*
     Author: Mike O'Malley (lecturer)
       File: CircleGUI.java
Description: Basic GUI class to get user input and do a simple calculation.

REF:

*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleGUI extends JFrame
{
   JLabel promptLabel         = new JLabel ("Radius:");
   JTextField radiusTextField = new JTextField (5);
   JLabel outputLabel         = new JLabel ("");
   JButton calcButton         = new JButton ("Calc");


   public CircleGUI ()
   {
      JPanel gridPanel = new JPanel (new GridLayout (2, 1) );
      JPanel flowPanel = new JPanel (new FlowLayout ());
      JPanel flowPanel2 = new JPanel (new FlowLayout ());

      //setLayout (new FlowLayout () );
      flowPanel.add (promptLabel);
      flowPanel.add (radiusTextField);
      flowPanel.add (calcButton);

      flowPanel2.add (outputLabel);

      gridPanel.add (flowPanel);
      gridPanel.add (flowPanel2);

      add (gridPanel);

      calcButton.addActionListener (event -> calc ());
   }

   private void calc ()
   {
      // Get user input - what is it's type ?
      String input = radiusTextField.getText ();
      double radius = 0;

      try
      {
         // Convert it to a double
         radius = Double.parseDouble (input);
      }
      catch (NumberFormatException err)
      {
         outputLabel.setText ("Radius must be a number.");
         return;
      }

      // Check >= 0, display error
      if (radius < 0)
         outputLabel.setText ("Radius must be positive.");
      else
      {
         // Calculate area
         double area = Math.PI * radius * radius;

         // Display results
         outputLabel.setText ("Area is " +
            String.format ("%.2f", area) );
      }


   }


   public static void main(String[] args)
   {
      CircleGUI app = new CircleGUI ();
      app.setSize(500, 200);
      app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      app.setVisible (true);
   }

} // public class CircleGUI