import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

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
    double age = -18;
    //casting int age to double
    //Using Math absolute to get positive age value
    int myAge = (int) Math.abs(age);
    
    // Random integer is being generated to compare to your age
    Random rand = new Random();
    int rand_int1 = rand.nextInt(100);
    //Value is being directly called 
    
    String myName;
    myName.getName
    // Double value set as Final Variable and cannot be reassigned.
    final double GPA = 3.5;
    //boolean holds true, or false Values
    boolean systemValidation = true;
    
    
   
    // Randomly generates test cases
	Random test = new Random();
	int n1 = test.nextInt(), n2 = test.nextInt(), maximum;
    // dot operator is used to call method from another class
   maximum =  characterSelection.max(n1,n2); 
    //Value stored in variable
    System.out.println("Test Case: " + maximum);
    
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
    
    
    Character myCharacter = new Character();
    
    

    System.out.println(hello);
    // String concatenation
    System.out.println("My name is " + myName);
    System.out.print("Age: ");
   /* This makes it so that you may or may not get the age you were assigned on line 21
      Value is directly being called from characterSelection class*/
    System.out.println(characterSelection.max(rand_int1, myAge));
    System.out.println("My GPA is " + GPA);
    System.out.print("Are you a human?: ");
    System.out.println(humanVerification);
    System.out.println("DOB: " + dateOfBirth);
    System.out.println(input2);
    // Escape sequence pushes systemValidation to new line 
    System.out.println("Statement returns: \n" + systemValidation);
    

  }

}
