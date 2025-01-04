package sorting;

import java.util.Arrays;

public class selectionSort {
public static void main(String[] args) {
    int[] arr = {4,7,2,1,9,8,3,0};
    int arrSize = arr.length;
    for(int i = 0; i < arrSize-1; i++){
        int minIndex = i;
        for(int j = i+1;j < arrSize; j++){
            if(arr[j] < arr[minIndex]){
                minIndex = j;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
        System.out.println("index @"+ i + ": "+Arrays.toString(arr));
    }
}
}
