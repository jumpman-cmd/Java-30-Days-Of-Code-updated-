# Day 6 Challenge: Even and Odd Indexed Characters

## Problem Explanation

Given a string `S` of length `N` that is indexed from `0` to `N-1`, print its even-indexed and odd-indexed characters as space-separated strings on a single line.

### Example

For example, given the string "Hacker", the output should be:
Hce akr

### Input Format

The first line contains an integer `T` (the number of test cases).
Each of the `T` subsequent lines contains a string `S`.

### Constraints

- 1 <= T <= 10
- 2 <= length of S <= 10000

### Output Format

For each string `S` (where `0 <= i < T`), print `S`'s even-indexed characters, followed by a space, followed by `S`'s odd-indexed characters.

### Sample Input
2
Hacker
Rank

### Sample Output
Hce akr
Rn ak

### Explanation

**Test Case 0:**

- The even indices are 0, 2, and 4, and the odd indices are 1, 3, and 5.
- The first string contains the ordered characters from `S`'s even indices ("Hce"), and the second string contains the ordered characters from `S`'s odd indices ("akr").

**Test Case 1:**

- The even indices are 0 and 2, and the odd indices are 1 and 3.
- The first string contains the ordered characters from `S`'s even indices ("Rn"), and the second string contains the ordered characters from `S`'s odd indices ("ak").
