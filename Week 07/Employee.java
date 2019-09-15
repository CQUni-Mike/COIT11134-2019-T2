public abstract class Employee implements Payable, Comparable
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;

	// missing block of codes to be completed

   // Default Consructor:
   public Employee ()
   {
      firstName            = "";
      lastName             = "";
      socialSecurityNumber = "";
   }

   // Parameterised Consructor:
   public Employee (String firstName, String lastName, String socialSecurityNumber)
   {
      this.firstName            = firstName;
      this.lastName             = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
   }

   // Accessors / Getters:

   public String getFirstName ()
   {
      return firstName;
   }

   public String getLastName ()
   {
      return lastName;
   }

   public String getSocialSecurityNumber ()
   {
      return socialSecurityNumber;
   }

   // Mutators / Setters:

   public void setFirstName (String firstName)
   {
      this.firstName = firstName;
   }

   public void setLastName (String lastName)
   {
      this.lastName = lastName;
   }

   public void setSocialSecurityNumber (String socialSecurityNumber)
   {
      this.socialSecurityNumber = socialSecurityNumber;
   }

   @Override
   public String toString ()
   {
      return
         firstName            + "\t" +
         lastName             + "\t" +
         socialSecurityNumber;
   }

} // public abstract class Employee