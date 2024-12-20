public class ceil {
public static void main(String[] args) {
    // ceil means the number is >= target number

    int[] arr = {4,6,8,10,11};
    int target =22;
    int answer = findCeil(arr, target);
    System.out.println(answer);

}

static int findCeil(int[] arr, int target){
    int sizeOfArr = arr.length;
    int start = 0;
    int end = sizeOfArr-1;
    if(target > arr[end]){
        return -1;
    }
    while(start<=end){
        int mid = start+(end-start)/2;
        if(target < arr[mid]){
            end = mid - 1;
        } else if(target > arr[mid]){
            start = mid + 1;
        } else {
            return mid;
        }
    }
    return start;
}
}
