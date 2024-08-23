import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference
{
    private int[] elements;
    public int maximumDifference;
    
    public Difference(int[] array)
    {
        this.elements = array;
    }
    
    public void computeDifference()
    {
        int max = elements[0];
        int min = elements[0];
        
        for(int i = 0; i < elements.length; i++)
        {
            if(max > elements[i])
            {
                max = elements[i];
            }
            
            if(min < elements[i])
            {
                min = elements[i];
            }
            
            maximumDifference = Math.abs(max - min);
        }        
    }
}

public class Solution
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) 
        {
            array[i] = scan.nextInt();
        }
        scan.close();

        Difference difference = new Difference(array);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
