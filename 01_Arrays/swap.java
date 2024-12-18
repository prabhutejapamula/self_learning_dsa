import java.util.*;
public class swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        System.out.println(Arrays.toString(arr));
    }

}
