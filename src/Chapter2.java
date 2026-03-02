//Elementary Programming Chapter 2
/*This Class will be covering Chapter 2 were we will be learning about variables and how they may be changed on the program
We will be covering how to use Scanners */

import java.util.Scanner;
public class Chapter2 {
    public static void main(String[] args) {
        System.out.println("----Running Chapter 2 Practice----");

        Question1(); // Quiz 2.5 Double Variables Question1
        Question2(); // Quiz 2.5 Scanner and MyScanner Question2
        Question3(); // Quiz 2.6 Assignment Statements and Assignment Expression
        Question4(); // Quiz 2.6 Assignment Statements and Assignment Expression
        Question5(); // Quiz 2.7 Learn how to declare and initialize constants.
        Question6(); //Quiz 2.7 Learn how to use constants and chained assignment expressions.
        Question7(); // Quiz 2.9 Learn to declare and initialize variables
        Question8(); //Quiz 2.9.2 Learn how to write simple arithmetic expressions.
        Question9(); //Quiz 2.9.2 Learn how to write simple arithmetic expressions.
    }

    //Quiz 2.5 Question 1
    /*Goal: Learn how to declare and initialize variables
    Assignment: When preparing a recipe, you need to measure the volume of liquid ingredients in liters.
    Declare two double variables, one named milk with a value of 0.75 and the other named water with a value of 1.25.
     */
    public static void Question1() {
        double milk = 0.75;
        double water = 1.25;
        System.out.printf("Milk cost: " + milk + " Water cost: " + water);
        System.out.println(); // Cleans code and adds space between questions Output
    }
    //Quiz 2.5 Question 2
    /*Goal: Learn to read and store the user's input values.
    Assignment: Assume that a Scanner object named myScanner has been created and an int variables named myInteger has
    been declared. With a Java statement to read a user's input value and store it in myInteger.
     */
    public static void Question2() {
        Scanner myScanner = new  Scanner(System.in);// This is how you create the tool (Scanner) do this first
        //Declare the variable (int)
        int myInteger;
        System.out.println("Enter an integer");// This Shows in the terminal

        //Where we store the input!
        myInteger = myScanner.nextInt();
        System.out.println("You entered: " + myInteger);
        System.out.println("");
    }
    //Quiz 2.6 Question 1
    /*Goal: Learn how to use simple assignment statements.
    Assignment: In a video game development project, you are coding the leveling system where a character starts at a certain
    level and gains a set number of levels after completing a mission.
    Given two int variables startLevel and levelAfterOneMission, write a statement that assigns levelAfterOneMission a value
    that is 5 levels higher than the startLevel.
     */
    public static void Question3(){
        int startLevel = 0;
        double levelAfterOneMission = 0.0;
        levelAfterOneMission = startLevel + 5;
        System.out.println("The level your in after one mission is: " + levelAfterOneMission);

    }
    //Quiz 2.6 Question 2
    /*Goal: Learn how to swap and update variables.
    Assignment: Given two int variables x and y, write a piece of code that assigns the value of x to y and assigns the
    original value of y decremented by 3 to x. You are free to declare and use an auxiliary variable if needed. */
    public static void Question4() {
        // Assign the values of x and y
        int x  = 5;
        int y = 10;

        //Assign the original value of y to a new variable
        int tempY = y;

        //Assign the value of x to y
        y = x;

        x = tempY - 3;

        System.out.println("The value of Y: " + tempY);
        System.out.println("");
    }
    //Quiz 2.7 Question1
    /*Goal: Learn how to declare and initialize constants.
    Assignment: In a software system monitoring a spaceship, it's crucial to have a constant that represents a minimum
    threshold of fuel so that the crew is informed when the ship is running out of fuel.
    Declare a double constant, FUEL_THRESHOLD, whose value is 90.0.
     */
    public static void Question5(){
       final double FUEL_THRESHOLD = 90.0;
       System.out.println("What is the fuel value: " + FUEL_THRESHOLD);
       System.out.println("");
    }
    //Quiz 2.7 Question2
    /*Assignment: While developing your video game, you need to decide the initial level of stamina when players are
    spawned in the game. First, declare an int constant INITIAL_STAMINA, whose value is 100. Then, write a single
    statement to declare the int variables player1Stamina and player2Stamina and assign the value of INITIAL_STAMINA to both.
     */
    public static void Question6(){
        final int INITIAL_STAMINA = 100;
        int player1Stamina = INITIAL_STAMINA, player2Stamina = INITIAL_STAMINA;
    }
    // Goal: Learn to declare and initialize variables.
    /*Assignment: Declare a double constant NEPER_NUMBER that stores the following approximation of the Neper number 2.71828
 .  Then, assuming that a Scanner object myScanner that can read input from the user is available, write a single statement
    to declare a long variable longValue and use it to store the next value provided by the user.
     */
    public static void Question7(){
       final double NEPER_NUMBER = 2.71828;
       Scanner myScanner2 = new Scanner(System.in);
       System.out.println("Please give me a number value: ");
       long longValue = myScanner2.nextLong();
       System.out.println("The value given is:" + longValue);
       System.out.println("");
    }
    //Quiz 2.9.2 Question1
    /*Goal: Learn how to write simple arithmetic expressions.
    Assignment: A peer programming student wrote the following statement to compute the ratio between 10 and 4 and assign it to the double variable ratio:
    double ratio = 10 / 4;
    However, this needs to be corrected as ratio results to hold the value 2.0 instead of 2.5. Can you help the student write the correct statement?
     */
    public static void Question8() {
        double ratio  = 10.0 / 4;
        System.out.println("Whats the output of ratio: " + ratio);
        System.out.println("");
    }
    //Quiz 2.9.2 Question9
    /*Goal: Learn how to write simple arithmetic expressions.
    Assignment: Assume that:
    an int variable totalCookies represents the total number of cookies produced in a day;
    an int variable cookiesPerBox represents the number of cookies you can store in a box.
    Write a line of code that declares an int variable leftovers and assigns it to the number of leftover cookies after
    dividing all the cookies into full boxes.
     */
    public static void Question9(){
        Scanner cookies = new Scanner(System.in);
        System.out.println("How many cookies have we sold today: ");
        int totalCookies = cookies.nextInt();
        int cookiesPerBox = 6;
        int leftovers = totalCookies % cookiesPerBox;
        System.out.println("How many leftover cookies do we have: " + leftovers);
    }


}
