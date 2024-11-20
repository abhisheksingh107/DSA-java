package com.abhishek;

import java.util.Arrays;

public class Product_Array_except_Self {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4};
        int[] result = product(arr);
        System.out.println(Arrays.toString(result));

        int[] arr1 = {1,2,3,4};
        int[] result1 = productExceptSelf(arr1);
        System.out.println(Arrays.toString(result1));


    }



//     1 way -- using nested loop
    static int[] product(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int ans = 1;
            for (int j = 0; j < n; j++) {
                if(i != j) {
                    ans *= arr[j];
                }
            }
            result[i] = ans;
        }
        return result;
    }

//     2nd way --- Optimal Way

    static int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1; i <n ; i++) {
            ans[i] = ans[i-1]*arr[i-1];
        }

        int suffix = 1;
        for (int i = n-1; i >= 0; i--) {
            ans[i] = ans[i]*suffix;
            suffix = suffix * arr[i];
        }
        return ans;
    }
}




/*
Let’s walk through the example nums = [1, 2, 3, 4].

Prefix Pass:

ans[0] = 1 (since there are no elements to the left of 1).
ans[1] = ans[0] * nums[0] = 1 * 1 = 1.
ans[2] = ans[1] * nums[1] = 1 * 2 = 2.
ans[3] = ans[2] * nums[2] = 2 * 3 = 6.

 After the prefix pass, the ans array looks like this: ans = [1, 1, 2, 6]

Suffix Pass:

Start with suffix = 1 (no elements to the right of 4).
For i = 3: ans[3] = ans[3] * suffix = 6 * 1 = 6. Then suffix = suffix * nums[3] = 1 * 4 = 4.
For i = 2: ans[2] = ans[2] * suffix = 2 * 4 = 8. Then suffix = suffix * nums[2] = 4 * 3 = 12.
For i = 1: ans[1] = ans[1] * suffix = 1 * 12 = 12. Then suffix = suffix * nums[1] = 12 * 2 = 24.
For i = 0: ans[0] = ans[0] * suffix = 1 * 24 = 24. Then suffix = suffix * nums[0] = 24 * 1 = 24.

After the suffix pass, the ans array looks like this:

ans = [24, 12, 8, 6]




 */