package com.ojas.mar04;
public class PalindromeOrNot {
    static boolean palindrome(int number) {
        boolean b = false;   
        int rem = 0, rev = 0, temp = number;
        while(number > 0) {
            rem = number % 10;
            rev = (rev * 10) + rem;
            number = number / 10;
        }
        if(temp == rev) {
            b = true;
        }
        return b;
    }
   
    static boolean isOdd(int number) {
        boolean b = false;
        //check condition odd or even
        if(number % 2 !=0) {
            b = true;
        }
        return b;
    }
    
    //range of palindrome
    static String rangeOfPalindrome(int startValue, int endValue) {
        String res = "";
       
        for(int i=startValue; i <= endValue; i++) {
            if(palindrome(i) && isOdd(i)) {
                res += i + ",";
                
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
        System.out.println(rangeOfPalindrome(100,1000));

    }

}


