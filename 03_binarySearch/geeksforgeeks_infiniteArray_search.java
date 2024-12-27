public class geeksforgeeks_infiniteArray_search {
public static void main(String[] args) {
    // Find position of an element in a sorted array of infinite numbers
    int[] arr = {1,100,200,300,400,555};
    int target = 300;
    int answer = infiniteSearch(arr,target);
    System.out.println(answer);
}
    static int infiniteSearch(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
