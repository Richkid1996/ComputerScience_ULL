import java.util.Scanner;

//Chapter 3 Programming Project 3
/*Find the number of days in a month)

Write a program that prompts the user to enter the month and year and displays the number of days in the month.
For example, if the user entered month 2 and year 2012, the program should display:

February 2012 has 29 days
If the user entered month 3 and year 2015, the program should display:

March 2015 has 31 days
Sample Run 1

Enter a month in the year (e.g., 1 for Jan): 2
Enter a year: 2012
February 2012 has 29 days
Sample Run 2

Enter a month in the year (e.g., 1 for Jan): 4
Enter a year: 2005
April 2005 has 30 days
Sample Run 3

Enter a month in the year (e.g., 1 for Jan): 2
Enter a year: 2006
February 2006 has 28 days
Sample Run 4

Enter a month in the year (e.g., 1 for Jan): 2
Enter a year: 2000
February 2000 has 29 days

 */
public class Chapter3ProgrammingProject3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month in the year (e.g., 1 for Jan): ");
        int month = input.nextInt();

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1 -> System.out.println("January " + year + " has " + 31 + " days" );
            case 2 -> {
                boolean isLeapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                int days = isLeapyear ? 28 : 29;
                System.out.println("February " + year + " has " + days + " days");
            }
            case 3 -> System.out.println("March " + year + " has " + 31 + " days");
            case 4 -> System.out.println("April " + year + " has " + 30 + " days");
            case 5 -> System.out.println("May " + year + " has " + 31 + " days");
            case 6 -> System.out.println("June " + year + " has " + 30 + " days");
            case 7 -> System.out.println("July " + year + " has " + 31 + " days");
            case 8 -> System.out.println("August " + year + " has " + 31 + " days");
            case 9 -> System.out.println("September " + year + " has " + 30 +" days");
            case 10 -> System.out.println("October " + year + " has " + 31 + " days");
            case 11 -> System.out.println("November " + year + " has " + 30 + " days");
            case 12 -> System.out.println("December " + year + " has " + 31 + " days");
            default -> System.out.println("Invalid input for month try again");
        }
    }
}
