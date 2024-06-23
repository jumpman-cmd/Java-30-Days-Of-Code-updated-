import java.util.Scanner;

abstract class Book // YG bafethu
{
    String title;
    String author;
    int price;
    
    Book (String title, String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    abstract void display ();
}

class MyBook extends Book
{
    MyBook (String title, String author, int price)
    {
        super(title, author, price);
    }
    
    void display ()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        String author = scan.nextLine();
        Integer price = scan.nextInt();
        
        /** title = "The Alchemist";
        author = "Paulo Coelho";
        price = 248; **/
        
        Book b = new MyBook (title, author, price);
        b.display();
        scan.close();
    }
}
