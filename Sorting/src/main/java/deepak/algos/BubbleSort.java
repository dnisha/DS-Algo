package main.java.deepak.algos;

public class BubbleSort {
//    Approach:
//    Repeatedly swap 2 adjacent elements if arr[j] > arr[j+1] .
//    Here, the maximum element of the unsorted array reaches the end of the unsorted array after each iteration.
//    Unlike selection sort, here, sorting is done from the back as shown in the dry run.
//    After (N-1) iterations , we get a sorted array.

//    Time Complexity: O(n^2), (nested for loop)
//    Space Complexity: O(1)
    public static int[] sort(final int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    //swap

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
        }

        return arr;
    }
}
