import java.util.*;
import java.io.*;

class NegativeInputException extends Exception
{
    public NegativeInputException(String message)
    {
        super(message);
    }
}

class Calculator
{
    double n, p;

    // I was getting an error here, it took me 3 hours to finally-luckily realise it.
    // I was writing this constructor as: public Calculator(double n, double p) - error!
    public Calculator() 
    {
        this.n = n;
        this.p = p;
    }
    
    public static double power(double n, double p) throws NegativeInputException
    {
        if(n < 0 || p < 0)
        {
            throw new NegativeInputException("n and p should be non-negative");
        }
        double ans = Math.pow(n, p);
        return ans;
    }
}

class Solution
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t-- > 0) 
        {
            double n = in.nextInt();
            double p = in.nextInt();
            
            Calculator myCalculator = new Calculator();
            try 
            {
                double ans = myCalculator.power(n, p);
                System.out.println((int) ans);
            }
            
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
