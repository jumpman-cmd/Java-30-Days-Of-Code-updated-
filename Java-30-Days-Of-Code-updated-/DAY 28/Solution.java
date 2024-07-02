import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        List<String> names = new ArrayList<>();
        
        for (int i = 0; i < n; i++) 
        {
            String firstName = scanner.next();
            String emailID = scanner.next();
            if (emailID.endsWith("@gmail.com")) 
            {
                names.add(firstName);
            }
        }
        
        Collections.sort(names);
        
        for (String name : names) 
        {
            System.out.println(name);
        }
        
        scanner.close();
    }
}