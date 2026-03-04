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
        Question8();//Quiz 4.4.3 Learn to concatenate strings.
        Question9();//Quiz 4.4.4 Learn to compare strings.
        Question10();//Quiz 4.4.4 Learn to compare strings.
        Question11();//Quiz 4.4.4 Learn to compare strings.
        Question12();//Quiz 4.4.4 Learn to compare strings.
        Question13();//Quiz 4.4.8 Learn to get substrings.
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
          String message = "Hello World!";
        String formattedMessage = message.length() + " " + message;
    }
    //Quiz 4.4.3 Question2
    /*Goal: Learn to concatenate strings.

    Assignment: In a web development tool for managing links, users can add various URLs to their project, which might
    include both secure (https) and non-secure (http) sites. To streamline the process, the tool automatically formats
    URLs based on the site's security level, adding the appropriate protocol prefix and a resource path specified by the user.

    Given String variables siteAddress and resourcePath, and a boolean variable isSecure, write a String expression that
    constructs a full URL. If isSecure is true, the expression should concatenate "https://", siteAddress, and resourcePath
    (e.g., "home"). If isSecure is false, it should concatenate "http://", siteAddress, and resourcePath. Ensure the
    resourcePath starts with a "/". Declare a String variable url and assign it the constructed URL.

    For example, if siteAddress is "www.example.com", resourcePath is "contact", and isSecure is false, the expression's
    value would be "http://www.example.com/contact". If siteAddress is "www.sample.com", resourcePath is "/info", and
    isSecure is true, the expression’s value would be "https://www.sample.com/info".
     */
    public static void Question8(){
            String siteAddress = "www.example.com";
            String resourcePath = "contact";
            boolean isSecure = false;

            String protocol = isSecure == true ? "https://" : "http://";

            String path = resourcePath.startsWith("/") ? resourcePath : "/" + resourcePath;
            String url = protocol + siteAddress + path;

            System.out.println(url);
    }
    //Quiz 4.4.4 Question1
    /*Goal: Learn to compare strings.
    Assignment: In a command-line tool for managing tasks, users can enter various commands.
    The tool needs to recognize when a user wants to exit the application, check for command updates, or start a new task based on the input.
    Given a String variable userCommand, and a boolean variable isCommand, write a statement that assigns to the latter
    true if userCommand equals "exit", "update", or "start".
     */
    public static void Question9(){
        Scanner command = new Scanner(System.in);
        System.out.println("What is the users command: ");
        String userCommand = command.nextLine();
        boolean isCommand;
        isCommand = userCommand.equals("exit") || userCommand.equals("update") || userCommand.equals("start");
        System.out.println(isCommand);
    }
    //Quiz 4.4.4 Question2
    /*Goal: Learn to compare strings.
    Assignment: In library management software, one of the main features is a system that helps employees re-order bookshelves.
    You are tasked with writing the code that informs them whether a title comes before or after another or if the titles are the same.

    Assuming the String variables previousTitle and title have already been declared and assigned, write a code snippet
    that prints out whether title comes lexicographically before, after or is the same as previousTitle ignoring case.

    Sample Runs

    "The Viper and the Mouse" comes after "A Dissertation over Nature"
    "Apricots: All the Ways to Cook Them" comes before "Lutward, and the Room of Empty Boxes"
    "Thunderbolts and Pad Thais" is equal to "Thunderbolts and Pad Thais"
     */
    public static void  Question10(){
        Scanner bookInput = new Scanner(System.in);
        System.out.println("What was this books title? ");
        String previousTitle = bookInput.nextLine();

        System.out.println("What is this current books title? ");
        String title = bookInput.nextLine();
        int comparison = title.compareToIgnoreCase(previousTitle);

        if (comparison < 0){
            System.out.println("\"" + title + "\" comes before \"" + previousTitle + "\"" );
        } else if (comparison > 0) {
            System.out.println("\"" + title + "\" comes after \"" + previousTitle + "\"" );
        }else {
            System.out.println("\"" + title + "\" is equal to \"" + previousTitle + "\"");
        }
    }
    //Quiz 4.4.4 Question3
    /*Goal: Learn to compare strings.

    Assignment: In a music streaming service application, musicians can upload their tracks manually.
    However, to make sure the uploaded content is not malicious, you need to check that the source is trustworthy.

    Given a String variable url, write some code that assigns to the already declared boolean variable isSecure,
    whether the URL starts with https. Make sure it also works if the URL is uppercase or has uppercase letters.
     */
    public static void Question11() {
        Scanner urlInput = new Scanner(System.in);
        System.out.println("Please enter the url: ");
        String url = urlInput.nextLine();
        boolean isSecure;
        isSecure = url.toLowerCase().startsWith("https");
    }
    //Quiz 4.4.4 Question4
    /*Goal: Learn to compare strings.

    Assignment: TechGiant Electronics is issuing a safety notice for certain models of its portable chargers,
    specifically the ‘PowerPack’ model from 2015 to 2018 and the ‘EnergyBar’ model from 2016 to 2019, due to potential overheating issues.

    Write a program that reads the model name and the year of production and displays appropriate messages as shown in
    the sample run. Model names are not case-sensitive. Your class name should be Answer.

    Sample Run 1

    Enter the model name: PowerPack 
    Enter the production year: 2017 
    2017 PowerPack has potential overheating issues
    Sample Run 2

    Enter the model name: PowerPack 
    Enter the production year: 2014 
    2014 PowrPack has no issues
    Sample Run 3

    Enter the model name: energybar
     Enter the production year: 2017 
    2017 energybar has potential overheating issues
    Sample Run 4

    Enter the model name: energybar
     Enter the production year: 2020 
    2020 energybar has no issues
     */
    public static void Question12(){
        Scanner productInput = new Scanner(System.in);
        System.out.println("What is the models name: ");
        String model = productInput.nextLine();

        System.out.println("What is the production year: ");
        int year = productInput.nextInt();

        boolean hasIssues = false;

        if (model.equalsIgnoreCase("PowerPack") && year >= 2015 &&  year <= 2018) {
            hasIssues = true;
        } else if (model.equalsIgnoreCase("EnergyBar") && year >=2017 &&  year <= 2019) {
            hasIssues = true;
        }
        if (hasIssues) {
            System.out.println(year + " " + model + " has potential overheating issues");
        }else {
            System.out.println(year + " " + model + " has no issues");
        }
    }
    //Quiz 4.4.8 Question1
    /*Goal: Learn to get substrings.
    Assignment: In a system designed for a digital library archive, each document is tagged with a unique identifier.
    The identifier is split into three parts, each separated by a : character. The middle code represents the type of the document.
    The three parts are always three characters long each. The resulting document id is always 11 characters long.

    Given a String variable documentId, declare the String variable typeId, and initialize it to the middle part of the document id.

    For example, if documentId were ABC:123:XYZ, then typeId would be 123.
     */
    public static void Question13() {
        String documentId = "ABC:123:XYZ";
        String typeID = documentId.substring(4,7);
        System.out.println(typeID);
    }

}
