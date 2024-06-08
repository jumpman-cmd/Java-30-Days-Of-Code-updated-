# Day 4 Challenge: Class vs. Instance

## Problem Explanation

In this challenge, you are required to create a `Person` class with the following properties and methods:
- An instance variable `age`.
- A constructor that takes an integer `initialAge` as a parameter.
  - The constructor assigns `initialAge` to `age` after confirming that the argument is not negative.
  - If a negative argument is passed, the constructor sets `age` to 0 and prints "Age is not valid, setting age to 0.".
- A method `yearPasses()` that increases the `age` instance variable by 1.
- A method `amIOld()` that prints the age category:
  - If `age < 13`, print "You are young.".
  - If `13 <= age < 18`, print "You are a teenager.".
  - Otherwise, print "You are old.".

### Input Format

Input is handled by the provided code stub in the editor. The first line contains an integer, `T` (the number of test cases), and the subsequent `T` lines each contain an integer denoting the `age` of a `Person` instance.

### Constraints

- `1 <= T <= 4`
- `-5 <= age <= 30`

### Output Format

Complete the method definitions so they meet the specifications outlined above. The code to test your work is already provided in the editor.

## Example

### Sample Input
4
-1
10
16
18

### Sample Output
Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.

### Explanation

**Test Case 0:**  
- `initialAge` is -1, so the constructor sets `age` to 0 and prints "Age is not valid, setting age to 0.".
- The `amIOld()` method prints "You are young.".
- After three years pass, the `amIOld()` method still prints "You are young.".

**Test Case 1:**  
- `initialAge` is 10, so the constructor sets `age` to 10.
- The `amIOld()` method prints "You are young.".
- After three years pass, the `amIOld()` method prints "You are a teenager.".

**Test Case 2:**  
- `initialAge` is 16, so the constructor sets `age` to 16.
- The `amIOld()` method prints "You are a teenager.".
- After three years pass, the `amIOld()` method prints "You are old.".

**Test Case 3:**  
- `initialAge` is 18, so the constructor sets `age` to 18.
- The `amIOld()` method prints "You are old.".
- After three years pass, the `amIOld()` method still prints "You are old.".
