# Day 16: Exceptions - String to Integer

## Objective

Today, its Exceptions, lets see how to parse an integer from a string and print a custom error message.

## Task

Read a string, `S`, and print its integer value; if `S` cannot be converted to an integer, print "Bad String".

Note: You must use the String-to-Integer and exception handling constructs built into your submission language. If you attempt to use loops/conditional statements, you will get a zero score.

## Input Format

A single string, `S`.

## Constraints

- `1 <= |S| <= 6`
- `S` is composed of either lowercase letters (`a-z`) or decimal digits (`0-9`).

## Output Format

Print the parsed integer value of `S`, or "Bad String" if `S` cannot be converted to an integer.

## Sample Input 0
3

## Sample Output 0
3

## Sample Input 1
za

## Sample Output 1
Bad String

## Explanation

### Sample Case 0

`S` contains an integer, so it should not raise an exception when we attempt to convert it to an integer. Thus, we print the integer value.

### Sample Case 1

`S` does not contain any integers, so an attempt to convert it to an integer will raise an exception. Thus, our exception handler prints "Bad String".
