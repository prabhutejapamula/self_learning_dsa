public class order_agnostic_binary_search {
public static void main(String[] args) {

    // "order agnostic" typically refers to a situation where the order of elements is either ascending or descending.

    // now lets do a binary search if the given is array is either in ascending or descending order.

    int[] arr = {9,8,7,6,5,4,3,2,1};
    // int[] arr = {7,8,9};
    int target = 1;
    int answer = orderAgnosticSearch(arr, target);
    System.out.println(answer);
    
}

static int orderAgnosticSearch(int[] arr, int target){
    int sizeOfArr = arr.length;
    int start = 0;
    int end = sizeOfArr-1;
    boolean isAscending = arr[start] < arr[end];



    while(start <= end){
        int mid = start+(end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(isAscending){
            if(target > arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } else{
            if(target > arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

    }
    return -1;
}
}
