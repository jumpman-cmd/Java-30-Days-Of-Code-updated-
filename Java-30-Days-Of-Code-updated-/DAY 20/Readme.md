# Day 20: Bubble Sort Algorithm

## Objective
The objective of this project is to implement the Bubble Sort algorithm to sort an array of integers and determine the number of swaps needed to sort the array. Additionally, it aims to demonstrate the use of basic sorting techniques and provide insight into how Bubble Sort works.

## Task
Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm. Once sorted, print the following lines:
1. `Array is sorted in numSwaps swaps.`
2. `First Element: firstElement`
3. `Last Element: lastElement`

Where `numSwaps` is the number of swaps that took place, `firstElement` is the first element in the sorted array, and `lastElement` is the last element in the sorted array.

### Example
For an array `a = [4, 3, 1, 2]`, the Bubble Sort process is as follows:
- Original array: `[4, 3, 1, 2]`
- After round 1: `[3, 1, 2, 4]` with 3 swaps.
- After round 2: `[1, 2, 3, 4]` with 2 swaps.
- No swaps needed in round 3, array is sorted.

Output:
Array is sorted in 5 swaps.
First Element: 1
Last Element: 4

## Input Format
- The first line contains an integer `n`, the number of elements in the array.
- The second line contains `n` space-separated integers representing the array elements.

## Constraints
- `1 ≤ n ≤ 600`
- `1 ≤ a[i] ≤ 2 × 10^6`

## Output Format
Print the following three lines:
1. `Array is sorted in numSwaps swaps.`
2. `First Element: firstElement`
3. `Last Element: lastElement`

## Sample Input 0
3
1 2 3

## Sample Output 0
Array is sorted in 0 swaps.
First Element: 1
Last Element: 3

## Sample Input 1
3
3 2 1

## Sample Output 1
Array is sorted in 3 swaps.
First Element: 1
Last Element: 3

## Explanation
In the first sample, the array `[1, 2, 3]` is already sorted, so no swaps are required. In the second sample, the array `[3, 2, 1]` requires 3 swaps to be sorted into `[1, 2, 3]`.
