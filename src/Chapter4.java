//Chapter 4:Mathmatical Functions, Characters, and strings
//Quiz 4.3.4:Comparing and Testing Characters
import java.util.Locale;
import java.util.Scanner;
public class Chapter4 {
    public  static void main(String[] args) {
       char c1 = 'a';
       char c2 = 'b';
        Question1(c1,c2 );// Quiz 4.3 Familiarize with the operations of characters.
        Question2();// Quiz 4.3 Learn to use methods to validate characters.
        Question3();// Quiz 4.3 Learn to write programs manipulating characters.
        Question4();//Quiz 4.4 Learn to assign string literals.
        Question5();//Quiz 4.4 Learn to trim a string.
        Question6();//Quiz 4.4.2 Learn to access characters in a string.
        Question7();//Quiz 4.4.3 Learn to concatenate strings.
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
        String title = "Moby Dick";
        String author = "Lewis Hamilton";
        String key = title.toLowerCase() + author.toLowerCase();
        System.out.println(key);
    }
    //Quiz 4.4 Question2
    /*Goal: Learn to trim a string.

    Assignment: As part of the backend team of a streaming service, you are developing a new encoding to make audio
    streaming easier. The audio signals are converted to strings, the first character of which is a checksum for the signal.
    Several white spaces are added to the string at the end to have a consistent number of characters each string carries.
    Assume a String variable signal has already been declared and initialized. Write a code snippet that reads the first
    non-whitespace character of signal. Assign this character to the char variable firstChar, already declared.
    If signal is empty or contains only white space, firstChar will be assigned \0.
     */
    public static void Question5(){
            String signal = "     ";
            String trimmedSignal = signal.trim();
            char firstChar;
            if (trimmedSignal.isEmpty()) {
                firstChar = '\0';
            } else {
                firstChar = trimmedSignal.charAt(0);
        }
    }
    //Quiz 4.4.2 question1
    /*Goal: Learn to access characters in a string.

    Assignment: In a system for cataloging digital books, each book has a unique identifier code.
    The last digit of this code determines the genre of the book.
    Given a String variable bookCode and a char variable lastChar, write a code snippet that assigns to lastChar the last
    character of the bookCode. If the value of bookCode were "XJ39E", the expression's value would be 'E'.
     */
    public static void Question6(){
            String bookCode = "XJ39E";
            char lastChar;
            lastChar = bookCode.charAt(bookCode.length()-1);
            System.out.println(lastChar);
    }
    //Quiz 4.4.3 Question1
    /*Goal: Learn to concatenate strings.
    Assignment: You need to send some data to a remote server that reads a stream of characters. The server works as follows:
    it first reads the length of the string that it should parse, followed by a space, and finally, the actual string.
    Given the string message, write a code snippet that follows the above format and assigns its value to the previously
    declared String variable formattedMessage. For example, if message were "Hello World!", formattedMessage should be "12 Hello World!".
     */
    public static void Question7(){

    }
}
