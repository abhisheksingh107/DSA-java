package com.abhishek;

public class TrappingRainWater {
    public static void main(String[] args){
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }
    static int trap(int[] height){
        int left = 0;
        int right = height.length-1;
        int left_max = 0;
        int right_max = 0;
        int waterTrap = 0;
        while(left <= right) {
            if (height[left] <= height[right]) {
                // so Proceess the Left side
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    waterTrap += left_max - height[left];
                }
                left++;
            } else {
                // Process the rightSide
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    waterTrap += right_max - height[right];
                }
                right--;
            }
        }
            return waterTrap;
    }
}


/*

Step-by-step explanation:
Iteration 1:

left = 0, right = 11.
height[left] = 0, height[right] = 1.
Since height[left] <= height[right], we process the left side.
left_max is updated because height[left] (0) is less than left_max (0). No water is trapped here, so waterTrapped remains 0.
Move left pointer to 1.
Iteration 2:

left = 1, right = 11.
height[left] = 1, height[right] = 1.
height[left] <= height[right], so we process the left side.
left_max is updated to 1 because height[left] (1) is greater than left_max (0).
No water is trapped, so waterTrapped still remains 0.
Move left pointer to 2.
Iteration 3:

left = 2, right = 11.
height[left] = 0, height[right] = 1.
height[left] <= height[right], so we process the left side.
left_max is still 1.
Water trapped here is left_max - height[left] = 1 - 0 = 1. Add 1 to waterTrapped, so now waterTrapped = 1.
Move left pointer to 3.
Iteration 4:

left = 3, right = 11.
height[left] = 2, height[right] = 1.
height[left] > height[right], so we process the right side.
right_max is updated to 1 because height[right] (1) is greater than right_max (0).
No water is trapped, so waterTrapped remains 1.
Move right pointer to 10.
Iteration 5:

left = 3, right = 10.
height[left] = 2, height[right] = 2.
height[left] <= height[right], so we process the left side.
left_max is updated to 2 because height[left] (2) is greater than left_max (1).
No water is trapped, so waterTrapped remains 1.
Move left pointer to 4.
Iteration 6:

left = 4, right = 10.
height[left] = 1, height[right] = 2.
height[left] <= height[right], so we process the left side.
left_max is still 2.
Water trapped here is left_max - height[left] = 2 - 1 = 1. Add 1 to waterTrapped, so now waterTrapped = 2.
Move left pointer to 5.
Iteration 7:

left = 5, right = 10.
height[left] = 0, height[right] = 2.
height[left] <= height[right], so we process the left side.
left_max is still 2.
Water trapped here is left_max - height[left] = 2 - 0 = 2. Add 2 to waterTrapped, so now waterTrapped = 4.
Move left pointer to 6.
Iteration 8:

left = 6, right = 10.
height[left] = 1, height[right] = 2.
height[left] <= height[right], so we process the left side.
left_max is still 2.
Water trapped here is left_max - height[left] = 2 - 1 = 1. Add 1 to waterTrapped, so now waterTrapped = 5.
Move left pointer to 7.
Iteration 9:

left = 7, right = 10.
height[left] = 3, height[right] = 2.
height[left] > height[right], so we process the right side.
right_max is updated to 2 because height[right] (2) is greater than right_max (1).
No water is trapped, so waterTrapped remains 5.
Move right pointer to 9.
Iteration 10:

left = 7, right = 9.
height[left] = 3, height[right] = 1.
height[left] > height[right], so we process the right side.
right_max is updated to 2 because height[right] (1) is less than right_max (2).
Water trapped here is right_max - height[right] = 2 - 1 = 1. Add 1 to waterTrapped, so now waterTrapped = 6.
Move right pointer to 8.
Iteration 11:

left = 7, right = 8.
height[left] = 3, height[right] = 2.
height[left] > height[right], so we process the right side.
right_max is updated to 2 because height[right] (2) is equal to right_max (2).
No water is trapped, so waterTrapped remains 6.
Move right pointer to 7.
Termination:
At this point, left = 7 and right = 7, so the loop terminates. The total amount of water trapped is 6.

Output:
6
Summary:
The two-pointer approach works by comparing the heights from both ends of the array.
Water is trapped when the current height is lower than the maximum height encountered so far from either end.
The total trapped water is calculated by summing the differences between the current height and the maximum height at each position.





 */
