import java.util.Scanner;

public class Solution {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Calculate the tip and tax amounts
        double tip = meal_cost * (tip_percent / 100.0);
        double tax = meal_cost * (tax_percent / 100.0);

        // Calculate the total cost
        double total_cost = meal_cost + tip + tax;

        // Round the total cost to the nearest integer
        int rounded_total_cost = (int) Math.round(total_cost);

        // Print the rounded total cost
        System.out.println(rounded_total_cost);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();

        // Solve the problem
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}