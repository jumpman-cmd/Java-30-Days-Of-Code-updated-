import java.util.Scanner;

abstract class Book
{
    String title;
    String author;
    int price;
    
    abstract void display();
}

class MyBook extends Book
{
    MyBook(String title, String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void display()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Solution2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        String author = scan.nextLine();
        int price = scan.nextInt();
        
        MyBook object1 = new MyBook(title, author, price);
        object1.display();   
    }
}
