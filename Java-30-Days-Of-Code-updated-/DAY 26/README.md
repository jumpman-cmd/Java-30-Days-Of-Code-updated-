# Library Fine Calculator

## Task

Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

- If the book is returned on or before the expected return date, no fine will be charged.
- If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, the fine is 15 Hackos * number of days late.
- If the book is returned after the expected return month but still within the same calendar year as the expected return date, the fine is 500 Hackos * number of months late.
- If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.

## Example

- Returned date: 9 6 2015
- Due date: 6 6 2015

The book is returned late within the same month and year, so the fine is 45 Hackos.

## Input Format

- The first line contains 3 space-separated integers denoting the respective day, month, and year on which the book was actually returned.
- The second line contains 3 space-separated integers denoting the respective day, month, and year on which the book was expected to be returned (due date).

## Constraints

- 1 ≤ D ≤ 31
- 1 ≤ M ≤ 12
- 1 ≤ Y ≤ 3000

## Output Format

Print a single integer denoting the library fine for the book received as input.

## Sample Input
9 6 2015
6 6 2015

## Sample Outpup
45

## Explanation

Given the following return dates:
- Returned: 9 6 2015
- Due: 6 6 2015

- Because the return year (2015) is the same as the due year (2015), it is not late by more than a year.
- Because the return month (6) is the same as the due month (6), it is not late by more than a month.
- Because the return day (9) is after the due day (6), it is late within the same month.

Per the library's fee structure, the fine will be 15 Hackos * (9 - 6) = 45 Hackos.
