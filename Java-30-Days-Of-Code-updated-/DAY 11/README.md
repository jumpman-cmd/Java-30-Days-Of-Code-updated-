# Hourglass Sum in a 2D Array

## Objective
The objective is to find the maximum hourglass sum in a given 6x6 2D array. This task helps in understanding the manipulation of arrays and nested loops in Java.

## Problem Description
Given a 6x6 2D array, an hourglass is a subset of values with indices falling in this pattern:
a b c
d
e f g

There are 16 hourglasses in a 6x6 array. An hourglass sum is the sum of an hourglass' values. The task is to calculate the hourglass sum for every hourglass in the array and then print the maximum hourglass sum.

## Example

### Sample Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

### Sample Output
7

### Explanation
In the provided example, the maximum hourglass sum is 7, obtained from the hourglass:
1 1 1
1
1 1 1
