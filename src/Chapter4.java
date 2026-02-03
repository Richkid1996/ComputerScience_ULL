//Chapter 4:Mathmatical Functions, Characters, and strings
//Quiz 4.3.4:Comparing and Testing Characters

public class Chapter4 {
    public  static void main(String[] args) {
       char c1 = 'a';
       char c2 = 'b';
        Question1(c1,c2 );// Quiz 4.3 Question 1 Using (char) for our variables
        Question2();// Quiz 4.3 Question 2 using Character variable and a static method (.isLowerCase())
    }
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
}
