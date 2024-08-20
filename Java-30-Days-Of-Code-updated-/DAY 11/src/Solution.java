// Here I thought we were supposed to write 16 array loops to manually traverse.
// But then I realised we don't know what the user will input into the scanner.
// On real, practice makes perfect.
import java.util.Scanner;

public class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[][] A = new int[6][6];
        int currentHourglassSum = 0;
        int maxHourglassSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                A[i][j] = scan.nextInt();
            }
        }
        maxHourglassSum = Integer.MIN_VALUE;
        
        //  Traverse possible hourglass Sum
        for (int i = 0; i <= 3; i++)
        {
            for (int j = 0; j <= 3; j++)
            {
                currentHourglassSum = A[i][j] + A[i][j + 1] + A[i][j + 2]
                + A[i + 1][j + 1]
                + A[i + 2][j] + A[i + 2][j + 1] + A[i + 2][j + 2];
                
                // update the max hour glass sum
                if (currentHourglassSum > maxHourglassSum)
                {
                    maxHourglassSum = currentHourglassSum;
                }
            }
        }
        
        System.out.println(maxHourglassSum);
        
        scan.close();
    }
}
