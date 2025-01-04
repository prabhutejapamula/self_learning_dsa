import java.util.Arrays;

public class twod_array_binarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,4},
            {2,5}
    };
        int target = 2;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    // Binary search for a target in the 2D matrix
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start binary search on the "flattened" 1D version of the matrix
        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Calculate the row and column from the flattened index
            int row = mid / cols;
            int col = mid % cols;

            // Check if we've found the target
            if (matrix[row][col] == target) {
                return new int[]{row,col};
            } 
            if (matrix[row][col] < target) {
                start = mid + 1; // Move to the right half
            } else {
                end = mid - 1; // Move to the left half
            }
        }

        return new int[]{-1,-1}; // Target not found
    }
}
