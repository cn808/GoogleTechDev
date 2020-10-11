package GoogleTechDev;

public class CanBalance {
    /*
        https://codingbat.com/prob/p158767

        Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

        canBalance([1, 1, 1, 2, 1]) → true
        canBalance([2, 1, 1, 2, 1]) → false
        canBalance([10, 10]) → true
    */

    public static boolean canBalance(int[] nums) {

        if(nums == null || nums.length <= 1) return false;

        for(int index = 0; index < nums.length; index++) {
            int sumLeft = 0;
            int sumRight = 0;
            //sum left
            for(int i = 0; i <= index; i++) {
                sumLeft += nums[i];
            }

            //sum right
            for(int j = index+1; j < nums.length; j++) {
                sumRight += nums[j];
            }

            if(sumLeft == sumRight) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println( canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println( canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println( canBalance(new int[]{10, 10}));
    }
}
