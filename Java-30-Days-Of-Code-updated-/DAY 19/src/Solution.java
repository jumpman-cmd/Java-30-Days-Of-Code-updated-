// Most of the code was written for me in the stdin.

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic 
{
    public int divisorSum(int n) 
    {
        int divisorsSum = 0;
        for(int i = 1; i <= n; i++) // I was getting an error here, my code was int i = 0, instead of 1, cos n / 0 = error.
        {
            if(n % i == 0)
            {
                divisorsSum = divisorsSum + i;
            }
        }
    
        return divisorsSum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
