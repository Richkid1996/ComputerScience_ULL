import java.util.Scanner;
/*(Vowel or consonant?)

Write a program that prompts the user to enter a letter and checks whether the letter is a vowel or consonant.
For a non letter input, display "invalid input".

Sample Run 1

Enter a letter: B
B is a consonant
Sample Run 2

Enter a letter: a
a is a vowel
Sample Run 3

Enter a letter: #
# is an invalid input
 */
public class Chapter4ProgramingProject3 {
    public static void main(String[] args){
        Scanner letterInput = new Scanner(System.in);
        System.out.println("Please give me a letter: ");
        String letter = letterInput.nextLine();


        if (letter.length() !=1 ) {
            System.out.println("invalid input");
            return;
        }
        char character = letter.charAt(0);

        if (!Character.isLetter(character)) {
            System.out.println("# invalid input");
        }
        else {
            char lowerCharacter = Character.toLowerCase(character);

            if (lowerCharacter == 'a' || lowerCharacter == 'e' || lowerCharacter == 'i' || lowerCharacter == 'o' || lowerCharacter == 'u') {
                System.out.println(letter + " is a vowel");
            }else {
                System.out.println(letter + " is a consonant");
            }
        }

    }
}
