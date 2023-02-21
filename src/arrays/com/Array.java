package arrays.com;

public class Array {
     static int findMissing(int arr[], int n) {

         int i, count;
         count = (n + 1) * (n + 2)  / 2;
         for (i = 0; i < n; i++)
             count -= arr[i];
             return count;
     }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        int miss = findMissing(arr,5);
        System.out.println(miss);
    }
}
