// This problem took me some time to finally figure it out ewwh. Line 23!
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        int T = scan.nextInt();
        //scan.nextLine();
        for (int i = 0; i < T; i++)
        {
            String name = scan.next();
            String contact = scan.next();
            phoneBook.put(name, contact);
        }
        
        while (scan.hasNext())
        { // On the below line (23) I was writing...scan.nextLine() and not getting the desired results.
            String query = scan.next(); // But I finally figured it out, scan.next(); the correct code.
            if (phoneBook.containsKey(query))
            {
                System.out.println(query + "=" + phoneBook.get(query));
            }
            
            else
            {
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}
