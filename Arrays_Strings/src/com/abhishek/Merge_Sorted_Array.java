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



/*
Let's take an example to illustrate how the algorithm works:

nums1: [1, 2, 3, 0, 0, 0]
m: 3
nums2: [2, 5, 6]
n: 3
Step-by-step:
Initial State:

nums1 = [1, 2, 3, 0, 0, 0], nums2 = [2, 5, 6]
i = 2, j = 2, k = 5
First iteration:

Compare nums1[2] (3) with nums2[2] (6).
Since nums2[2] > nums1[2], we place 6 at nums1[5].
Decrement j and k: j = 1, k = 4.
Now, nums1 = [1, 2, 3, 0, 0, 6].
Second iteration:

Compare nums1[2] (3) with nums2[1] (5).
Since nums2[1] > nums1[2], we place 5 at nums1[4].
Decrement j and k: j = 0, k = 3.
Now, nums1 = [1, 2, 3, 0, 5, 6].
Third iteration:

Compare nums1[2] (3) with nums2[0] (2).
Since nums1[2] > nums2[0], we place 3 at nums1[3].
Decrement i and k: i = 1, k = 2.
Now, nums1 = [1, 2, 3, 3, 5, 6].
Fourth iteration:

Compare nums1[1] (2) with nums2[0] (2).
Since both are equal, we can choose either one. Let’s place 2 from nums2 at nums1[2].
Decrement j and k: j = -1, k = 1.
Now, nums1 = [1, 2, 2, 3, 5, 6].
Remaining elements in nums2:

At this point, j = -1, so we stop comparing elements from nums2. No more elements to copy.
Final Result:

The merged array is: nums1 = [1, 2, 2, 3, 5, 6].



 */