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
 e
