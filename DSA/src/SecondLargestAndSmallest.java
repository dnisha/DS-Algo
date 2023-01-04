import java.util.Arrays;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {

        int[] input1 = {1, 2, 4, 6, 7, 5};
        int[] input2 = {0};

        System.out.println("Second largest and smallest element in array by solution1 for input1 : " + solution1Largest(input1) + " and " + solution1Smallest(input1));
        System.out.println("Second largest and smallest element in array by solution1 for input2 : " + solution1Largest(input2) + " and " + solution1Smallest(input2));

        System.out.println("Second largest and smallest element in array by solution2 for input1 : " + solution2Largest(input1) + " and " + solution2Smallest(input1));

    }

    public static int solution1Largest(final int[] arr) {
//        Approach:
//        Sort the array in ascending order
//        The element present at the second index is the second smallest element
//        The element present at the second index from the end is the second largest element
//        Time Complexity: O(NlogN), For sorting the array
//        Space Complexity: O(1)

        if (arr.length < 2) {
            return -1;
        }
        Arrays.sort(arr);
        //returning second largest element from sorted array
        return arr[arr.length - 2];
    }

    public static int solution1Smallest(final int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        Arrays.sort(arr);
        //returning second smallest element from sorted array
        return arr[1];
    }

    public static int solution2Largest(final int[] arr) {

//        If the current element is larger than ‘large’ then update second_large and large variables
//        Else if the current element is larger than ‘second_large’ then we update the variable second_large.
//        Once we traverse the entire array, we would find the second largest element in the variable second_large.
//        Time Complexity: O(N), Single-pass solution
//        Space Complexity: O(1)
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            }
//            this is the condition which is important to note for
//            Case - a[] = {1, 2, 4, 5, 7, 6}
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int solution2Smallest(final int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

}
