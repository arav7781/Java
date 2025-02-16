public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    
}
