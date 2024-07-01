# Unit Testing for Minimum Index Function

## Task

Your company needs a function that meets the following requirements:

1. For a given array of integers, the function returns the index of the element with the minimum value in the array. If there is more than one element with the minimum value, it returns the smallest one.
2. If an empty array is passed to the function, it raises an exception.

## Implementation

The `minimum_index` function in Java is implemented to find the index of the minimum value in a given array. If the array is empty, it throws an `IllegalArgumentException`.

### Classes for Unit Testing

- **TestDataEmptyArray**
  - `get_array()`: Returns an empty array.

- **TestDataUniqueValues**
  - `get_array()`: Returns an array of size at least 2 with all unique elements.
  - `get_expected_result()`: Returns the expected minimum value index for this array.

- **TestDataExactlyTwoDifferentMinimums**
  - `get_array()`: Returns an array where the minimum value occurs at exactly 2 indices.
  - `get_expected_result()`: Returns the expected index.

## Example

### Sample Input
```java
TestDataEmptyArray.get_array(); // []
TestDataUniqueValues.get_array(); // [3, 1, 2]
TestDataExactlyTwoDifferentMinimums.get_array(); // [3, 1, 2, 1]

### Sample Output
OK

Explanation
The minimum_index function is tested using three test cases:

Empty Array: The function should raise an IllegalArgumentException.
Unique Values: The function should return the index of the minimum value in an array of unique values.
Two Different Minimums: The function should return the first occurrence of the minimum value when it appears more than once.
These tests ensure the correctness and robustness of the minimum_index function.
