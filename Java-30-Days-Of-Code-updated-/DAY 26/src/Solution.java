import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int expectedReturnDay = sc.nextInt();
        int expectedReturnMonth = sc.nextInt();
        int expectedReturnYear = sc.nextInt();
        
        int actualReturnDay = sc.nextInt();
        int actualReturnMonth = sc.nextInt();
        int actualReturnYear = sc.nextInt();
        
        if(expectedReturnYear > actualReturnYear)
        {
            int fine = 10000;
            System.out.println(fine);
        }
        
        else if(expectedReturnMonth > actualReturnMonth && expectedReturnYear == actualReturnYear)
        {
            int fine = 500 * (expectedReturnMonth - actualReturnMonth);
            
            if(fine < 0)
            {
                fine = fine * -1;
            }
            
            System.out.println(fine);
        }
        
        else if(expectedReturnDay > actualReturnDay && expectedReturnMonth == actualReturnMonth && expectedReturnYear == actualReturnYear)
        {
            int fine = 15 * (expectedReturnDay - actualReturnDay);
            
            if(fine < 0)
            {
                fine = fine * -1;
            }
            
            System.out.println(fine);
        }
        
        else
        {
            int fine = 0;
            System.out.println(fine);
        }
        sc.close();
    }
}
