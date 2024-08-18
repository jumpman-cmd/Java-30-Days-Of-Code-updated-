import java.awt.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int anyNumber = scan.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(anyNumber + " x " + i + " = " + anyNumber * i);
        }
        scan.close();
    }
}
