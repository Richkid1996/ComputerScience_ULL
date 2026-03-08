import java.util.Scanner;
public class Chapter5 {
    public static  void main(String[] args) {
        System.out.println("---Running Chapter 5 Practice---");
        Question1();//Quiz 5.7 Learn to write for loops Question 1
        Question2();//Quiz 5.7 Learn to write for loops Question 2
        Question3();//Quiz 5.7 Learn to write for loops Question 3
        Question4();//Quiz 5.7 Learn to write for loops Question 4
        Question5();//Quiz 5.7 Learn to write for loops Question 5
        Question6();//Quiz 5.2 Learn to write while loops.
        Question7();//Quiz 5.2 Learn to write while loops.
        Question8();//Quiz 5.2 Learn to write while loops.
        Question9();//Quiz 5.3 Learn to write while loops with sentinels.
        Question10();//Quiz 5.3 Learn to write while loops with sentinels.
        Question11();//Quiz 5.4 Learn to write while loops.
        Question12();//Quiz 5.4 Learn to write while loops with sentinels.
        Question13();//Quiz 5.5 Learn to write loops with input redirection.
        Question14();//Quiz 5.6 Learn to write do-while loops.
    }
    //Quiz 5.7 Question1
    /*Goal: Learn to write for loops.

    Assignment: In a new mobile game, players earn points by overcoming obstacles. Each level has an increasing number of
    obstacles, and the points earned for each obstacle in a level are equal to the square of the level number. The game
    designer needs to calculate the total points that can be earned from the first 20 levels to adjust the game's difficulty.
    Given int variables level and totalPoints, use a for loop to compute the total points a player can earn by completing
    all obstacles in the first 20 levels. The points from each level are the square of the level number multiplied by the
    number of obstacles in that level (assume each level has obstacles equal to the level number). Store this cumulative point total in totalPoints.
      For example, level 1 has 1 obstacle worth 1^2 points, level 2 has 2 obstacles each worth 2^2 points (totaling 4*2=8
    points for level 2), and so on. You must use level for the for loop control variable.
     */
    public static void Question1() {
        int totalPoints = 0;
        //The for loop runs from level 1 to level 20 in increments of 1 because (level++) is the same as (level = level + 1)
        for (int level = 1; level <= 20; level++) {
            //Here is where we store the point totals and this represents the obstacle value and the number of obstacles
            //So were essential setting it to a power in the () times the level number
            totalPoints += (level * level) * level;
        }
        System.out.println("What is the Total Points: " + totalPoints);
    }
    //Quiz 5.7 Question2
    /*Goal: Learn to write for loops.

    Assignment: Given an int variable n already declared and initialized. Write a for loop that prints the first n Lucas numbers.
    They are defined as follows: U0=2, U1=1, Un+2=Un+1 + Un. Declare and initialize all other necessary variables.
    For example, if n is 5, your code should print:
    u0 = 2
    u1 = 1
    u2 = 3
    u3 = 4
    u4 = 7
    u5 = 11
     */
    public static void Question2(){
        int n = 5;
        int u0 = 2;
        int u1 = 1;
        int un = 0;
        System.out.println("u0 = " + u0);
        System.out.println("u1 = " + u1);
        for (int i = 2; i <= n; i++) {
            //Calculate the next number in the sequence
            un = u0 + u1;
            //Print the result for the current index
            System.out.println("u" + i + " = " + un);

            //Slide the values: the old u1 becomes the new u0,
            //and the new un becomes the new u1 for the next lap.
            u0 = u1;
            u1 = un;
        }

    }
    //Quiz 5.7 Question3
    /*Goal: Learn to write for loops.

    Assignment: Given an int variable n already declared and initialized, write a code snippet that prints integer values
    from 1 through n that are both multiples of 3 and end in 1.
    For example, if n is 100, your code should print:
    21 51 81
    Hint: use the modulo operator %.
     */
    public static void Question3(){
       int n = 100;
        for (int i = 1; i <= n; i ++) {
            //Rule 1: Must be a multiple of 3 (i % 3 == 0)
            //Rule 2: Must be end in 1 (i % 10 == 1)
            if (i % 3 == 0 && i % 10 == 1) {
                System.out.print(i + " ");
            }
        }

    }
    //Quiz 5.7 Question4
    /*Goal: Learn to write for loops.

    Assignment: Write a for loop that prints all the integers from 300 down to 150 inclusive that are multiples of 3, each
    separated by exactly one space. There should be no space before the first number and after the last number in the output.
     */
    public static void Question4(){
        boolean first = true; //This is the flag to handle the space logic
        for (int i = 300; i >= 150; i--){
            if (i % 3 == 0){
                if(!first){
                    System.out.print("");// This adds a space Only
                }
                System.out.print(i);
                first = false;
            }
        }
    }

    public static void Question5(){
        Scanner stdin = new Scanner(System.in);
        System.out.println("What is the first number?: ");
        int number1 = stdin.nextInt();

        System.out.println("What is the second number");
        int number2 = stdin.nextInt();
        int gcd = 1;

// Use the same names (number1, number2) inside the loop
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
    //Quiz 5.2 Question1
    /*Goal: Learn to write while loops.
    Assignment: In a game development project, you're tasked with calculating the initial health points (HP) of a character,
    which is determined by the factorial of the level. At each level, the character multiplies their HP by that level up to level 10.

    Use int variables level and hp, and use a while loop to compute hp at level 10.

    Use no variables other than level and hp. Declare and initialize level and hp with appropriate values to ensure the
    loop iterates correctly and calculates the factorial accurately. In the end, level should be 10, and hp should be 10 factorial.

    Write a code snippet to accomplish this task.
     */
    public static void Question6(){
        int level = 1;
        int hp = 1;

        while (level <= 10) {
            hp *= level;
            level ++;
        }
        System.out.println(hp);
    }
    //Quiz 5.2 Question 2
    /*Goal: Learn to write while loops.

    Assignment: Assuming a Scanner stdin has already been declared and instantiated
    (i.e., Scanner stdin = new Scanner(System.in); is given), write a snippet of code that continuously prompts the user
    for an integer input, until that input is a multiple of 3 and print this number. No other input validation is needed in this assignment.
     */
    public static void Question7() {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        int num = 1;
        while (num % 3 != 0) {
            num = stdin.nextInt();
        }
        System.out.println(num + " is a multiple of 3");
    }
    //Quiz 5.3 Question 3
    /*Goal: Learn to write while loops.

    Assignment: Assume a Scanner input has already been declared and instantiated (i.e., Scanner input = new Scanner(System.in); is given),
    write a code snippet that reads 10 input values from the user, without a prompt.
    Your program should only print back the input if it is a multiple of 5. No further input validation is required here.
    Declare all necessary variables. Do not prompt the user with text. Print each number on a separate line.
     */
    public static void Question8(){
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count  < 10) {
            int numInput = input.nextInt();
            if (numInput % 5 ==0) {
                System.out.println(numInput);
            }
            count ++;
        }
    }
    //Quiz 5.3 Question1
    /*Goal: Learn to write while loops with sentinels.

    Assignment: Assume a Scanner stdin has been declared and instantiated (i.e. Scanner stdin = new Scanner(System.in); is given).
    Write a loop that continuously prompts the user for a username. The loop will keep running until the user inputs a
    username of 8 characters or longer. Your program will print the final username.
     */
    public static void Question9(){
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please give me the correct username:");
        String username = "";
        while (username.length() < 8) {
             username = stdin.nextLine();
        }
        System.out.println(username);
    }
    //Quiz 5.3 Question2
    /*Goal: Learn to write while loops with sentinels.

    Assignment: In a data analysis application for environmental studies, temperature readings from a sensor are recorded in a sequence.
    Sudden temperature spikes or drops are significant and are marked when the difference between one reading and the next exceeds 5 degrees.

    Write code that reads a sequence of temperature readings (as integers) from standard input, terminated by a negative number.
    The code should identify and count occurrences where the absolute difference between consecutive readings exceeds 5 degrees.
    After processing, print the count of such significant changes.

    For example, given the sequence "12 15 7 7 22 18 -1", the code should print "2" because there are two instances where
    consecutive readings differ by more than 5 degrees (15 to 7 and 7 to 22).

    Assume a Scanner stdin object for standard input is provided.
     */
    public static void Question10() {
        Scanner stdin = new Scanner(System.in);
        int significantChanges = 0;

        if (stdin.hasNextInt()) {
            int previous = stdin.nextInt();

            while (true) {
                int current = stdin.nextInt();

                if (current <0) break;

                if (Math.abs(current - previous) >5) {
                    significantChanges ++;
                }
                previous = current;
            }
        }
        System.out.println(significantChanges);
    }
    //Quiz 5.4 Question 1
    /*Goal: Learn to write while loops.

    Assignment: Given a Scanner stdin already declared and instantiated, create a loop that continuously reads integers
    and accumulates all positive values (greater than 0). The loop should stop when the sum is greater than 100. On exit, your code should print the final sum.
     */
    public static void Question11(){
        Scanner stdin = new Scanner(System.in);
        int sum = 0;
        while (sum <= 100) {
            int num = stdin.nextInt();
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
    //Quiz 5.4 Question 2
    /*Goal: Learn to write while loops with sentinels.

    Assignment: Write a loop that continuously prompts the user for int values, until the user inputs a negative value.
    After the loop terminates, your program will display the largest value entered by the user.

    Declare any necessary variables and assume the availability of a Scanner object named stdin for standard input.
     */
    public static void Question12(){
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please provide a value:");
        int value;
        int max = Integer.MIN_VALUE;

        while (true) {
            value = stdin.nextInt();

            if (value < 0){
                break;
            }
            if (value > max) {
                max = value;
            }
        }
        if (max != Integer.MIN_VALUE) {
            System.out.println(max);
        }
    }
    //Quiz 5.5 Question 1
    /*Goal: Learn to write loops with input redirection.

        Assignment: Given a Scanner reference variable named input associated with an input source,
        write the code to read every line and display the count of the longest line. For example, if the input consists of the lines
    Welcome
    Welcome to Java
    Spring is here
    The output should be

    The length of the longest line is 15
    Hint: Use input.nextLine() to read a line and input.hasNextLine() to check for more input.
     */
    public static void Question13(){
        Scanner inputSource = new Scanner(System.in);
        int maxLength = 0;

        while (inputSource.hasNextLine()) {
            String currentLines = inputSource.nextLine();

            if (currentLines.length() > maxLength) {
                maxLength = currentLines.length();
            }
        }
        System.out.println("The length of the longest line is  " + maxLength);
    }
    //Quiz 5.6 Question1
    /*Goal: Learn to write do-while loops.

    Assignment: Write a do-while loop to print "Hello, World!" on a new line 50 times.
    After every 10th instance prior to the last one (the 50th), the program will also display "Good-bye, World!", on a new line.

    The output from your code should be the following:
     */
    public static void Question14(){
        int count = 1;
        do {
            System.out.println("Hello World!");

            if (count % 10 == 0 && count <50) {
                System.out.println("Goodbye World!");
            }
            count ++;
        }while (count <=50 );
    }


}

