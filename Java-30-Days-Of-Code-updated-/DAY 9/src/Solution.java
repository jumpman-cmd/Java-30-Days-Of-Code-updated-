import java.util.Scanner;

public class Solution
{
    public static int Factorial(int n)
    {
        // Base Case
        if (n <= 1) // multi identity
        {
            return 1;
        }

        // Recursive Case
        else
        {
            return n * Factorial (n - 1);
        }
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Factorial(n));
    }
}
