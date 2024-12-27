public class rotation_array {
public static void main(String[] args) {
    //find how many times array is rotated

    int[] arr = {4,5,6,7,0,1,2,3};
    int answer =  binarySearch(arr);
    System.out.println(answer);
}

    static int binarySearch(int[] arr){
        int arrSize = arr.length;
        int start = 0;
        int end = arrSize - 1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[end]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
