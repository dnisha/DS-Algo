import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};

        System.out.println("Largest Element in array from solution1 : " + solution1(arr));
        System.out.println("Largest Element in array from solution2 : " + solution2(arr));
    }

    public static int solution1(final int[] arr) {

//        Approach:
//        Sort the array in ascending order.
//        Print the (size of the array -1)th index.
//        Time Complexity: O(N*log(N))
//        Space Complexity: O(n)

        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int solution2(final int[] arr) {

//        Approach:
//        Create a max variable and initialize it with arr[0].
//                Use a for loop and compare it with other elements of the array
//        If any element is greater than the max value, update max value with the element’s value
//        Print the max variable.

//        Time Complexity: O(N)
//        Space Complexity: O(1)
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}


