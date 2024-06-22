import java.io.*;
import java.util.*;

public class Solution
{
    // Stack and Queue instance variables
    private Stack<Character> stack;
    private Queue<Character> queue;

    // Constructor
    public Solution()
    {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    // Method to push character onto stack
    public void pushCharacter(char ch)
    {
        stack.push(ch);
    }

    // Method to enqueue character in queue
    public void enqueueCharacter(char ch)
    {
        queue.add(ch);
    }

    // Method to pop character from stack
    public char popCharacter()
    {
        return stack.pop();
    }

    // Method to dequeue character from queue
    public char dequeueCharacter()
    {
        return queue.remove();
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Create Solution object
        Solution p = new Solution();

        // Enqueue and push all characters of the input string
        for (char c : input.toCharArray())
        {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Check if the input string is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < input.length(); i++)
        {
            if (p.popCharacter() != p.dequeueCharacter())
            {
                isPalindrome = false;
                break;
            }
        }

        // Print the result
        System.out.println("The word, " + input + ", is "
                + (isPalindrome ? "a palindrome." : "not a palindrome."));
    }
}