# Day 3 Challenge: Conditional Statements

## Problem Explanation

Given an integer `n`, perform the following conditional actions:
- If `n` is odd, print "Weird".
- If `n` is even and in the inclusive range of 2 to 5, print "Not Weird".
- If `n` is even and in the inclusive range of 6 to 20, print "Weird".
- If `n` is even and greater than 20, print "Not Weird".

### Input Format

A single line containing a positive integer `n`.

### Constraints

- `1 <= n <= 100`

### Output Format

Print "Weird" if the number is weird; otherwise, print "Not Weird".

## Example

### Sample Input 0
3

### Sample Output 0
Weird

### Sample Input 1
24

### Sample Output 1
Not Weird

### Program Explanation

**Sample Case 0:**
- `n` is odd and odd numbers are weird, so we print "Weird".

**Sample Case 1:**
- `n` is 24, and 24 is even, so it is not weird. Thus, we print "Not Weird".

## Steps to Solve the Problem

1. **Read Input Value:**
   - Read the integer `n` from the input.

2. **Check Conditions:**
   - If `n` is odd, print "Weird".
   - If `n` is even and in the inclusive range of 2 to 5, print "Not Weird".
   - If `n` is even and in the inclusive range of 6 to 20, print "Weird".
   - If `n` is even and greater than 20, print "Not Weird".

The code implementation for this program ensures that the function correctly evaluates the conditions to determine if the number n is "Weird" or "Not Weird" based on the specified rules.
