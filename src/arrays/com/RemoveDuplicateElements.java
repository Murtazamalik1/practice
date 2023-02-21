package arrays.com;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,6,7};
        System.out.println("Original Arrays :" + Arrays.toString(arr));
        int len = arr.length;
       // int temp[] = new int[arr.length];
        int j =0;
        for (int i =0; i < len -1; i++){
            if (arr[i] != arr[i+1] ){
                arr[j++] = arr[i]; // 1,2,3,4,5,6,7
            }
        }

        arr[j++] = arr[len -1];
        //print unique elements
        for (int k=0; k < j; k++){
            System.out.println( arr[k]);
        }
    }

}
