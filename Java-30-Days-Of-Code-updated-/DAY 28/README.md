# Gmail Users Filter

## Task

Consider a database table, Emails, which has the attributes First Name and Email ID. Given `N` rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in `@gmail.com`.

## Input Format

- The first line contains an integer `N`, the total number of rows in the table.
- Each of the `N` subsequent lines contains two space-separated strings denoting a person's first name and email ID, respectively.

## Constraints

- Each of the first names consists of lowercase letters `a-z` only.
- Each of the email IDs consists of lowercase letters `a-z`, `@`, and `.` only.
- The length of the first name is no longer than 20.
- The length of the email ID is no longer than 50.

## Output Format

Print an alphabetically-ordered list of first names for every user with a Gmail account. Each name must be printed on a new line.

## Sample Input
6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com

## Sample Output
julia
julia
riya
samantha
tanya

## Explanation

Given the input, the function identifies all email addresses that end with `@gmail.com` and collects the corresponding first names. It then sorts the list of first names alphabetically and prints each name on a new line.
