public class floor {
    public static void main(String[] args) {
        // floor means the number is >= target

        int[] arr = {5,7,8,9,11,13,14,1,5,16,17};
        int target = 10;
        int answer = findFloor(arr,target);
        System.out.println(answer);
    }

    static int findFloor(int[] arr, int target){
        int sizeOfArr = arr.length;
        int start = 0;
        int end = sizeOfArr-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }

}
