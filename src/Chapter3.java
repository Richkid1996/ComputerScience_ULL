/*In Chapter 3 we are covering Boolean Data Types, Values, and Expressions and if else statements.
 */
import java.util.Scanner;
public class Chapter3 {
    public static void main(String[] args) {
        System.out.println("---Running Chapter 3 Practice----");
        Question1(); // Quiz 3.2 Using the Boolean variable
        Question2();// Quiz 3.2 Learning to compare values
        Question3();//Quiz 3.2 Learn to compare Values
        Question4();// Quiz 3.2 Learn to compare values
    }
    //Quiz 3.2 Question1
    /*Goal: Declare a boolean variable and assign its value.
    Assignment: In a racing game, the boost of the player's vehicle is controlled by a variable called boost. Declare
    this boolean variable and initialize it to false.*/
    //Solution Breakdown:
    // We use the 'boolean' keyword to declare a variable that is either true or false
    // 'boost' is the name of the variable (the identifier)
    // '=' is the assignment operator
    // 'false' is the initial value
    public static void Question1() {
        boolean boost = false;
    }
    //Quiz 3.2 Questions2
    /*Goal: Learn to compare values.
    Assignment: In a smart home system, the humidity level is constantly monitored to adjust the dehumidifier's settings for optimal comfort.
    Given a double variable humidityLevel, write an expression that is true if and only if the humidity level is equal or greater than 70.0.
    Assign the expression to a result variable, which has already been declared. */

    //Solution Breakdown:
    // Since the variable 'result' is already declared, we just assign it.
    // We use the '>=' operator for "greater than or equal to."
    public static void Question2() {
        // 1. Create the Scanner 'tool' to read from the keyboard (System.in)
        Scanner inputReader = new Scanner(System.in);// Receives the input for the humidifier

        // 2. Tell the tool to grab the next decimal (double) the user types
        double humidityLevel = inputReader.nextDouble();

        // 3. Now you can perform the comparison logic
        boolean result = humidityLevel >= 70.0;

        // Optional: Print the result so you can see if it worked!
        System.out.println("The Humidity Level is:" + result);
        System.out.println("");

    }
    //Quiz 3.2 Question4
    /*Goal: Learn to compare values.
    Assignment: To calculate whether an employee has earned overtime pay, the company software needs to compare the
    employee's work hours for the week compared to their contracted hours.
    Write an expression that evaluates as true if the variable accruedWeekHours is greater than contractHours and assign
    it to the variable result. Assume that all variables have already been declared*/

    //Solution Breakdown:
    //Creating the first two variables that contain the standard work hours and the hours worked that week by the individual.
    //Create the boolean variable were we test the two variables to see if it's true
    //Create a output to show the boolean variables results.
    public static void Question3() {
        int accruedWeekHours = 65;// Set the variable with the amount of hours worked this week
        int contractHours = 40;//Set the standard variable that contains the contract Hours
        boolean result = accruedWeekHours > contractHours;
        System.out.println("Is this weeks hours greater than your contracted:? " + result);
        System.out.println("");

    }
    //Quiz 3.2 Question5
    /*Goal: Learn to compare values.
    Assignment: Given three parameters int a, int b, and int c, write an expression that evaluates to true if the three
    numbers can represent a valid percentage together (i.e., their sum is less than or equal to 100), and assign it to
    the variable result that is already declared.
    */
    //Solution Breakdown:
    //Create the three variables
    //Create the boolean variable that contains the math to test if they're less than 100
    //Create the output to represent if it's true or not.
    public static  void Question4() {
        int a = 15; int b = 25; int c= 25;;
        boolean result2 = (a + b + c) <=100;
        System.out.println("Are the values (a)(b)(c) less than 100? " + result2);
        System.out.println("");
    }

}
