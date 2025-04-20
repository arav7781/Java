import java.util.InputMismatchException;
import java.util.Scanner;
/**
* The Main class provides a command-line interface for the calculator application.
* It allows users to select operations and input numbers, handling exceptions gracefully.
*/
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 boolean exit = false;
 while (!exit) {
 displayMenu();
 try {
 int choice = scanner.nextInt();
 if (choice == 8) {
 exit = true;
 }
System.out.println("Exiting calculator. Goodbye!");
 break;
 }
 if (choice < 1 || choice > 8) {
 System.out.println("Invalid choice. Please enter a number between 1 and 8.");
 scanner.nextLine(); // Clear the buffer
 continue;
 }
 processChoice(choice, scanner);
 } catch (InputMismatchException e) {
 System.out.println("Invalid input. Please enter a numeric value.");
 scanner.nextLine(); // Clear the invalid input
 } catch (ArithmeticException | IllegalArgumentException e) {
 System.out.println("Error: " + e.getMessage());
 } catch (Exception e) {
 System.out.println("An unexpected error occurred: " + e.getMessage());
 }
 }
 scanner.close();
 }
private static void displayMenu() {
 System.out.println("\nCalculator Menu:");
 System.out.println("1. Addition");
 System.out.println("2. Subtraction");
 System.out.println("3. Multiplication");
 System.out.println("4. Division");
 System.out.println("5. Square");
 System.out.println("6. Cube");
 System.out.println("7. Square Root");
 System.out.println("8. Exit");
 System.out.print("Choose an option (1-8): ");
 }
 private static void processChoice(int choice, Scanner scanner) {
 double a, b, result = 0;
  itch (choice) {
 case 1:
 System.out.print("Enter first number: ");
 a = scanner.nextDouble();
 System.out.print("Enter second number: ");
 b = scanner.nextDouble();
 result = Calculator.add(a, b);
 break;
 case 2:
 System.out.print("Enter first number: ");
 a = scanner.nextDouble();
 System.out.print("Enter second number: ");
 b = scanner.nextDouble();
 result = Calculator.subtract(a, b);
 break;
 case 3:
 System.out.print("Enter first number: ");
 a = scanner.nextDouble();
 System.out.print("Enter second number: ");
 b = scanner.nextDouble();
 result = Calculator.multiply(a, b);
 break;
 case 4:
 System.out.print("Enter dividend: ");
 a = scanner.nextDouble();
 System.out.print("Enter divisor: ");
 b = scanner.nextDouble();
 result = Calculator.divide(a, b);
 break;
 case 5:
 System.out.print("Enter a number: ");
 a = scanner.nextDouble();
 result = Calculator.square(a);
 break;
 case 6:
 System.out.print("Enter a number: ");
 a = scanner.nextDouble();
 result = Calculator.cube(a);
