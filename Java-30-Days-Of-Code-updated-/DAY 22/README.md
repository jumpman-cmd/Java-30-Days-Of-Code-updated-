# Binary Search Tree Height Calculator

This repository contains a Java program that calculates the height of a binary search tree (BST). The height of a BST is defined as the number of edges between the tree's root and its furthest leaf node.

## Objective

The objective of this project is to determine the height of a given binary search tree. The height is a measure of the longest path from the root to any leaf node.

## Task

Write a function named `getHeight` that takes the root of a binary search tree as input and returns the height of the tree.

## Input Format

The input consists of multiple lines:
- The first line contains an integer, `n`, denoting the number of nodes in the tree.
- Each of the `n` subsequent lines contains an integer, `data`, denoting the value of an element that must be added to the BST.

## Output Format

The output is a single integer, the height of the BST.

## Example

### Input
7
3
5
2
1
4
6
7

### Output
3

## Explanation

The input forms the following BST:
 3
   / \
  2   5
 /   / \
1   4   6
         \
          7

The longest root-to-leaf path is shown below:
3 -> 5 -> 6 -> 7

There are 3 edges in this path, meaning the height of the BST is 3. Thus, the program prints `3` as the answer.
