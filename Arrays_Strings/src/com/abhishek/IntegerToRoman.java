package com.abhishek;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 3435;
        System.out.println(IntToStr(num));
    }

    static String IntToStr(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                roman.append(romans[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }
}

/*
Approach:
Start with the largest Roman numeral value and check if it fits into the given number.
Subtract the Roman numeral value from the number and append the corresponding Roman numeral to the result.
Continue this process until the number becomes zero.



Example Walkthrough--

Initial num = 3435:

The largest value less than or equal to 3435 is 1000 (M).
Subtract 1000 three times: 3435 - 1000 = 2435, 2435 - 1000 = 1435, 1435 - 1000 = 435.
Append "MMM" to the result.
num = 435:

The next value is 400 (CD).
Subtract 400 once: 435 - 400 = 35.
Append "CD" to the result.
num = 35:

The next value is 10 (X).
Subtract 10 three times: 35 - 10 = 25, 25 - 10 = 15, 15 - 10 = 5.
Append "XXX" to the result.
num = 5:

The next value is 5 (V).
Subtract 5 once: 5 - 5 = 0.
Append "V" to the result.
Final Result:

The Roman numeral string is "MMMCDXXXV".




 */
