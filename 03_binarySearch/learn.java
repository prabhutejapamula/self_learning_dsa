public class learn {
    public static void main(String[] args) {
        //always remember that to use binary search algorithm, we should have a sorted array

        int[] arr = {-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9};
        int target = -8;
        int answer = binarySearch(arr, target);
        System.out.println(answer);


    }

    static int binarySearch(int[] arr, int target){

        int left = 0;
        int sizeOfArray = arr.length;
        int right = sizeOfArray-1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(target < arr[mid]){
                right = mid-1;
            } else if(target > arr[mid]){
                left = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
