import java.util.Scanner;

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

        int wholeNumber = myObj.nextInt();
        double decimalNumber = myObj.nextDouble();
        myObj.nextLine();

        String nameOrFewWords = myObj.nextLine();
        myObj.close();
        
        System.out.println(i + wholeNumber);
        System.out.println(d + decimalNumber);
        System.out.println(s + nameOrFewWords);
    }
}
