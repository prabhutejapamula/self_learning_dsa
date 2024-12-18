public class order_agnostic_binary_search_learn01 {
    public static void main(String[] args) {
        // int[] arr = {98,7,6,5,4,3,2,1};
        int[] arr = {1,2,3,4,5};
        int target = 3;
        int answer = oab(arr, target);
        System.out.println(answer);
    }

    static int oab(int[] arr, int target){
        int sizeOfArray = arr.length;
        int start = 0;
        int end = sizeOfArray-1;
        boolean isAscending = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(isAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
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
