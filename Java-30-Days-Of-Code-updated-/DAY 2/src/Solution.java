import java.util.Scanner;
import java.lang.Math;

public class Solution
{
    private double meal_cost;
    private int tip_percent;
    private int tax_percent;

    // Constructors
    public Solution(double meal, int tip, int tax)
    {
        this.meal_cost = meal;
        this.tip_percent = tip;
        this.tax_percent = tax;
    }

    // Solution methods
    /** public int calculateTipPercent()
     {
     tip_percent = (meal_cost / 100) * tip_percent;
     return tip_percent;
     }

     public int calculateTaxPercent()
     {
     tax_percent = (tax_percent / 100) * meal_cost;
     return tax_percent;
     } **/

    public double totalCost()
    {
        double tip = (meal_cost * tip_percent / 100);
        double tax = (tax_percent * meal_cost / 100);
        double total_cost = meal_cost + tip + tax;
        return Math.round(total_cost);
    }

    // Mutator methods
    public void setMealCost(double meal)
    {
        meal_cost = meal;
    }

    public void setTipPercent(int tip)
    {
        tip_percent = tip;
    }

    public void setTaxPercent(int tax)
    {
        tax_percent = tax;
    }

    // Accessor methods
    public double getMealCost()
    {
        return meal_cost;
    }

    public int getTipPercent()
    {
        return tip_percent;
    }

    public int getTaxPercent()
    {
        return tax_percent;
    }


    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double meal_cost = scan.nextDouble();
        int tip_percent = scan.nextInt();
        int tax_percent = scan.nextInt();

        Solution object1 = new Solution(meal_cost, tip_percent, tax_percent);

        System.out.println((int) object1.totalCost());
        scan.close();
    }
}
