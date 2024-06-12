import java.util.*;
import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, String> phoneBook = new HashMap<>();



        for (int i = 0; i < n; i++)
        {
            String name = in.next();
            String phone = in.next();
            phoneBook.put(name, phone);
        }



        while (in.hasNext())
        {
            String query = in.next();
            if (phoneBook.containsKey(query))
            {
                System.out.println(query + "=" + phoneBook.get(query));
            }

            else
            {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}