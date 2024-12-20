public class pracitse_binary_search {
    public static void main(String[] args) {
        //lets revise binary search

        int[] arr = {1,2,3,4,5,6,7};
        int target = 4;
        
        int ascendingOrderBinarySearch = binarySearch(arr, target); // arguments
        System.out.println("BinarySearch: " + ascendingOrderBinarySearch);
        
        int[] reversedArr = {7,6,5,4,3,2,1};
        int reversedTarget = 6;
        int descendingOrderBinarySearch = descendingBinarySearch(reversedArr, reversedTarget);

        System.out.println("Descending BinarySearch: " + descendingOrderBinarySearch);

        int[] ascendingArr = {1,2,3,4,5,6,7};
        int ascendingTarget = 6;
        int ascendingOrderAgnostic = orderAgnosticBinarySearch(ascendingArr, ascendingTarget);
        System.out.println("Order agnostic Descending order: " + ascendingOrderAgnostic);
        
        
        int[] descendingArr = {7,6,5,4,3,2,1};
        int descendingTarget = 6;
        int descendingOrderAgnostic = orderAgnosticBinarySearch(descendingArr, descendingTarget);
        System.out.println("Order agnostic Descending order: " + descendingOrderAgnostic);

        int[] ceilArr = {1,2,3,4,5,7};
        int ceilTarget = 6;
        int ceil = findCeil(ceilArr, ceilTarget);
        System.out.println("Ceil: " + ceil);

        int[] floorArr = {1,2,3,4,5,7};
        int floorTarget = 6;
        int floor = findFloor(floorArr, floorTarget);
        System.out.println("Floor: " + floor);
    }

    static int binarySearch(int[]  arr,int target){ // parameters
        int arrLength = arr.length;
        int start = 0;
        int end = arrLength-1;
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

    static int descendingBinarySearch(int[] arr, int target){
        int arrSize =arr.length;
        int start = 0;
        int end = arrSize-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                end = mid - 1;
            } else if(target < arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int arrLength = arr.length;
        int start = 0;
        int end =  arrLength-1;
        boolean isAscendingFlag = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAscendingFlag){
                if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    end =  mid - 1;
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

    static int findCeil(int[] arr, int target){
        int arrLength = arr.length;
        int start = 0;
        int end = arrLength-1;
        if(target > arr[end]){
            return -1;
        }
        while(start<= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;        
    }

    static int findFloor(int[] arr, int target){
        int arrSize = arr.length;
        int start = 0;
        int end = arrSize -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
