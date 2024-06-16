# Student Grading System

## Objective
The objective of this project is to build a simple student grading system using inheritance in Java. This system uses two classes: `Person` as the base class and `Student` as the derived class.

## Task Description
You are provided with two classes, `Person` and `Student`. The `Student` class inherits from the `Person` class and includes additional functionality to calculate and return the grade of a student based on their test scores.

### Requirements
- Implement the `Student` class constructor.
- Implement the `calculate()` method in the `Student` class that calculates the student's average score and returns the corresponding grade.

### Input Format
- The first line of input contains three space-separated values: `firstName`, `lastName`, and `id`.
- The second line contains the number of test scores.
- The third line contains the test scores separated by spaces.

### Constraints
- Each test score is an integer between 0 and 100.

### Output Format
- The output is handled by the provided code. It prints the student's name, ID, and grade.

## Sample Input
Heraldo Memelli 8135627
2
100 80

## Sample Output
Name: Memelli, Heraldo
ID: 8135627
Grade: O

## Explanation
In the sample input, the student `Heraldo Memelli` has an ID of `8135627` and two test scores: `100` and `80`. The average score is `90`, which corresponds to the grade `O` (Outstanding).

## Solution

### Person Class
The `Person` class stores basic information about a person, including their first name, last name, and ID number. It has a method `printPerson()` to print this information.

### Student Class
The `Student` class inherits from the `Person` class and includes:
- A constructor that initializes the `Student` object with first name, last name, ID, and test scores.
- A `calculate()` method that computes the average of the test scores and returns a character representing the grade.
