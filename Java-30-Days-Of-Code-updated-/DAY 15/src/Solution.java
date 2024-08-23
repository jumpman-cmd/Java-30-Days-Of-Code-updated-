import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int d) 
    {
        data = d;
        next = null;
    }
    
    public int getData()
    {
        return data;
    }
    
    public Node getNext()
    {
        return next;
    }
    
    public void setData(int newData)
    {
        this.data = newData;
    }
    
    public void setNext(Node newNode)
    {
        this.next = newNode;
    }
}

class Solution 
{
    Node head;
    
    public static Node insert(Node head, int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            return newNode;
        } 
        else 
        {
            Node current = head;
            while (current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(newNode);
            return head;
        }
    }

    public static void display(Node head) 
    {
        Node start = head;
        while(start != null) 
        {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) 
        {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
