import java.util.*;

class ArrayFunctions {
    void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }

   

    int mindiff(int[] array) {
        if (array.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1;
        }

        int mindiff = Integer.MAX_VALUE;
        int mindiffindex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]); // Fixed absolute difference
            if (diff < mindiff) {
                mindiff = diff;
                mindiffindex = i;
            }
        }

        System.out.println("Minimum difference is: " + mindiff);
        return mindiffindex;
    }

    // Function to convert array to ArrayList
    void arrayToArrayList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num);
        }
        System.out.println("Converted to ArrayList: " + arrayList);
    }

    // Function to convert ArrayList to array
    void arrayListToArray(ArrayList<Integer> arrayList) {
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        System.out.println("Converted back to array: " + Arrays.toString(array));
    }
}
