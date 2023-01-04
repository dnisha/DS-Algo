package main.java.deepak.algos;

public class SelectionSort {

//Find the minimum element at unsorted array and swap it with the element at the beginning
//Time Complexity: O(n^2) (nested for loops)
// Space Complexity: O(1)

    public static int[] sort(final int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    //Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }
}
