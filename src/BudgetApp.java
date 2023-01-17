import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * Budget App
 *
 * This is a simple budgeting application written in Java that allows users to track their income and expenses,
 * set financial goals, and generate reports on their spending patterns.
 *
 * @author Jacob Jonas
 * @version 1.0
 */
public class BudgetApp {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Create a hashmap to store income and expenses
        HashMap<String, Double> budget = new HashMap<>();

        // This is creating a hashmap with the keys "Income", "Housing", "Transportation", "Food", "Entertainment", and
        // "Savings" and setting their values to 0.0.
        budget.put("Income", 0.0);
        budget.put("Housing", 0.0);
        budget.put("Transportation", 0.0);
        budget.put("Food", 0.0);
        budget.put("Entertainment", 0.0);
        budget.put("Savings", 0.0);

        // Create a scanner to read input from the user
        Scanner input = new Scanner(System.in);


        // This is prompting the user to enter their monthly income.
        System.out.print("Enter your monthly income: ");
        double income = input.nextDouble();
        budget.put("Income", income);


        // This is prompting the user to enter their monthly housing expenses.
        System.out.print("Enter your monthly housing expenses: ");
        double housing = input.nextDouble();
        budget.put("Housing", housing);

        // This is prompting the user to enter their monthly transportation expenses.
        System.out.print("Enter your monthly transportation expenses: ");
        double transportation = input.nextDouble();
        budget.put("Transportation", transportation);

        // This is prompting the user to enter their monthly food expenses.
        System.out.print("Enter your monthly food expenses: ");
        double food = input.nextDouble();
        budget.put("Food", food);

        // This is prompting the user to enter their monthly entertainment expenses.
        System.out.print("Enter your monthly entertainment expenses: ");
        double entertainment = input.nextDouble();
        budget.put("Entertainment", entertainment);

        // Calculate the remaining income for savings
        double savings = income - housing - transportation - food - entertainment;
        budget.put("Savings", savings);

        // Print out the budget summary
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Budget Summary:");
        for (Map.Entry<String, Double> entry : budget.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
        System.out.println("--------------------");
        // Print out the percentage of income spent on each category
        System.out.println("\nPercentage of Income Spent:");
        System.out.println("Housing: " + (housing / income) * 100 + "%");
        System.out.println("Transportation: " + (transportation / income) * 100 + "%");
        System.out.println("Food: " + (food / income) * 100 + "%");
        System.out.println("Entertainment: " + (entertainment / income) * 100 + "%");
        System.out.println("Savings: " + (savings / income) * 100 + "%");

        // Close the scanner
        input.close();
    }
}
