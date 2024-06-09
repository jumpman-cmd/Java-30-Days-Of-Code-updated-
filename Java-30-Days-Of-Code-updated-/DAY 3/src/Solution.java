import java.util.Scanner;

public class Solution
{
    /**
     * If n is odd, print Weird
     * If n is even and in the inclusive range of 2 to 5, print Not Weird
     * If n is even and in the inclusive range of 6 to 20, print Weird
     * If n is even and greater than 20, print Not Weird
     */

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 2 != 0)
        {
            System.out.println("Weird");
        }

        else if (n % 2 == 0 && (n >= 2 && n <= 5))
        {
            System.out.println("Not Weird");
        }

        else if (n % 2 == 0 && (n >= 6 && n <= 20))
        {
            System.out.println("Weird");
        }

        else
        {
            System.out.println("Not Weird");
        }
    }
}
