package com.abhishek;

import java.util.Arrays;

public class Remove_Element_SortedARR {
    public static void main(String[] args) {
        int[] result = {1,1,2};
        System.out.println(remove(result));
        System.out.println(Arrays.toString(result));
    }

    static int remove(int[] nums){
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

//    Optimise Way
    static int remove2(int[] nums) {
        int count = 1;  // We always keep the first element
        for (int i = 1; i < nums.length; i++) {  // Start from the second element
            if (nums[i] != nums[i - 1]) {  // If the current element is not equal to the previous one
                nums[count] = nums[i];  // Copy it to the 'count' position
                count++;  // Increment the count to move the 'pointer' to the next valid position
            }
        }
        return count;  // Return the length of the array after removing duplicates
    }



}


/*
Key Steps in the Code:
Edge Case Handling:

First, the code checks whether the array is empty (nums.length == 0). If the array is empty, it returns 0 since there are no elements to process.
In this case, the array is not empty, so we proceed with the next steps.
Initialization:

i = 0: This is the pointer that keeps track of the last unique element in the array.
j = 1: This pointer starts at the second element and is used to iterate through the array, looking for unique elements.
Step-by-Step Explanation:
Iteration 1:
i = 0, j = 1:
nums[i] = 0, nums[j] = 0
nums[j] is equal to nums[i], so both elements are the same. We skip this element (because it's a duplicate).
Iteration 2:
i = 0, j = 2:
nums[i] = 0, nums[j] = 1
Since nums[j] != nums[i] (they are different), we increment i to 1 and update nums[i] = nums[j] (i.e., nums[1] = 1).
The array now looks like this:

nums = [0, 1, 1, 1, 1, 2, 2, 3, 3, 4]
i is now at position 1, and the unique elements are 0 and 1.
Iteration 3:
i = 1, j = 3:
nums[i] = 1, nums[j] = 1
nums[j] is equal to nums[i], so we skip this element (because it's a duplicate).
Iteration 4:
i = 1, j = 4:
nums[i] = 1, nums[j] = 1
Again, nums[j] is equal to nums[i], so we skip this element (another duplicate).
Iteration 5:
i = 1, j = 5:
nums[i] = 1, nums[j] = 2
Since nums[j] != nums[i] (they are different), we increment i to 2 and update nums[i] = nums[j] (i.e., nums[2] = 2).
The array now looks like this:

nums = [0, 1, 2, 1, 1, 2, 2, 3, 3, 4]
i is now at position 2, and the unique elements are 0, 1, and 2.
Iteration 6:
i = 2, j = 6:
nums[i] = 2, nums[j] = 2
nums[j] is equal to nums[i], so we skip this element (duplicate).
Iteration 7:
i = 2, j = 7:
nums[i] = 2, nums[j] = 3
Since nums[j] != nums[i] (they are different), we increment i to 3 and update nums[i] = nums[j] (i.e., nums[3] = 3).
The array now looks like this:

nums = [0, 1, 2, 3, 1, 2, 2, 3, 3, 4]
i is now at position 3, and the unique elements are 0, 1, 2, and 3.
Iteration 8:
i = 3, j = 8:
nums[i] = 3, nums[j] = 3
nums[j] is equal to nums[i], so we skip this element (duplicate).
Iteration 9:
i = 3, j = 9:
nums[i] = 3, nums[j] = 4
Since nums[j] != nums[i] (they are different), we increment i to 4 and update nums[i] = nums[j] (i.e., nums[4] = 4).
The array now looks like this:


nums = [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
i is now at position 4, and the unique elements are 0, 1, 2, 3, and 4.
Final Result:
The iteration is complete, and the array now contains the unique elements in the first i + 1 = 5 positions.

Final modified array:

nums = [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
The unique elements (0, 1, 2, 3, 4) occupy the first 5 positions of the array.

New length: The method returns i + 1 = 5, which is the number of unique elements in the array.

Output:
New Length: 5 (There are 5 unique elements).
Modified Array: The first 5 elements of nums are the unique values [0, 1, 2, 3, 4]. These values are considered valid, and the remaining elements (nums[5], nums[6], etc.) are irrelevant for the result.
New length: 5
Modified array: 0 1 2 3 4


 */
