import java.util.HashMap;

public class SumInSubArray {

    public static void main(String[] args) {
        int arr[] = {10, 15, -5,15,-10,5};
        System.out.println(subArray(arr, 20));
    }

    public static int subArray(int[] arr, int sum) {
        int currentSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            currentSum +=arr[i];


            if(map.containsKey(currentSum-sum)){
               start = map.get(currentSum-sum)+1;
               end = i;
               break;
            }
            map.put(currentSum, i);
        }
        if(end == -1){
            return  -1;
        }

        return end-start+1;
    }
}
