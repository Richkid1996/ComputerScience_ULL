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
    /*

     */
}

