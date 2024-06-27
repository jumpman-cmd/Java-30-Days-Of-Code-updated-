# Binary Search Tree Level-Order Traversal

This repository contains a Java program that performs a level-order traversal (also known as breadth-first search) on a binary search tree (BST). The level-order traversal visits each level of the tree's nodes from left to right, top to bottom.

## Objective

The objective of this project is to implement a level-order traversal on a binary search tree and print the values of the nodes in the order they are visited.

## Task

Write a function named `levelOrder` that performs a level-order traversal on a binary search tree.

## Input Format

The input consists of multiple lines:
- The first line contains an integer, `n`, denoting the number of nodes in the tree.
- Each of the `n` subsequent lines contains an integer, `data`, denoting the value of an element that must be added to the BST.

## Output Format

Print the value of each node in the tree's level-order traversal as a single line of space-separated integers.

## Example

### Input
6
3
5
4
7
2
1

### Output
3 2 5 1 4 7

## Explanation

The input forms the following BST:
    3
   / \
  2   5
 /   / \
1   4   7

We traverse each level of the tree from the root downward, and we process the nodes at each level from left to right. The resulting level-order traversal is `3 2 5 1 4 7`, and we print these data values as a single line of space-separated integers.
