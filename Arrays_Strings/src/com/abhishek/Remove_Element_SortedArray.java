package com.abhishek;

import java.util.Arrays;

public class Remove_Element_SortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(remove(nums));
        System.out.println(Arrays.toString(nums));
    }
    static int remove(int[] nums){
        int count = 1;
        int occurrences = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                occurrences++;
            }else{
                occurrences = 1;
            }
            if(occurrences <= 2){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }


//    Optimized Version:

    static int remove2(int [] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int count = 2;  // We can keep the first two elements as they are always valid
        for (int i = 2; i < nums.length; i++) {
//         If the current number is not equal to the number two places before, it's safe to include it.
            if (nums[i] != nums[count-2]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
