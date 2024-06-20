import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        try
        {
            int number = Integer.parseInt(input);
            System.out.println(number);
        }

        catch (NumberFormatException e)
        {
            System.out.println("Bad String");
        }
    }
}