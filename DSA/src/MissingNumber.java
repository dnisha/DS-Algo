public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(missingNumber(8, arr));
    }

    public static int missingNumber(int n, int[] arr){
//        Time Complexity: O(N)
//        Space Complexity: O(1)
        int resultAr1= 0;
        int resultAr2 = 0;
        for(int i =1; i<= n; i++){
            resultAr1 ^= i;
        }

        for(int i =0; i< arr.length; i++){
            resultAr2 ^=arr[i];
        }
        return resultAr1^resultAr2;
    }
}
