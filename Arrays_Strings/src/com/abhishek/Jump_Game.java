package com.abhishek;

public class Jump_Game {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,1,4};
        System.out.println(canJump(arr1));

        int[] arr2 = {3,2,1,0,4};
        System.out.println(canJump(arr2));

    }

    static boolean canJump(int[] nums){
        int farthest = 0;    // Keep track of the farthest index we can reach
        for (int i = 0; i < nums.length; i++) {
            if(i > farthest){
                // If we're at an index that is beyond the farthest point we can reach, return false
                return false;
            }
            // Update the farthest point we can reach from current index
            farthest = Math.max(farthest, i + nums[i]);

            // If we can reach or surpass the last index, return true
            if(farthest >= nums.length -1){
                return true;
            }
        }

        // If we finish the loop and haven't reached the last index, return false
        return false;
    }
}


/*

Initial state: farthest = 0

At index 0 (nums[0] = 2):

We can jump up to index 2 (0 + 2), so update farthest = 2.
At index 1 (nums[1] = 3):

We can jump up to index 4 (1 + 3), so update farthest = 4.
Since farthest >= nums.length - 1 (4 >= 4), return true immediately.


 */
