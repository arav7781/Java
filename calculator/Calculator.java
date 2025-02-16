import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Calculator {

    int sum() {
        UserInput ui = new UserInput();
        int[] numbers = ui.getUserInput();
        return numbers[0] + numbers[1];
    }

    int subtraction() {
        UserInput ui = new UserInput();
        int[] numbers = ui.getUserInput();
        return numbers[0] - numbers[1];
    }

    int product() {
        UserInput ui = new UserInput();
        int[] numbers = ui.getUserInput();
        return numbers[0] * numbers[1];
    }

    int division() {
        UserInput ui = new UserInput();
        int[] numbers = ui.getUserInput();
        if (numbers[1] == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return numbers[0] / numbers[1];
    }

    double squareRoot() {
        UserInput ui = new UserInput();
        int[] numbers = ui.getUserInput();
        return Math.sqrt(numbers[0]);
    }

    int fibonacci() {
        UserInput ui = new UserInput();
        int[] numbers = ui.getUserInput();
        return fibonacciHelper(numbers[0]);
    }

    private int fibonacciHelper(int n) {
        if (n <= 1) return n;
        return fibonacciHelper(n - 1) + fibonacciHelper(n - 2);
    }

    double mean() {
        UserInput ui = new UserInput();
        int[] numbers = ui.getCustomArray();
        return Arrays.stream(numbers).average().orElse(Double.NaN);
    }

    int mode() {
        UserInput ui = new UserInput();
        int[] numbers = ui.getCustomArray();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = numbers[0], maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }
