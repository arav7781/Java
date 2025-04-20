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
