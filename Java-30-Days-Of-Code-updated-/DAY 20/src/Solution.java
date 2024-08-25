// Some of the code was already written in the stdin, but still I had to edit it
// to make this program work. The comments from line 21 - 34 were already written for me.

import java.util.Scanner;

public class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); // T - number of Times
        int[] a = new int[T];
        for(int a_i = 0; a_i < T; a_i++)
        {
            a[a_i] = scan.nextInt();
        }
        
        int numberOfSwaps = 0;
        for (int i = 0; i < T; i++) 
        {
            // Track number of elements swapped during a single array traversal
            for (int j = 0; j < T - 1; j++) 
            {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) 
                {
                    int aElements = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aElements;
                    numberOfSwaps++;
                }
            }
            
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) 
            {
                break;
            }
        }
        
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[T - 1]);
    }
}
