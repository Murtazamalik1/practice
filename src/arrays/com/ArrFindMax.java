package arrays.com;

public class ArrFindMax {
    public static void main(String[] args) {
        int arr[] = {1,20,10,3,5,6,100};
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        int max = 0;
        for (int i =0; i < arr.length; i++){
            max = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Max is :" + max);
    }
}
