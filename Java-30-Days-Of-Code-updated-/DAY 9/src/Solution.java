import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(factorial(n));
    }

    public static int factorial(int n)
    {
        if (n <= 1)
        {
            return 1;
        }

        else
        {
            return n * factorial(n - 1);
        }
    }
}