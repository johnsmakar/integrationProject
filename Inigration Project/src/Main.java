import java.util.Scanner;
import javax.swing.JOptionPane;

// John Makar
/*
 * A program integrating skills learned in COP 2006 This programs function is to create a user
 * database by collecting general information.
 */
public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("Welcome Back!");

    String hello = "Hello World!";
    int age = 18;
    String myName = "John";
    // Double value set as Final Variable
    double GPA = 3.5F;

    // I learned how to us JOptionPane from Oracle
    // Answer to question should be "Yes" or "No"
    String somehting = JOptionPane.showInputDialog("Are you a human?");
    // DOB format must be, MM/DD/YYYY
    String dateOfBirth = (String) JOptionPane.showInputDialog(null, "Date of Birth", "Dialog Title",
        2, null, null, "MM/DD/YYYY");
    String[] acceptableValues = {"Male", "Female"};

    String input2 = (String) JOptionPane.showInputDialog(null, "Gender", "Dialog Title", 2, null,
        acceptableValues, acceptableValues[1]);

    // Scanner scan = new Scanner(system.in);

    System.out.println(hello);
    // String concatenation
    System.out.println("My name is " + myName);
    System.out.print("Age: ");
    System.out.println(age);
    System.out.println("My GPA is " + GPA);
    // System.out.println("Shirt Size: " + shirtSize);
    System.out.print("Are you a human?: ");
    System.out.println(somehting);
    System.out.println("DOB: " + dateOfBirth);
    System.out.println(input2);

  }

}
