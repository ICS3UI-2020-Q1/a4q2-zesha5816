import java.util.Scanner;
/**
 * Write a program that will prompt the user to enter in a positive integer. It will keep  * doing this until the user enters in a negative integer
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    /// Create the Scanner
		Scanner input = new Scanner(System.in);
		//initializing a variable 
		int count = 0;
		int number;
		//if the variable isnt a negative it keeps running
		do {
		System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
		number =input.nextInt();
		}while (number >= count );
		System.out.println("All done!");
  }
}
