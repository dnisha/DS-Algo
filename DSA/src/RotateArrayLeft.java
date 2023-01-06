import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {1, 2, 3, 4, 5};
//        2,3,4,5,1
        int n = 3;


        System.out.println("Left Rotate array approach 1 : " + Arrays.toString(rotateLeftSolution1(arr, n)));
    }

    public static int[] rotateLeftSolution1(int[] arr, int n) {
//        Time Complexity: O(n), as we iterate through the array only once.
//        Space Complexity: O(n) as we are using another array of size, same as the given array.

        int j = 0;
        int[] temp = new int[arr.length];

        for (int i = n; i < arr.length ; i++) {
            temp[j++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            temp[j++] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
}
