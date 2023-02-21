package arrays.com;

import java.util.Arrays;

public class ReplaceWords {
    public static void main(String[] args) {

        String[] arr = {"0000", "1111", "1100", "0011", "1010", "0102"};
        System.out.println("original Array is :" + Arrays.toString(arr));
        String replace = "";
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(j) == '0'){
                    replace = replace+"1";
                } else if (str.charAt(j) == '1') {
                    replace = replace+ "0";
                }
            }
            replace = replace+" "; //it make gap between replace array
        }
        System.out.println("Replace Array is: " + Arrays.toString(new String[]{replace}));
    }
}
