import java.util.*;

public class reverse {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        System.out.println(end);
        while(start < end){
            reversed(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void reversed(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }



}
