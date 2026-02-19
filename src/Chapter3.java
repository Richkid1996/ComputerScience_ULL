/*In Chapter 3 we are covering Boolean Data Types, Values, and Expressions and if else statements.
 */
//This is where we import the Scanner so we can use it throughout the class
import java.util.Scanner;
//Where we introduce the given class
public class Chapter3 {
    public static void main(String[] args) {
        System.out.println("---Running Chapter 3 Practice----");
        Question1(); // Quiz 3.2 Using the Boolean variable
        Question2();// Quiz 3.2 Learning to compare values
        Question3();//Quiz 3.2 Learn to compare Values
        Question4();// Quiz 3.2 Learn to compare values
        Question5();// Quiz 3.3 (Question 1)Learn to write If statements
        Question6();// Quiz 3.3 (Question 2)Learn to write If statements
        Question7();//Quiz 3.4 Learn to write if else statements
        Question8();//Quiz 3.4 Learn to write if else statements
        Question9();//Quiz 3.5 Learn to write multi-way if statements
        Question10();//Quiz 3.5 Understand how to use multi-way if statement
        Question11();//Quiz 3.10 Learn to use boolean Operators Question 1
        Question12();//Quiz 3.10 Learn to use boolean Operators Question 2
        Question13();//Quiz 3.10 Learn to use boolean Operators Question 3
        Question14();//Quiz 3.10 Learn to use boolean Operators Question 4
        Question15();//Quiz 3.10 Learn how to use the conditional operator ? : for making decisions within expressions, based on a variable's value
        Question16();//Quiz 3.10 Learn how to use nested ternary operators
        Question17();//Quiz 3.10 Learn to write ternary if statements
        Question18();//Chapter 3 Programing Assignment 1
        Question19();//Chapter 3 Programing Assignment 2
        Question20();// Quiz 3.13 Understand how to use switch statements to handle multiple conditions.
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
        System.out.println("What is the percentage of Humidity? ");

        // 2. Tell the tool to grab the next decimal (double) the user types
        double humidityLevel = inputReader.nextDouble();

        // 3. Now you can perform the comparison logic
        boolean result = humidityLevel >= 70.0;

        // Optional: Print the result so you can see if it worked!
        System.out.println("The Humidity Level is greater than 70 :" + result);
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
    //Quiz 3.3 Question1
    /*Goal: Learn to write if statements.
    Assignment: In a mobile gaming app, a message is displayed if the player beats the current high score. Given the
    variables playerScore and highScore, write an if statement that prints New High Score! on the screen if the player
    score is strictly greater than the current high score.
     */
    //Solution Breakdown:
    //1.Create the highScore variable
    //2.Create the Scanner that is called input were we get the players Score from the user
    //3.Then we create a output statement asking the user what's there score
    //4. Then we create a if statement testing whither if the players score is greater than the highScore
    public static void Question5(){
       int highScore = 865;// Original HighScore value

        Scanner input = new Scanner(System.in);
        System.out.println("What is your score? ");
        int playerScore = input.nextInt();

        if (playerScore > highScore) {
            System.out.println("We have a New HighScore!!!");
        }
    }
    //Quiz 3.3 Question2
    /*Goal: Learn to write if statements.
    Assignment: In a logistics management system for a food delivery service, the delivery fee is adjusted based on how
    many deliveries are scheduled in the same area, in the same time range: if more deliveries can be completed in a single trip,
    the fee per customer is reduced.
    Given the variables int numberOfDeliveries and int deliveryDiscount already declared and assigned, reassign deliveryDiscount
    to the value 15 if the number of deliveries exceeds 50.
     */
    //Solution:
    //1. Created a new scanner to get the amount of deliveries for today
    //2. assigned the input to the int variable numberOfDeliveries
    //3.Created the int variable that had the original discount percentage
    //4. created the if statement to change the discount percentage if the deliveries are over 50
    public static void Question6() {
        Scanner delivery = new Scanner(System.in);
        System.out.println("How many Deliveries do we have today? ");
        int numberOfDeliveries = delivery.nextInt();
         int deliveryDiscount = 20;;
        if (numberOfDeliveries > 50) {
            deliveryDiscount = 15;
            System.out.println("What is the delivery discount? " + deliveryDiscount);
            System.out.println("");
        }

    }
    //Quiz 3.4 Question1
    /*Goal: Learn to write if-else statements.
    Assignment: In an educational software tracking student progress, there's a feature to digitally transmit the result
     of an exam to the students.
    Given a double variable testScore, print on the screen the message Congratulations, you pass! if testScore is greater
    or equal to 60.0, or You did not pass otherwise.
     */
    //Solution:
    //1.Created Scanner named test to record test Scores from the users
    //2.Wrote a print statement to ask the user what their test score is.
    //3. stored the test scores in the int variable testScores
    //4. Created an if statement testing if the Score is passing or not passing

    public static void Question7() {
        Scanner test = new Scanner(System.in);
        System.out.println("What is your test Score? ");
        int testScore = test.nextInt();
        if (testScore >= 60.0) {
            System.out.println("Congratulations, you pass!");
            System.out.println("");
        }
        else {
            System.out.println("You did not pass");
            System.out.println("");
        }
    }
    //Quiz3.4 Question2
    /*Goal: Learn to write if-else statements.
    Assignment: The public train system offers a discount on ticket price when the travel happens outside of peak hours.
     Given a variable double ticketPrice that has been declared and initialized to 0 and a boolean isPeakHours, assign
     the value 6.35 to ticketPrice if isPeakHours is false, and 9.50 otherwise.
     */
    //Solution:
    public static void Question8(){
        double ticketprice = 0.00;
        Scanner hours = new Scanner(System.in);
        System.out.println("Is it Peak hours for the train right now? ");
        boolean isPeakHours = hours.nextBoolean();
        if (isPeakHours == false) {
            ticketprice = 6.35;
            System.out.println("The price of tickets at this hour is: " + ticketprice);
            System.out.println("");
        }
        else {
            ticketprice = 9.50;
            System.out.println("The price of tickets at this hour is: " + ticketprice);
            System.out.println("");
        }
    }
    //Quiz 3.5 Question1
    /*Goal: Learn to write multi-way if statements.
    Assignment: Given a variable double grade, already declared and initialized: print on screen the following message:
    "Your grade is: A" if the grade is 90 or greater
    "Your grade is: B" if the grade is 80 or greater, but under 90
    "Your grade is: C" if the grade is 70 or greater, but under 80
    "Your grade is: D" if the grade is 60 or greater, but under 70
    "Your grade is: F" if the grade is lower than 60
     */
    //Solutions:

    public static void Question9() {
        Scanner testGrade = new Scanner(System.in);
        System.out.println("What is your grade for this test ");
        int grade = testGrade.nextInt();
        if (grade >= 90) {
            System.out.println("Your grade is: A");
        } else if (grade >= 80) {
            System.out.println("Your Grade is: B");
        } else if (grade >= 70) {
            System.out.println("Your Grade is: C");
        } else if (grade >= 60) {
            System.out.println("Your Grade is: D");
        } else if (grade < 60) {
            System.out.println("Your Grade is: F");
        }
    }
    // Quiz 3.5 Question2
    /*Goal: Understand how to use multi-way if statements.

Assignment: Develop a program to determine whether a student is eligible for an academic scholarship. The scholarship
committee has set multiple criteria that must be met, including academic performance, extracurricular involvement, and community service hours.
Eligibility Criteria:
The student must have a GPA of 3.8 or higher.
The student must be involved in at least two extracurricular activities.
The student must have completed at least 50 hours of community service.
Given the variables double gpa, int extracurriculars, and int serviceHours, already declared and assigned, as well as
the variable int scholarshipLevel that has just been declared.
If the GPA requirement is not met, assign 0 to scholarshipLevel
If the GPA requirement is met, but the extracurriculars requirement is not met, assign 1 to scholarshipLevel
If the GPA and the extracurriculars requirement are met, but the community service requirement is not met, assign 2 to scholarshipLevel
If the GPA, extracurriculars, and community service requirement are all met, assign 3 to scholarshipLevel
     */
    public static void Question10(){
        int scolarshipLevel = 0;

        //Input to get the users GPA from school
        Scanner gpaInput = new Scanner(System.in);
        System.out.println("What is your GPA: ");
        double gpa = gpaInput.nextDouble();

        System.out.println("How many extra curricular activities  did you participate in: ");
        int extracurriculars = gpaInput.nextInt();

        System.out.println("How many Service hours did you work?: ");
        int serviceHours = gpaInput.nextInt();


        if (gpa < 3.8){
            scolarshipLevel = 0;
        } else if (extracurriculars < 2) {
            scolarshipLevel = 1;
        } else if (serviceHours < 50) {
            scolarshipLevel = 2;
        }else {
            scolarshipLevel = 3;
        }
        System.out.println("Your Scolarship Level is: " + scolarshipLevel);
        System.out.println("");

    }
    //Quiz 3.10 Question1
    /*Goal: Learn to use boolean operators.
    Assignment: A simple light switch works by changing states between on and off. Assume a boolean variable called isLightOn
    already exists and has been declared. Write a piece of code that reassigns isLightOn to its opposite value.
     */
    public static void Question11(){
        boolean isLightOn = true;
        //Changes the boolean variable for the lights to opposite of what it was set too
        isLightOn = !isLightOn;
        System.out.println("Are the Lights on? " + isLightOn);
        System.out.println("");
    }
    //Quiz 3.10 Question2
    /*Goal: Learn to use boolean operators.

    Assignment: In a system monitoring water quality, sensors measure pH level and turbidity to ensure safety.
    Given int variables pHLevel and turbidity, write an expression that evaluates to true if pHLevel is no more than 1
    unit away from 7 and turbidity is lower than 3. Assign the result of this expression to the variable isSafe that has already been declared.
     */
    public static void Question12() {
        Scanner waterInput = new Scanner(System.in);
        System.out.println("What is the PH level: ");
        int pHLevel = waterInput.nextInt();

        System.out.println("What level iis the Turbidity: ");
        int turbidity = waterInput.nextInt();
        boolean isSafe = true;
        //This test the given PHLevel of the water minus 7 and seeing if its less than 1 and if the turbidity less than 3
        /*We alos use Math.abs for the absolute value of this equation so we can go in both directions negative and postive
        and not get an error in the code */
        isSafe = (Math.abs(pHLevel -7) <= 1) && (turbidity < 3);
        System.out.println("Is the variable isSafe True or False: ?" + isSafe);
        System.out.println("");
    }
    //Quiz 3.10 Question3
    /*Goal: Learn to use boolean operators.

    Assignment: At an amusement park, tickets are sold at a discounted rate to visitors who are younger than 16, older than 65, or who have a premium membership.
    Given the variables int age and boolean hasMembership, write an expression that evaluates to true if the condition
    for a discount applies, false otherwise, and assigns that value to the Boolean variable discount, which has already been declared.
     */
    public static void Question13(){
        int age = 0;
        boolean hasMembership = true;
        boolean discount = false;

        discount = (age < 16) || (age >= 65) || (hasMembership = true);
        System.out.println("Does the given person receive a discount:  " + discount);
        System.out.println("");
    }
    //Quiz 3.10 Question4
    /*Goal: Learn to use boolean operators.

    Assignment: A smart thermostat indicates whether the user is heating their apartment in an environmentally friendly way.
    This condition is true if either the heat pump or the radiator is turned on, but not both.
    Write an expression that evaluates to true if exactly one of the boolean variables heatPump and radiator is true.
    Assign the expression to the variable environmentallyFriendly, which is already declared.
     */
    public static void Question14(){
        boolean heatPump = true;
        boolean radiator = false;
        boolean environmentallyFriendly = true;

        environmentallyFriendly = (heatPump || radiator) && !(heatPump && radiator);

        System.out.println("Is my heating unit enviormentally friendly: ?" + environmentallyFriendly);
        System.out.println("");

    }
    //Quiz 3.14 Question1
    /*Goal: Learn how to use the conditional operator ? : for making decisions within expressions, based on a variable's value.

    Assignment: Write an expression using the conditional operator ? : that evaluates the variable age and prints the
    message "You are eligible to vote." if age is greater or equal to 18 or prints "You are not eligible to vote." otherwise.
    Assume int variable age is already declared and initialized.
     */
    public static void Question15(){
        int age = 21;
    //Your code follows the perfect ternary blueprint: Condition ? Result_If_True : Result_If_False;
        System.out.println(age>=18 ? "You are eligible to vote " : "You are not eligible to vote");

    }
    //Quiz 3.14 Question2
    /*Goal: Learn how to use nested ternary operators to simplify conditional statements.

    Assignment: Write a statement that evaluates the int variable age and prints the following, using the ternary operator:
    "Child": 0-12 years
    "Teen": 13-19 years
    "Adult": 20-64 years
    "Senior": 65 years and above
    Assume int variable age is already declared and initialized.
     */
    public static void Question16(){
        Scanner personsAge = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = personsAge.nextInt();
        //Your code follows the perfect ternary blueprint: Condition ? Result_If_True : Result_If_False;
        System.out.println(age < 13 ? "Child": age < 20? "Teen": age <65? "Adult": "Senior");
        System.out.println("");
    }
    //Quiz 3.14 Question3
    /* Goal: Learn to write ternary if statements.

    Assignment: In a new loyalty program for a café, customers are classified into tiers based on the number of coffee
    cups they've purchased. Each tier rewards customers with different benefits.

    Write an expression that evaluates the int variable coffeeCups, and prints one of the following, using the ternary operator:

    "None"
    "Bronze"
    "Silver"
    "Gold"
    "Platinum"
    The following values of coffeeCups define the categories:
    None: if the number of coffees is less than 10.
    Bronze tier is awarded between 10 cups and 19.
    Silver tier is awarded between 20 cups and 29,
    Gold tier is awarded between 30 and 39,
    Platinum tier is awarded over 39 cups.
    Assume int variable coffeeCups is already declared and initialized.
     */
    public static void Question17() {
        int coffeCups = 0;
        System.out.println(coffeCups < 10? "None":
                          (coffeCups < 19? "Bronze":
                                  (coffeCups <30? "Silver":
                                          (coffeCups <40? "Gold": "Platnium"))));


    }
    // Chapter 3 Programming Assignment 1
    /*Write a program that prompts the user to enter the month and year and displays the number of days in the month.
    For example, if the user entered month 2 and year 2012, the program should display:

    February 2012 has 29 days
    If the user entered month 3 and year 2015, the program should display:

   March 2015 has 31 days
    Sample Run 1

    Enter a month in the year (e.g., 1 for Jan): 2
    Enter a year: 2012
    February 2012 has 29 days
    Sample Run 2

    Enter a month in the year (e.g., 1 for Jan): 4
    Enter a year: 2005
    April 2005 has 30 days
    Sample Run 3

    Enter a month in the year (e.g., 1 for Jan): 2
    Enter a year: 2006
    February 2006 has 28 days
    Sample Run 4

    Enter a month in the year (e.g., 1 for Jan): 2
    Enter a year: 2000
    February 2000 has 29 days

     */
    public static void Question18() {
        //Created a new Input Scanner to receive info from the user
        Scanner input = new Scanner(System.in);
        //Input for the Month variable
        System.out.println("Enter the month (1-12): ");
        int month = input.nextInt();
        //Input for the Year variable
        System.out.println("Enter the year: ");
        int year = input.nextInt();

        //We create the int variable for the number of days in each month
        int days = 0;

        //We create a String Variable to store the actual month name
        String monthName = "";

        switch (month) {
            case 1: {
                monthName = "January"; days = 31;
                break;
            }
            case 2: {
                monthName = "February";
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                    break;
                }
            }
            case 3: {
                monthName = "March";
                days = 31;
                break;
            }
            case 4: {
                monthName = "April";
                days = 30;
                break;
            }
            case 5: {
                monthName = "May";
                days = 31;
                break;
            }
            case 6: {
                monthName = "June";
                days = 30;
                break;
            }
            case 7: {
                monthName = "July";
                days = 31;
                break;
            }
            case 8: {
                monthName = "August";
                days = 31;
                break;
            }
            case 9: {
                monthName = "September";
                days = 30;
                break;
            }
            case 10: {
                monthName = "October";
                days = 31;
                break;
            }
            case 11: {
                monthName = "November";
                days = 30;
                break;
            }
            case 12: {
                monthName = "December";
                days = 31;
                break;
            }
            default: {
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
                System.exit(1);
            }
        }
        System.out.println(monthName + " " + year + " has " + days + " days");
    }
    //Chapter 3 Programming Assianment 2
    /*

     */
    public static void Question19(){

    }


    //Quiz 3.13 Question 1
    /* Goal: Understand how to use switch statements to handle multiple conditions.

    Assignment: Write a full program with class name Calculator to solve a calculator problem that prompts the user for
    2 (double) numbers and an operator (char) and outputs the result.
    Sample run:

    Enter the first number: 10
    Enter the second number: 5
    Choose the operation (+, -, *, /): *
    The result is: 50

    Enter the first number: 10
    Enter the second number: 0
    Choose the operation (+, -, *, /): /
    Cannot divide by zero.

    Enter the first number: 10
    Enter the second number: 0
    Choose the operation (+, -, *, /): ^
    Invalid operation selected.
    */
    //Solution:

    public static void Question20() {
        Scanner Calinput = new Scanner(System.in);
        //Getting input for the first number
        System.out.println("Enter the first number: ");
        double num1 = Calinput.nextDouble();

        //Getting input for the first number
        System.out.println("Enter the second number: ");
        double num2 = Calinput.nextDouble();

        //Getting the Character input
        System.out.println("Choose the operation (+, -, *, /): ");
        char operator = Calinput.next().charAt(0);

        switch (operator) {
            case '+': {
                System.out.println("The result is :" + (num1 + num2));
            }
            case '-': {
                System.out.println("The result is :" + (num1 - num2));
            }
            case '*': {
                System.out.println("The result is :" + (num1 * num2));
            }
            case '/': {
                if (num2 != 0) {
                    System.out.println("The result is :" + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }

            }
            default:
                System.out.println("Invalid operation selected.");
        }
    }



    }
