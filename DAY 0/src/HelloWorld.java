import java.io.*;
import java.util.*;

public class HelloWorld
{

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        Scanner scan = new Scanner(System.in); // Created a Scanner object
        String inputString = scan.nextLine(); // Read User Input

        System.out.println("Hello, World.\n" + inputString); // Output User Input


    }
}