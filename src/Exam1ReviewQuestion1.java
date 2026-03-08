//Review questions from last semester's Exam 1.

/* 1)
Write the Java code for a public and static method named FirstAtOrOver that:

    - Accepts an array of integers called Values and an integer named Threshold

    - Returns the first index whose element is greater than or equal to the Threshold

    - Returns -1 if all elements in Values are less than the Threshold
*/

public class Exam1ReviewQuestion1 {
    int [] Values = {2,4,5,6,8};
    int Threshold = 5;

    public static int FirstAtOrOver(int[] Values, int Threshold) {
        for (int i = 0; i < Values.length; i++){
            if(Values[i] >= Threshold) {
                return i;
            }
        }
        return -1;
    }
}