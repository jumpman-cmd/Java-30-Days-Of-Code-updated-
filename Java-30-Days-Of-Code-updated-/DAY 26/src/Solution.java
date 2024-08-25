import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // Library Book(s) declaration
        
        Scanner scan = new Scanner(System.in);
        int actuallyReturnDay = scan.nextInt();
        int actuallyReturnMonth = scan.nextInt();
        int actuallyReturnYear = scan.nextInt();
        int expectedReturnDay = scan.nextInt();
        int expectedReturnMonth = scan.nextInt();
        int expectedReturnYear = scan.nextInt();
        
        int fine = 0;
        
        if(actuallyReturnYear > expectedReturnYear)
        {
            fine = 10000;
        }
        
        else if(actuallyReturnYear == expectedReturnYear && actuallyReturnMonth > expectedReturnMonth)
        {
            fine = 500 * (actuallyReturnMonth - expectedReturnMonth);
        }
        
        else if(actuallyReturnYear == expectedReturnYear && actuallyReturnMonth == expectedReturnMonth && actuallyReturnDay > expectedReturnDay)
        {
            fine = 15 * (actuallyReturnDay - expectedReturnDay);
        }
        
        System.out.println(fine);
    }
}
