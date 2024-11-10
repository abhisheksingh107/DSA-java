package com.abhishek;
import java.util.Arrays;


public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize three pointers
        int i = m - 1; // Pointer for the end of the initialized part of nums1
        int j = n - 1; // Pointer for the end of nums2
        int k = m + n - 1; // Pointer for the end of nums1 (where we will place elements)

        // Compare elements from the back and place the larger one at the end of nums1
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them to the beginning of nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
