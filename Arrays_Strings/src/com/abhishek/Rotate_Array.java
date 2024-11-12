package com.abhishek;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));

    }
    static void rotate(int[] nums, int k){
        int n = nums.length;
        if(n == 0 || k ==0){
            return;
        }
        //  Step 1 - Normalize k (in case k is larger than the array size)
        k = k % n;

        // Step 2: Reverse the entire array
        helper(nums, 0, n-1);

        // Step 3: Reverse the first k elements
        helper(nums, 0, k-1);

        // Step 4: Reverse the remaining n - k elements
        helper(nums, k, n-1);
    }
    // Helper method to reverse a portion of the array
    static void helper(int[] nums, int start, int end){
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


/*

Algorithm:
Calculate the effective number of rotations: k = k % n, where n is the length of the array.
Reverse the entire array.
Reverse the first k elements.
Reverse the remaining n - k elements.

 */