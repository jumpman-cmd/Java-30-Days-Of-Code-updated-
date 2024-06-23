# Day 19: Interfaces and Divisor Sum Calculation

## Objective
The goal of this project is to implement a class that computes the sum of all divisors of a given integer using interfaces in Java. This is part of a series of coding exercises to practice different concepts in Java.

## Task
The task involves the following steps:
1. Implement the `AdvancedArithmetic` interface which declares a method `int divisorSum(int n)`.
2. Implement the `Calculator` class that implements the `AdvancedArithmetic` interface.
3. In the `divisorSum(int n)` method, calculate the sum of all divisors of the integer `n`.

### Example
- The divisors of 6 are 1, 2, 3, and 6. Their sum is 12.
- The divisors of 12 are 1, 2, 3, 4, 6, and 12. Their sum is 28.

## Input Format
- A single integer `n` is provided as input.

## Constraints
- 1 ≤ n ≤ 1000

## Output Format
The output will be handled by the provided locked code in the editor:
- It will first print `I implemented: AdvancedArithmetic`.
- Then it will print the sum of the divisors of the integer `n`.

## Sample Input
6

## Sample Output
I implemented: AdvancedArithmetic
12

## Explanation
- For the integer `6`, the divisors are 1, 2, 3, and 6. The sum of these divisors is 12. Therefore, the `divisorSum` method should return 12, which is then printed by the `Solution` class.
