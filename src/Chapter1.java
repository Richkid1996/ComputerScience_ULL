/* This Class will be covering Chapter 1 which is the introduction to Programming were we began to cover the basics of
Java and began to start programing
 */
public class Chapter1 {
    public static void main(String[] args) {
        System.out.println("---Running Chapter 1 Practice ---");

        Question1(); //  Quiz 1.7 Question 1
        Question2(); //
    }

    //Quiz 1.7 Question 1:
    /* Goal: Learn how to display messages to the console output.
    Assignment: In the quiet village of Codeville, a tradition exist where newcomers announce their arrival at the
    central square. Write a Java statement to print "New coder in Codeville, ready to explore!" to the screen.
     */
    public static void Question1() {
        System.out.println("New coder in Codeville, ready to explore!");
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

    }

}
