# Bitwise AND Maximum Value

## Task

Given set \( S = \{1, 2, 3, \ldots, N\} \). Find two integers, \( a \) and \( b \) (where \( 1 \leq a < b \leq N \)), from set \( S \) such that the value of \( a \& b \) is the maximum possible and also less than a given integer \( K \). In this case, \( \& \) represents the bitwise AND operator.

## Function Description

Complete the `bitwiseAnd` function in the editor below.

`bitwiseAnd` has the following parameter(s):
- `int N`: the maximum integer to consider
- `int K`: the limit of the result, inclusive

Returns:
- `int`: the maximum value of \( a \& b \) within the limit.

## Input Format

- The first line contains an integer `T`, the number of test cases.
- Each of the `T` subsequent lines defines a test case as two space-separated integers, `N` and `K`, respectively.

## Constraints

- \( 1 \leq T \leq 10^3 \)
- \( 2 \leq N \leq 10^3 \)
- \( 2 \leq K \leq N \)

## Output Format

For each test case, print the maximum value of \( a \& b \) that is less than `K`.

## Sample Input
3
5 2
8 5
2 2

## Sample Output
1
4
0

## Explanation

For each test case, compute the bitwise AND for all pairs \( (a, b) \) where \( 1 \leq a < b \leq N \) and find the maximum value that is less than `K`.
