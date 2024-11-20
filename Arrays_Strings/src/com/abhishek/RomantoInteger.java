package com.abhishek;

public class RomantoInteger {
    public static void main(String[] args) {
        System.out.println(romantoInt("MCMXCIV"));
    }
    static int romantoInt(String s){
        int[] romanValue = new int[128];  // ASCII size is 128, enough for Roman symbols
        romanValue['I'] = 1;
        romanValue['V'] = 5;
        romanValue['X'] = 10;
        romanValue['L'] = 500;
        romanValue['C'] = 100;
        romanValue['D'] = 500;
        romanValue['M'] = 1000;

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentValue = romanValue[s.charAt(i)];
            // If the current value is less than the next value, subtract current value
            if(i < n-1  && currentValue < romanValue[s.charAt(i+1)]){
                result -= currentValue;
            }
            else{
                result += currentValue;
            }
        }
        return result;
    }
}
