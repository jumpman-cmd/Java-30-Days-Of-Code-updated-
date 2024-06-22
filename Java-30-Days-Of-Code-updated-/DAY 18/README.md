# Palindrome Checker

## Objective

This project checks if a given string is a palindrome using stack and queue data structures. A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward.

## Task

To determine if a given string is a palindrome:
1. Take each character in the string.
2. Enqueue the character in a queue.
3. Push the character onto a stack.
4. Dequeue the first character from the queue and pop the top character from the stack.
5. Compare the two characters to see if they are the same.
6. Continue until all characters are compared. If all characters match, the string is a palindrome.

### Input Format

The input is a single string composed of lowercase English letters.

### Output Format

The output is a statement indicating whether the input string is a palindrome.

### Example

#### Sample Input
racecar

#### Sample Output
The word, racecar, is a palindrome.
