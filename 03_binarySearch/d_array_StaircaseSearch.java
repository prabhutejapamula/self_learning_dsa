import java.util.Arrays;

public class d_array_StaircaseSearch {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
    };
        int target = 37;
        System.out.println(Arrays.toString(StaircaseSearch(arr, target)));
    }

    static int[] StaircaseSearch(int[][] arr, int target){
        int currentRow = 0;
        int rowCount = arr.length;
        int currentColumn = arr[0].length - 1;
        while(currentRow < rowCount && currentColumn >= 0){
            if(arr[currentRow][currentColumn] == target){
                return new int[]{currentRow, currentColumn};
            }
            if(arr[currentRow][currentColumn] < target){
                currentRow++;                  
            } else {
                currentColumn--;
            }
        }
        return new int[]{-1,-1};
    }
}
