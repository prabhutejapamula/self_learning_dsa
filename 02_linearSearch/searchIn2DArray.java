import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        
        int[][] arr = {
            {1,2,3},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16,17}
        };
        int target = 17;
        int[] answer = new int[2];

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }

}
