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

        // Prompt the user to enter their income
        System.out.print("Enter your monthly income: ");
        double income = input.nextDouble();
        budget.put("Income", income);


    }
}
