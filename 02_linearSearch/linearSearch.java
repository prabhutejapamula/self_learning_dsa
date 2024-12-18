public class linearSearch {
public static void main(String[] args) {
    

    //search in a string

    String name = "Universe";
    char ch = 'e';

    for(char c : name.toCharArray()){
        if(c == ch){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    System.out.println("String with enhanced for loop");

    for(int i = 0; i<name.length();i++){
        if(ch == name.charAt(i)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    System.out.println("String with for loop");

    // search in an array

    int[] nums = {1,2,3,4,5};
    int target = 5;
    for(int i = 0; i<nums.length;i++){
        if(nums[i] == target){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    System.out.println("Searching in an array");

    //search on range

    

}
}
