package arrays.com;

public class SumOfArray {
    public static void main(String[] args) {

        int arr[] = {1,2,33,4,56,10};
        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        int sum =0;
        for (int i =0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of Arrays :"+sum);
    }
}
