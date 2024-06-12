# Phone Book Application

## Task
Create a phone book application that maps friends' names to their respective phone numbers and handles queries to find phone numbers.

## Problem Statement
Given `n` names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. For each queried name, print the associated entry from the phone book on a new line in the form `name=phoneNumber`; if an entry for the name is not found, print `Not found` instead.

## Input Format
- The first line contains an integer, `n`, denoting the number of entries in the phone book.
- Each of the next `n` lines describes an entry in the form of `name phoneNumber`.
- After the `n` lines of phone book entries, there are an unknown number of lines of queries. Each line contains a name to look up.

## Output Format
On a new line for each query, print `Not found` if the name has no corresponding entry in the phone book; otherwise, print the full `name=phoneNumber`.

## Example

### Sample Input
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

### Sample Output
sam=99912222
Not found
harry=12299933

## Explanation
- We add the following (Key, Value) pairs to our map:
  - sam=99912222
  - tom=11122222
  - harry=12299933
- We then process each query and print `name=phoneNumber` if the queried name is found in the map; otherwise, print `Not found`.

## Constraints
- Names consist of lowercase English alphabetic letters and are first names only.
- Phone numbers are 8-digit long.

## Solution

The solution involves using a `HashMap` to store the phone book entries and then processing each query to check for the presence of the queried name in the map.
