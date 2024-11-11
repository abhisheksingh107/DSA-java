package com.abhishek;

import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {
        int[] nums = {3,2,2,2,3};
        int val = 3;
       int[] result =  removeElement(nums, val);
        System.out.println(
        Arrays.toString(result));
    }
    static public int[] removeElement(int[] nums, int val) {
        int i = 0;
<<<<<<< HEAD
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
=======
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
>>>>>>> b4efb5ebca260569f1b8941ab9f6536893e3d14f
                nums[i] = nums[j];
                i++;
            }
        }
        int[] result = new int[i];
        for(int k = 0; k < i; k++){
            result[k] = nums[k];
        }
        return result;
        }
    }



/*
Explanation of the Code:
int i = 0;: This pointer keeps track of where the next valid element should be placed in the array.

For loop (for (int j = 0; j < nums.length; j++)): This loop iterates through the entire nums array. j is used to examine each element of nums.

if (nums[j] != val): Inside the loop, we check if the current element (nums[j]) is not equal to the value we want to remove (val).

nums[i] = nums[j];: If the current element is not val, we place it at the next available position (nums[i]), and increment the i pointer.

return i;: After the loop finishes, i will contain the number of valid elements (those not equal to val) in the array, and this value is returned.


 */
