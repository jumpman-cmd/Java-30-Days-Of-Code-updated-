# Remove Duplicates from Linked List

## Overview

This project contains a Java solution for removing duplicate elements from a sorted linked list. The linked list class `Node` and the function `removeDuplicates` are implemented to handle this task. The program reads input values, constructs a linked list, removes duplicates, and prints the updated list.

## Task

A `Node` class is provided, representing an element in a linked list. The `removeDuplicates` function takes the head of a linked list as its parameter, removes any duplicate nodes, and returns the head of the updated list.

### Input Format

You do not need to read any input from stdin. The locked stub code handles the input and passes it to the `removeDuplicates` function. The input consists of:
- The first line contains an integer, `n`, the number of nodes to be inserted.
- The subsequent lines each contain an integer describing the value of a node being inserted at the list's tail.

### Constraints

- The data elements of the linked list will always be in non-decreasing order.

### Output Format

The `removeDuplicates` function should return the head of the updated linked list. The locked stub code prints the returned list to stdout.

## Sample Input
6
1
2
2
3
3
4

## Sample Output
1 2 3 4

## Explanation

The input linked list is `1 -> 2 -> 2 -> 3 -> 3 -> 4`. After removing the duplicates, the updated list is `1 -> 2 -> 3 -> 4`.
