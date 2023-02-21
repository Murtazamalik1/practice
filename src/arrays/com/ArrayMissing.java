package arrays.com;

import java.util.Scanner;

public class ArrayMissing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 6, 8, 9};
        System.out.println("enter start value");
        int min = scanner.nextInt();
        System.out.println("enter end value");
        int max = scanner.nextInt();
        ArrayMissing arrayMissing = new ArrayMissing();
        arrayMissing.findMissing(min,max,array);
    }
    public void findMissing(int min,int max, int array[]){
        for (int a = min; a <= max; a++){
            boolean status = false;
            for (int i = 0; i< array.length; i++) {
                if (a == array[i]) {
                    status = true;
                    break;
                }
            }
                if (status == false){
                    System.out.println(a+ " ");

            }
        }
    }
}

