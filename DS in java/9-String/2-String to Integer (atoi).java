/*
Input: s = "-42"

Output: -42

Explanation:

The underlined characters are what is read in and the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
*/
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty())return 0;
        int sign=1;
        int i=0;
        long num=0;
        
        if(s.charAt(0)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(0)=='+'){
            i++;
        }
        
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            num=num*10+s.charAt(i)-'0';
            if (num > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*num);
    }
}
