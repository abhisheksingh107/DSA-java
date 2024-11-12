package com.abhishek;

public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majority(arr));
    }
    static int majority(int[] nums){
        int candidate = 0;
        int count = 0;
        for(int num: nums){
            if(count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            }else{
                count --;
            }
        }
        return candidate;
    }
}


/*

Boyer-Moore Voting Algorithm:
The algorithm uses two variables:

candidate: Holds the current potential majority element.
count: Keeps track of how many times the current candidate has been "matched" or "opposed".
How the algorithm works:
Initialization:

Set candidate to some value (initially 0 or any number, it doesn't matter).
Set count to 0.
Iterate over the array:

If count is 0, choose the current element as the candidate and set count = 1.
If the current element equals the candidate, increment count.
If the current element is different from the candidate, decrement count.
At the end of the array, the candidate will be the majority element (since we are guaranteed that a majority element exists).

example --

nums = [2, 2, 1, 1, 1, 2, 2]
Step-by-step execution:
Initial values: candidate = 0, count = 0
First element: 2

count = 0: Since count is zero, we set candidate = 2 and count = 1.
Current state: candidate = 2, count = 1
Second element: 2

count = 1: Since 2 == candidate (2), we increment count to 2.
Current state: candidate = 2, count = 2
Third element: 1

count = 2: Since 1 != candidate (2), we decrement count to 1.
Current state: candidate = 2, count = 1
Fourth element: 1

count = 1: Since 1 != candidate (2), we decrement count to 0.
Current state: candidate = 2, count = 0
Fifth element: 1

count = 0: Since count is zero, we set candidate = 1 and count = 1.
Current state: candidate = 1, count = 1
Sixth element: 2

count = 1: Since 2 != candidate (1), we decrement count to 0.
Current state: candidate = 1, count = 0
Seventh element: 2

count = 0: Since count is zero, we set candidate = 2 and count = 1.
Current state: candidate = 2, count = 1
Final result: After iterating over all elements, the candidate is 2. This is the majority element because it appeared more than ⌊n / 2⌋ times (⌊7 / 2⌋ = 3).

 */