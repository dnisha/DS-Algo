import main.java.deepak.algos.BubbleSort;
import main.java.deepak.algos.InsertionSort;
import main.java.deepak.algos.Merge;
import main.java.deepak.algos.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int[] SortedArray = {9, 13, 20, 24, 46, 52};

        System.out.println("Hello world!");

        if (Arrays.equals(SelectionSort.sort(arr), SortedArray))
            System.out.println("Array after Selection Sort " + Arrays.toString(SelectionSort.sort(arr)));

        if (Arrays.equals(BubbleSort.sort(arr), SortedArray))
            System.out.println("Array after Bubble Sort " + Arrays.toString(BubbleSort.sort(arr)));

        if (Arrays.equals(InsertionSort.sort(arr), SortedArray))
            System.out.println("Array after Insertion Sort " + Arrays.toString(InsertionSort.sort(arr)));

        if (Arrays.equals(InsertionSort.sort(arr), SortedArray))
            System.out.println("Array after Merge Sort " + Arrays.toString(Merge.mergeSort(arr, 0, 5)));


    }
}