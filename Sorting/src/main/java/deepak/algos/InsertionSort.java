package main.java.deepak.algos;

public class InsertionSort {

//    Approach:
//    Take an element from the unsorted array.
//    Place it in its corresponding position in the sorted part.
//    Shift the remaining elements accordingly.
//    In this approach, start iterating the “outer for loop”  from the 2nd position of the array.
//    The “inner while loop” shifts the elements using swapping.

//    Time Complexity: O(n^2) (nested loops)
//    Space Complexity: O(1)
    public static int[] sort(final int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            if (arr[i] > arr[j]) {
                for (int k = j; k >= 0; k--) {
                    int temp = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = temp;
                }

            }
        }
        return arr;
    }
}
