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
        Question10();//Quiz 2.9.2 Learn to write simple arithmetic expressions.
        Question11();//Quiz 2.9.2 Learn to write simple arithmetic expressions.
        Question12();//Quiz 2.10 Learn to write literals.
        Question13();//Quiz 2.10 Learn how to write literals.
        Question14();//Quiz 2.10  Learn how to use scientific notation
        Question15();//Quiz 2.14 Learn to use augmented assignment operators.Question1
        Question16();//Quiz 2.14 Learn how to use augmented assignment operators.Question2
        Question17();//Quiz 2.15 Learn how to use increment and decrement operators.Question1
        Question18();//Quiz 2.15 Learn how to use increment and decrement operators.Question2
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
    //Quiz 2.9.2 Question2
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
    //Quiz 2.9.2 Question3
    /*Goal: Learn to write simple arithmetic expressions.
    Assignment: In developing an interstellar navigation app, you need to convert distances expressed in kilometers to
    parsecs, which is a common unit of length for astronomical distances. Assume a double constant FACTOR was declared
    that represents the conversion factor from kilometers to parsecs, i.e., 1 parsec is FACTOR kilometers. This means
    that to convert kilometers to parsecs, we divide the distances in kilometers by FACTOR. Given a double variable
    distanceKilometers, write a statement that declares a double variable distanceParsecs and assigns to it the distance expressed in parsecs.
     */
    public static void Question10() {
        double parsecs = 1;
        double kilometers = 0;
        final double FACTOR = parsecs = kilometers;

        double distanceParsecs = kilometers / FACTOR;
    }
    //Quiz 2.9.2 Question4
    /*Goal: Learn how to write simple arithmetic expressions.
    Assignment: As the manager of a music concert venue, you're organizing a big event and need to make sure everyone
    has a good view and experience. You, therefore, decided to divide the venue into sections, each holding an equal
    number of attendees. As the concert venue is far from the city, a bus service is supplied to carry people to the concert. Assume that:
    the int variable numOfBuses represents the total number of buses that will be used;
    the int variable busCapacity represents the number of people each bus will carry;
    the int constant SECTION_CAPACITY represents the maximum number of attendees that can be assigned to a section.
    Write a single statement that declares an int variable extraPeople and assigns to it the number of people that will
    end up assigned to a section that potentially will not be full, depending on if the total number of attendees is divisible by the section capacity.
     */
    public static void Question11() {
        int numOfBuses = 5;
        int busCapacity = 36;
        final int SECTION_CAPACITY = 25;

        int extraPeople = (numOfBuses * busCapacity)  % SECTION_CAPACITY;
    }
    //Quiz 2.10 Question1
    /*Goal: Learn to write literals.
    Assignment: As you know, in Java, an int variable can store positive values up to
    Write a statement that declares a variable
    and assigns to it the value 2147483648 using the appropriate data type.
     */
    public static void Question12() {
        long n = 2147483648L;
    }

    //Quiz 2.10 Question2
    /*Assignment: Write a statement that declares a float constant C that contains the value of the speed of light in a vacuum. Assume
    C = 299,792,458.0
    m/s (meters per second).
     */
    public static void Question13() {
        final float C = 299792458.0F;
    }
    //Quiz 2.10 Question3
    /*Assignment: The Avogadro Number, indicated by the symbol NA  is a fundamental constant in physics and its value is 6.02214076x1o^23
    (reciprocal moles). Write a statement that declares a double constant NA whose value is the value of the Avogadro
    Number. Use scientific notation in your assignment expression.
     */
    public static void Question14(){
        final double NA = 6.02214076e23;
    }
    //Quiz 2.14 Question1
    /*Goal: Learn to use augmented assignment operators.
    Assignment: In managing a book club, the number of members is set to increase as a result of a successful recruitment event.
    Given an int variable bookClubMembers, write a statement that increases the value of that variable by 5. New members
    also mean more budget, write a second statement that triples the given double variable budget.
     */
    public static void Question15() {
        int bookClubMember = 20;
        double budget = 250.0;
        bookClubMember += 5;
        budget *= 3;
        System.out.println("How many members did we add? " + bookClubMember +" How much did the budget increase? " + budget);
    }
    //Quiz 2.14 Question2
    /*Goal: Learn how to use augmented assignment operators.
    Assignment: Assuming all the following int variables have been declared and initialized, rewrite all the following
    statements and, if possible, use augmented assignment operators:
    x = x % (n * m - 14);
    y = (n + m - 14) / x;
    x = x * x;
     */
    public static void Question16(){
        int x = 20, y= 30, m= 45, n= 55;

        x %= (n * m -14);
        y = (n + m - 14) / x;
        x *= x;
        System.out.println(x + y );
    }
    //Quiz 2.15 Question1
    /*Goal: Learn how to use increment and decrement operators.
    Assignment: Assuming all the variables involved have been declared and initialized, write a single statement,
    using increment/decrement operators, that assigns to x the current value of y divided by 5 and then decrements y by one in the same statement.
     */
    public static void Question17(){
        int x = 15;
        int y = 23;
        x = y -- /5;
        System.out.println(x);
    }
    //Quiz 2.15 Question2
    /*Goal: Learn how to use increment and decrement operators.
    Assignment: Assuming all the variables involved have been declared and initialized, write a single statement, using
    increment/decrement operators, that assigns to x the value of x divided by the current value of y incremented by one.
    The statement should, at the same time, also increment y by one. Write the statement in the shortest possible way.
     */
    public static void Question18(){
        int x = 45, y = 89;
        x /= ++y;
        System.out.println(x);
    }
}
