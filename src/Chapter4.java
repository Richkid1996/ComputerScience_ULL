//Chapter 4:Mathmatical Functions, Characters, and strings
//Quiz 4.3.4:Comparing and Testing Characters

public class Chapter4 {
    public  static void main(String[] args) {
       char c1 = 'A';
       char c2 = 'B';
        Question1();// Quiz 4.3 Question 1
    }
    /*Goal: Familiarize with the operations of characters.
    Assignment: You are developing your first messaging app. As part of an effort top make communications more secure,
    you decide to encrypt your messages using a string of characters of the same length, that both the sender and receiver
    possess. You are tasked with writing the Code that will decipher the message.
    Assume two char variables c1 and c2 have been declared and assigned a value. Write a code snippet that prints out the
    character associated with the sum of the integer values of c1 and c2.
     */
    public static void Question1() {

        //We sum the values, then cast the total back to a (char)
        System.out.println((char)(c1+c2));

    }
}
