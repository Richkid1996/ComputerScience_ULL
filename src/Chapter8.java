public class Chapter8 {
    public static void main(String[] args) {
        System.out.println("------Running Chapter 8 practice ");

        Question1();// Quiz 8.2.1 Learn to declare 2D arrays.
        Question2();// Quiz 8.2.1 Learn to declare 2D arrays.
        Question3();// Quiz 8.2.1 Learn to declare and initialize 2D arrays.
        Question4();// Quiz 8.2.1 Learn to declare and initialize 2D arrays.
        Question5();// Quiz 8.2.2 Learn to get the length of matrix rows.
        Question6();// Quiz 8.2.2 Learn to get matrix length.
        Question7();// Quiz 8.2.2 Learn to get matrix length.
        Question8();// Quiz 8.2.2 Learn to get the number of items in a matrix.
        Question9();// Quiz 8.2.3 Learn to access matrix elements.
        Question10();// Quiz 8.3 Learn to iterate over matrices.
        Question11();//Quiz 8.3 Learn to iterate over matrices.
        Question13();//Qui 8.3 Learn to iterate over matrices.
        Question14();//Quiz 8.8 Learn to declare multi-dimensional arrays.

    }
    //Quiz 8.2.1 Question 1
    /*Goal: Learn to declare 2D arrays.

    Assignment: In a digital pet care app, users can track the feeding and exercise schedules of their pets over a week.
    Declare a two-dimensional array of int named petSchedule to store the number of feedings and exercise sessions for each pet across seven days of the week.
     */
    public static void Question1() {
        int [][] petSchedule = new [2][7];

    }
    //Quiz 8.2.1 Question 2
    /*Goal: Learn to declare 2D arrays.

    Assignment: In a classroom app for geography quizzes, you need to store questions and answers in a structured format for easy access during the quiz.
    Declare a two-dimensional array of String named quizQA to store questions and their corresponding answers for a geography quiz.
     */
    public static void Question2() {
        String [][] quizQA = new String[2][10] ;
    }
    //Quiz 8.2.1 Question 3
    /*Goal: Learn to declare and initialize 2D arrays.

    Assignment: Imagine you're tasked with storing data about beehives, specifically the number of bees in each hive and
    the corresponding honey production. You'll need to create a 2D array to organize and manage this data efficiently.
    In a single statement, declare and create a two-dimensional array of int, named hiveData, with 2 rows, each with 3 elements, and initialize it so that:
    the first hive produces 15kg of honey and contains 3000 bees
    the second hive produces 25kgs of honey and contains 5000 bees
    the third hive produces 40kgs of honey and contains 8000 bees
    The first row of your array will hold the honey weight values in kilograms, and the second row will hold the number of bees per hive.
    Do not use new int[]{...} for the inner initialization.
     */
    public static void Question3() {
        int [][] hiveData = {
                {15, 25, 40,},
                {3000, 5000, 8000},
        };
    }
    //Quiz 8.2.1 Question 4
    /*Goal: Learn to declare and initialize 2D arrays.

    Assignment: A teacher creates a digital seating chart for students in a classroom setting. Each seat is represented
    by a character: 'E' for empty and 'S' for student.
    In a single statement, declare and create a two-dimensional array of char, named seatingChart, with 4 rows, each with
    4 elements, and initialize it to all 'E' characters to represent an initially empty classroom.
    Do not use new String[]{...} for the inner initialization.
     */
    public static void Question4(){
        char [][] seatingChart = {
                {'E','E','E','E',},
                {'E','E','E','E',},
                {'E','E','E','E',},
        };
    }
    //Quiz 8.2.2 Question 1
    /*Goal: Learn to get the length of matrix rows.

    Assignment: In a digital art gallery, artworks are displayed on screens arranged in rows, with each row potentially
    holding a different number of artworks due to varying screen sizes.
    A two-dimensional array of String represents the artworks displayed on each row of screens in the gallery and is
    assigned to galleryDisplays. Write an expression whose value is the number of artworks on the last row of screens.
    (Assume the gallery is not empty, and each row can display a different number of artworks.)

     */
    public static void Question5(){
        String [][] galleryDisplays = {
                {"3", "5", "6", "8",}
        };

       int lastRow = galleryDisplays[galleryDisplays.length -1].length;
       System.out.println(lastRow);

    }
    //Quiz 8.2.2 Question 2
    /*Goal: Learn to get the length of matrix rows.

    Assignment: In a classroom seating arrangement app, seats are organized in rows and columns for different classroom layouts.

    A two-dimensional array of boolean represents the number of seats available in each row of a classroom and is assigned
    to classroomSeats. Each element is true if that seat is currently occupied. Write an expression whose value is the number
    of seats in the first row. (Assume the classroom layout is not empty, and each row could have a different number of seats.)
     */
    public static void Question6(){
        boolean [][] classroomSeats = {
                {true, true, true, true,},
                {false, true, false, true,},
                {true, true, false, false},
                {true, false, true, false,},
        };
        System.out.println(classroomSeats[0].length);
    }
    //Quiz 8.2.2 Question 3
    /*Goal: Learn to get matrix length.

    Assignment: In a digital ledger for a small business, transactions are recorded daily over four weeks, with each week
    represented as a row in a two-dimensional array named monthlyTransactions.
    Write an expression whose value is the total number of transaction records that are stored in the entire array.
     */
    public static void Question7(){
            int[][] monthlyTransactions = new int[4][7];

            int total = monthlyTransactions.length * monthlyTransactions[0].length;
            System.out.println("Total transactions: " + total); // prints 28
        }
    //Quiz 8.2.2 Question 4
    /*Goal: Learn to get the number of items in a matrix.

    Assignment: In a strategy game, the game map is divided into territories, each represented as rows in a two-dimensional
    array, where each row contains details about the territory's resources.

    A two-dimensional array of int represents the game map's territories and their resources, assigned to gameMap.
    Write an expression whose value is the number of territories (rows) in this game map.
     */
    public static void Question8() {
        int [][] gameMap = new int [5][6];
    System.out.println(gameMap.length);
    }
    //Quiz 8.2.3 Question 3
    /*Goal: Learn to access matrix elements.

    Assignment: In a climate monitoring system, temperatures are recorded over three days at three different times of the day,
    creating a grid of temperature readings.
    A 2-dimensional 3x3 array of ints represents the temperature readings assigned to temperatureGrid. Declare a boolean
    variable result and write an expression whose value is true if the temperatures of the first day (first row) are all equal,
    indicating consistent weather conditions. Assign the value of the expression to result.
     */
    public static void Question9(){
        int [][] temperatureGrid = {
                {3,3,3,},
                {4,4,4,},
                {5,5,5,},
        };
        boolean result = (temperatureGrid[0][0] == temperatureGrid[0][1]) && (temperatureGrid[0][0] == temperatureGrid[0][2] );
        System.out.println(result);
    }
    //Quiz 8.3 Question 1
    /*Goal: Learn to iterate over matrices.

    Assignment: Given a square matrix arr, holding int values, write a code snippet that calculates the sums of the elements
    on each diagonal, and adds them together in a variable totalSum.
     */
    public static void Question10() {
        int [][] arr = {
                {2,3,4,5,6,},
                {1,4,5,7,3,},
                {3,4,5,6,7,},
        };

        int totalSum = 0;

        for (int i = 0; i < arr.length; i ++){
            totalSum += arr[i][i];
        }

        for (int i = 0; i < arr.length; i ++){
            totalSum += arr[i][arr.length - 1 - i];
        }

        System.out.println(totalSum);
    }
    //Quiz 8.3 Question 2
    /*Goal: Learn to iterate over matrices.

    Assignment: Given a two-dimensional array sessionAttendees holding int values, write a code snippet that declares a
    boolean variable named uniformSessions and checks whether sessionAttendees is a uniform array or a ragged array.
    If it is a ragged array set uniformSessions to false, otherwise set it to true. A two-dimensional array is uniformed if the rows have the same length.
     */
    public static void Question11() {
        int [][] sessionAttendees = {
                {2,3,4,4,},
                {2,3,4,},
                {4,5,9,8,},
        };
        boolean uniformSessions = true;

        for (int i = 1; i < sessionAttendees.length; i++){
            if (sessionAttendees[i].length != sessionAttendees[0].length) {
                uniformSessions = false;
                break;
            }
        }
        System.out.println(uniformSessions);
    }

    //Quiz 8.3 Question 4
    /*Goal: Learn to iterate over matrices.

    Assignment: Given a 2D array arr holding int values already declared and initialized, write a code snippet to find
    the biggest element in arr. You will store it in the variable maxElement, as well as its position in maxRow and maxCol.
    You need to declare these three variables in your code.
     */
    public static void Question12() {
        int maxElement = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        int [][] arr = {
                {6,5,6,8,8,},
                {8,9,10,45,55,},
                {10,12,14,34,40,},
        };

        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr.length; j ++){
                if (arr[i][j] >= maxElement){
                    maxElement = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
    }

    //Quiz 8.3 Question 5
    /*Goal: Learn to iterate over matrices.

    Assignment: Assume a matrix arr, holding int values. Write a code snippet that computes the transpose of arr and stores it in the variable transposedArr.
    Note: Transposing a matrix is the process by which each element swaps its column and row subscripts. For example, after the matrix
    is transposed, it becomes
     */
    public static void Question13() {
        int [][] arr = {
                {1,2,3,},
                {4,5,6,},
                {7,8,9,},
        };
        int rows = arr.length;;
        int cols = arr[0].length;

        int [][] transposedArr = new int[rows][cols];
        for (int i = 0;i  < rows; i ++){
            for(int j = 0; j < cols; j ++){
                transposedArr[j][i] = arr[i][j];
            }
        }
        System.out.println(transposedArr);
    }
    // Quiz 8.8 Question 1
    /*Goal: Learn to declare multi-dimensional arrays.

    Assignment: To assist a national park in monitoring wildlife movements, a system is needed to track the number of specific
    animal sightings per hour, per day, per month, and per year across various regions within the park.
    Declare a multidimensional array of int, wildlifeSightings, that can store the number of sightings of a particular
    species observed during a specific hour, on a specific day, in a specific month, and in a specific year.
     */

    public static void Question14(){
    int [][][][] wildlifeSightings = new int  [10][12][31][24];

    System.out.println(wildlifeSightings);
    }
}
