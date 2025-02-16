import java.util.*;

class Main {
    public static void main(String args[]) {
        UserInput ui = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();

        int[] array = ui.arrayInput();

        // 1. Separate even and odd numbers
        functions.evenOdd(array);

        // 2. Find the index of neighboring numbers with the smallest difference
        int index = functions.mindiff(array);
        System.out.println("Index with minimum difference: " + index);

        // 3. Convert array to ArrayList
        functions.arrayToArrayList(array);

        // 4. Convert ArrayList back to array
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Example list
        functions.arrayListToArray(arrayList);
    }
}
