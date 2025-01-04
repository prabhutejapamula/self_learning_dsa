package sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,0};
        int arrSize = arr.length;
        boolean swapped;
        for(int i = 0; i < arrSize-1; i++){
            swapped = false;
            System.out.println(arrSize - 1 - i);
            for(int j = 0; j < arrSize - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        System.out.println(Arrays.toString(arr));
    }

}
