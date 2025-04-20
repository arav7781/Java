/**
* This class provides static methods to perform basic arithmetic operations,
* including addition, subtraction, multiplication, division, square, cube,
* and square root. It throws exceptions for invalid operations such as division
* by zero or square root of a negative number.
*/
public class Calculator {
 /**
 * Adds two numbers.
 * @param a The first number.
 * @param b The second number.
 * @return The sum of a and b.
 */
 public static double add(double a, double b) {
 return a + b;
 }
 /**
 * Subtracts the second number from the first.
 * @param a The first number.
 * @param b The second number.
 * @return The result of a minus b.
 */
 public static double subtract(double a, double b) {
 return a - b;
 }
 /**
 * Multiplies two numbers.
 * @param a The first number.
 * @param b The second number.
 * @return The product of a and b.
 */
 public static double multiply(double a, double b) {
 return a * b;
 }
 /**
 * Divides the first number by the second.
 * @param a The dividend.
 * @param b The divisor.
 * @return The result of a divided by b.
 * @throws ArithmeticException If the divisor is zero.
 */
 public static double divide(double a, double b) {
 if (b == 0) {
 throw new ArithmeticException("Division by zero is not allowed.");
 }
 return a / b;
 }

