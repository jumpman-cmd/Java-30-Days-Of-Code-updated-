# Day 2 Challenge: Meal Cost Calculation

Welcome to the Day 2 Challenge! This challenge involves calculating the total cost of a meal by considering the base cost, tip percentage, and tax percentage.

## Problem Explanation

Given the following inputs:
- `meal_cost`: The base cost of a meal (a double).
- `tip_percent`: The percentage of the meal cost to be added as tip (an integer).
- `tax_percent`: The percentage of the meal cost to be added as tax (an integer).

The goal is to calculate the total meal cost by adding the tip and tax to the base meal cost and then round this total to the nearest integer.

## Steps to Solve the Problem

### 1. Read Input Values:
- Read `meal_cost` as a double.
- Read `tip_percent` as an integer.
- Read `tax_percent` as an integer.

### 2. Calculate Tip and Tax:
- Calculate the tip amount using the formula: `tip_amount = meal_cost * (tip_percent / 100.0)`.
- Calculate the tax amount using the formula: `tax_amount = meal_cost * (tax_percent / 100.0)`.

### 3. Calculate Total Cost:
- Compute the total cost by summing up the `meal_cost`, `tip_amount`, and `tax_amount`.
- Round the total cost to the nearest integer.

### 4. Print the Result:
- Print the rounded total cost.

## Example

Let's consider the sample input provided:
- `meal_cost = 12.00`
- `tip_percent = 20`
- `tax_percent = 8`

**Calculations**:
- Tip: \( 12.00 \times \frac{20}{100} = 2.40 \)
- Tax: \( 12.00 \times \frac{8}{100} = 0.96 \)
- Total Cost: \( 12.00 + 2.40 + 0.96 = 15.36 \)
- Rounded Total Cost: 15

Thus, the output should be `15`.

## Explanation of the Solution

### Input Reading:
- The main method reads the input values for `meal_cost`, `tip_percent`, and `tax_percent` using a Scanner.

### Tip and Tax Calculation:
- The `solve` method calculates the tip and tax amounts using the provided percentages.

### Total Cost Calculation:
- The total cost is calculated by summing the `meal_cost`, `tip`, and `tax`.

### Rounding and Output:
- The `Math.round` method is used to round the total cost to the nearest integer.
- The rounded total cost is then printed.

This approach ensures precise calculations and correct rounding as required by the problem statement.

---
