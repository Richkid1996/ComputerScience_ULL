//This Class will be covering Chapter 2 were we will be learning about variables and how they may be changed on the program

public class Chapter2 {
    public static void main(String[] args) {
        System.out.println("----Running Chapter 2 Practice----");

        Question1(); // Quiz 2.5 Double Variables Question1
        Question2(); // Quiz 2.5 Scanner and MyScanner Question2
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
    }
    //Quiz 2.5 Quuestion 2
    /*Goal: Learn to read and store the user's input values.
    Assignment: Assume that a Scanner object named myScanner has been created and an int variables named myInteger has
    been declared. With a Java statement to read a user's input value and store it in myInteger.
     */
    public static void Question2() {
        myInteger = myScanner.nextInt();
    }

}
