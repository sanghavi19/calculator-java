import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Command Line Calculator ===");
        while (true) {
            System.out.print("\nEnter expression (e.g. 5 + 3) or 'exit' to quit: ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            try {
                String[] parts = input.split(" ");
                double num1 = Double.parseDouble(parts[0]);
                String operator = parts[1];
                double num2 = Double.parseDouble(parts[2]);
                double result;
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/":
                        if (num2 == 0) { System.out.println("Error: Division by zero!"); continue; }
                        result = num1 / num2; break;
                    default:
                        System.out.println("Unknown operator!"); continue;
                }
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Invalid input! Use format: number operator number");
            }
        }
        scanner.close();
    }
}  this is java code
