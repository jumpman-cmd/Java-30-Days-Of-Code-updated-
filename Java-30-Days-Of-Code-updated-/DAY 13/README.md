# Book Information Display

## Objective
This project aims to extend the functionality of a given `Book` class by creating a `MyBook` class that inherits from `Book`. The `MyBook` class is designed to include additional attributes and methods to display detailed information about the book, including its price.

## Task Description
You are provided with a `Book` class that has two attributes: `title` and `author`. Your task is to:
1. Create a `MyBook` class that inherits from `Book`.
2. Add an additional attribute `price` to the `MyBook` class.
3. Implement a constructor that takes `title`, `author`, and `price` as parameters.
4. Implement the `display` method to print the book details in the specified format.

### Input Format
The input is handled by the `Solution` class, which reads the following from standard input:
- The title of the book.
- The author of the book.
- The price of the book.

### Constraints
There are no specific constraints for this task other than the input being read from standard input.

### Output Format
The `display` method in the `MyBook` class should print the book details in the following format:
Title: <title>
Author: <author>
Price: <price>

### Example

#### Sample Input
The Alchemist
Paulo Coelho
248

#### Sample Output
Title: The Alchemist
Author: Paulo Coelho
Price: 248

## Solution

### Implementation
The `MyBook` class inherits from the abstract `Book` class. The `MyBook` class includes an additional attribute `price` and implements the `display` method to print the book details.
