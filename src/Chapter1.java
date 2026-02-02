/* This Class will be covering Chapter 1 which is the introduction to Programming were we began to cover the basics of
Java and began to start programing
 */
public class Chapter1 {
    public static void main(String[] args) {
        System.out.println("---Running Chapter 1 Practice ---");

        Question1(); //  Quiz 1.7 Question 1
        Question2(); //  Quiz 1.7 Question 2
        Question3(); //  Quiz 1.7 Question 3
        ProgrammingProject1(); // Programming Project for Chapter 1
        ProgrammingProject2(); // Programming Project 2 for Chapter  1
    }

    //Quiz 1.7 Question 1:
    /* Goal: Learn how to display messages to the console output.
    Assignment: In the quiet village of Codeville, a tradition exist where newcomers announce their arrival at the
    central square. Write a Java statement to print "New coder in Codeville, ready to explore!" to the screen.
     */
    public static void Question1() {
        System.out.println("New coder in Codeville, ready to explore!");
        System.out.println("");
    }

    //Quiz 1.7 Question 2:
    /* Goal: Learn how to write a simple Java program.
    Assignment: In the ancient land of Codegypt, a new square pyramid was discovered. Archeologists measured the height
    and the base side of the pyramid to be 150 and 200 meters long. Your task is to help them compute the volume of the
    pyramid using the following formulas: Volume = BaseArea * Height / 3
     */
    public static void Question2() {
        int Height = 150;
        int BaseSide = 200;

        int BaseArea = BaseSide * BaseSide;

        int Volume = (BaseArea * Height) / 3;
        System.out.println(Volume);
        System.out.println("");

    }
    //Quiz 1.7 Question 3:
    /* Goal: Learn how to write a simple complete Java Program.
    Assignment: While in a magic computer science department library, you come across an interesting book with the
    following preamble:
     */
    public static void Question3() {
        System.out.println("Once a upon a time in a land far, far away,");
        System.out.println("");
        System.out.println("a curious programmer discovered a magic laptop. ");
        System.out.println("");
        System.out.println(" Surpisingly, the laptop granted the power to code dreams into reality.");
        System.out.println("");
        System.out.println("And so, the adventure of coding began,");
        System.out.println("");
    }

    //Chapter 1: Auto-Graded Programming Project 1
    /* Write a program that displays "Welcome to Java", "Welcome to Computer Science", and "Programming is fun".
     */
    public static void ProgrammingProject1() {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
    }

    //Chapter 1: Auto-Graded Programming Project 2
    /*Write a program that displays the result of (9.5*4.5-2.5*3)/(45.5-3.5)
     */
    public static void ProgrammingProject2() {
        System.out.println((9.5 * 4.5)/(45.5-3.5));
    }
}
