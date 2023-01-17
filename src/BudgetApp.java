import java.util.HashMap;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        HashMap<String, Double> budget = new HashMap<>();
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
    }
}
