package arrays.com;

public class ArrayExample {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
       for (int i = 0; i<arr.length; i++){
           System.out.println(arr[i]);

        }
       int total = 0;
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println("Total is :" + total);
    }
}
