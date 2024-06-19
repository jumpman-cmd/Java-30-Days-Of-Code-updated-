# Linked List Insertion

This repository contains a solution for the "Linked List Insertion" problem from HackerRank's 30 Days of Code challenge.

## Problem Description

A `Node` class is provided. A `Node` object has an integer data field, `data`, and a `Node` instance pointer, `next`, pointing to another node (i.e., the next node in the list).

Your task is to complete the `insert` function so that it creates a new `Node` and inserts it at the tail of the linked list referenced by the `head` parameter. Once the new node is added, return the reference to the `head` node.

### Input Format

- The first line contains an integer `T`, the number of elements to insert.
- Each of the next `T` lines contains an integer to insert at the end of the list.

### Output Format

Return a reference to the `head` node of the linked list.

### Sample Input
4
2
3
4
1

### Sample Output
2 3 4 1

## Explanation

The input specifies that 4 nodes will be inserted into an initially empty list. The nodes will contain the values 2, 3, 4, and 1, respectively. The final list will be printed as `2 3 4 1`.
