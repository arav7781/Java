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
/**
 * Computes the square of a number.
 * @param a The number to be squared.
 * @return The square of a.
 */
 public static double square(double a) {
 return a * a;
 }
 /**
 * Computes the cube of a number.
 * @param a The number to be cubed.
 * @return The cube of a.
 */
 public static double cube(double a) {
 return a * a * a;
 }
 /**
 * Computes the square root of a non-negative number.
 * @param a The number.
 * @return The square root of a.
 * @throws IllegalArgumentException If a is negative.
 */
 public static double squareRoot(double a) {
 if (a < 0) {
 throw new IllegalArgumentException("Square root of negative numbers is not real.");
 }
 return Math.sqrt(a);
 }
}
