import java.util.Scanner;
import javax.swing.JOptionPane;

// John Makar
/*
 * A program integrating skills learned in COP 2006 This programs function is to create a user
 * database by collecting general information.
 */
public class Main {

  public static void main(String[] args) {

	//Greeting to user
    System.out.println("Welcome Back!");
    
    
    // The String Class is a sequence of letters
    String hello = "Hello World!";
    // The integer is a primitive data-type that is used to hold a numeric values
    int age = 18;
    String myName = "John";
    // Double value set as Final Variable and cannot be reassigned.
    final double GPA = 3.5;
    //boolean holds true, or false Values
    boolean systemValidation = true;
    
    /* A Variable in java is a piece of memory that can contain a data value. 
     * 
     * A Scope in java is an instance of a variable or refers to the section of code where a
     * variable can be accessed.
     */

    // I learned how to us JOptionPane from Oracle
    // Answer to question should be "Yes" or "No"
    String humanVerification = JOptionPane.showInputDialog("Are you a human?");
    // DOB format must be, MM/DD/YYYY
    String dateOfBirth = (String) JOptionPane.showInputDialog(null, "Date of Birth", "Dialog Title",
        2, null, null, "MM/DD/YYYY");
    // Must select one of two options from drop down
    String[] acceptableValues = {"Male", "Female"};
    String input2 = (String) JOptionPane.showInputDialog(null, "Gender", "Dialog Title", 2, null,
        acceptableValues, acceptableValues[1]);


    System.out.println(hello);
    // String concatenation
    System.out.println("My name is " + myName);
    System.out.print("Age: ");
    System.out.println(age);
    System.out.println("My GPA is " + GPA);
    System.out.print("Are you a human?: ");
    System.out.println(humanVerification);
    System.out.println("DOB: " + dateOfBirth);
    System.out.println(input2);
    System.out.println("Statement returns " + systemValidation);

  }

}
