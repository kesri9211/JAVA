/*
Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1
Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".

Example 1:
Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.

*/
class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        int count = 1;
        
        // Repeat string 'a' until its length is at least as long as 'b'
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        
        // Check if 'b' can be found within the repeated 'a'
        if (sb.indexOf(b) != -1) {
            return count;
        }
        
        // Check one more time with 'a' appended to see if 'b' can be found
        if (sb.append(a).indexOf(b) != -1) {
            return count + 1;
        }
        
        // If not found even after adding one more repetition of 'a', return -1
        return -1;
    }
}
