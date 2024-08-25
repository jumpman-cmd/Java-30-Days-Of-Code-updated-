// Running Time and Complexity

import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        while(T-- > 0)
        {
            int n = scan.nextInt();
            if(n == 1 || n < 1)
            {
                System.out.println("Not prime");
            }
            
            else
            {
                boolean prime = true;
                for(int i = 2; i * i <= n; i++)
                {
                    if(n % i == 0)
                    {
                        prime = false;
                        break;
                    }
                }
                
                if(prime)
                {
                    System.out.println("Prime");
                }
                
                else
                {
                    System.out.println("Not prime");
                }
            }
        }
    }
}
