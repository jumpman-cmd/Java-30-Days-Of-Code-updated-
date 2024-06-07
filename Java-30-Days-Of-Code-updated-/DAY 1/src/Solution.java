import java.util.Scanner; // Import the Scanner class.

public class Solution
{

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       int i = 4;
       double d = 4.0;
       String s = "HackerRank ";

       Scanner myObj = new Scanner(System.in); // Created a Scanner object.
       // System.out.println("Enter a whole number, enter a one decimal number and enter few words:");

       // Numerical input
        int wholeNumber = myObj.nextInt();
        double decimalNumber = myObj.nextDouble();
        myObj.nextLine();

        // String input
        String nameOrFewWords = myObj.nextLine();
        myObj.close();

        // Output input by user
        System.out.println(i + wholeNumber);
        System.out.println(d + decimalNumber);
        System.out.println(s + nameOrFewWords);
    }
}