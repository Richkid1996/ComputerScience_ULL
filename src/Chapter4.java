//Chapter 4:Mathmatical Functions, Characters, and strings
//Quiz 4.3.4:Comparing and Testing Characters
import java.util.Scanner;
public class Chapter4 {
    public  static void main(String[] args) {
       char c1 = 'a';
       char c2 = 'b';
        Question1(c1,c2 );// Quiz 4.3 Familiarize with the operations of characters.
        Question2();// Quiz 4.3 Learn to use methods to validate characters.
        Question3();// Quiz 4.3 Learn to write programs manipulating characters.
        Question4();//Quiz 4.4 Learn to assign string literals.
    }
    //Quiz 4.3 Question1
    /*Goal: Familiarize with the operations of characters.
    Assignment: You are developing your first messaging app. As part of an effort top make communications more secure,
    you decide to encrypt your messages using a string of characters of the same length, that both the sender and receiver
    possess. You are tasked with writing the Code that will decipher the message.
    Assume two char variables c1 and c2 have been declared and assigned a value. Write a code snippet that prints out the
    character associated with the sum of the integer values of c1 and c2.
     */
    public static void Question1(char c1, char c2) {

        //We sum the values, then cast the total back to a (char)
        System.out.println((char)(c1+c2));
        System.out.println("");//Creates Space between the output
    }
    //Quiz 4.3 Question2
    /* Goal: Learn to use methods to validate characters.
    Assignment: As part of the login page of your app, you need to validate that each character of a user's username is valid.
    Given a char variable character, write a statement that assigns to the already declared boolean variable
    isValid whether character is a lowercase character.
     */
    public static void Question2(){
        char character = 'g'; //Try changing this to 'G' or '5'
        boolean isValid;
        //Assigns true to isValid only if the character is a lowercase letter
        isValid = Character.isLowerCase(character);
        //Prints the final validation result to the console for the user to see
        System.out.println("(Is '" + character + "' a valid lowercase letter? " + isValid);
    }
    //Quiz 4.3 Question3
    /*Goal: Learn to write programs manipulating characters.
    Assignment: You are currently working with the Unicode and ASCII encodings. Unfortunately, receiving numbers is not
    easily understandable for a human, and you need to quickly know what character is associated with a number and which
    table encodes it.
    Create a program that reads an integer from the keyboard. Then, print whether it's an ASCII or Unicode character and
    which character it is. Your class name should be Answer.
    Note: For ASCII, consider only the original 8-bit ASCII table, not the extended version.
     */
    public static void Question3() {
    Scanner input = new Scanner(System.in);

    if (input.hasNextInt()) {
        int num = input.nextInt();
        char character = (char) num;
    }
    }
    //Quiz 4.4 Question1
    /*Goal: Learn to assign string literals.

    Assignment: In a project tracking system, each task has an author and a name. To make the tasks easily identifiable,
    you decide to combine the two and use it as the key for your tasks.
    Assume the String variables title and author have been declared and assigned a value. Write a code snippet that
    declares the String variable key and assigns it the concatenation of the lower-case versions of title and author.
     */
    public static void Question4(){

    }
}
