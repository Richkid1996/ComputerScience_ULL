import java.util.Scanner;
public class Chapter5 {
    public static  void main(String[] args) {
        System.out.println("---Running Chapter 5 Practice---");
        Question1();//Quiz 5.7 Learn to write for loops Question 1
        Question2();//Quiz 5.7 Learn to write for loops Question 2
        Question3();//Quiz 5.7 Learn to write for loops Question 3
        Question4();//Quiz 5.7 Learn to write for loops Question 4
        Question5();//Quiz 5.7 Learnto write for loops Question 5
        Question6();//Quiz 5.
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
        //The for loop runs from level 1 to level 20 in incraments of 1 because (level++) is the same as (level = level + 1)
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



}

