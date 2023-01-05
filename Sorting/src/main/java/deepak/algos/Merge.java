package main.java.deepak.algos;

public class Merge {

//    Time complexity: O(nlogn)
//    Reason: At each step, we divide the whole array, for that logn and we assume n steps are taken to get sorted array, so overall time complexity will be nlogn
//    Space complexity: O(n)
//    Reason: We are using a temporary array to store elements in sorted order.
//    Auxiliary Space Complexity: O(n)

    public static int[] mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            //so that value cannot exceed int
            int mid = l + (r - l) / 2;
            //sort from left to mid
            mergeSort(arr, l, mid);
            //sort from mid+1 to right
            mergeSort(arr, mid + 1, r);
            //finally merge
            merge(arr, l, mid, r);
        }
        return arr;
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int k = l;
        int[] temp = new int[arr.length];

        while (i <= mid && j <= r) {

            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];

            } else {
                temp[k++] = arr[j++];

            }
        }
        if (i > mid) {
            while (j <= r) {
                temp[k++] = arr[j++];

            }
        } else {
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
        }

        for (int f = l; f <= r; f++) {
            arr[f] = temp[f];
        }
    }
}
