//approach: //store char in queue if dupticate char found remove all char till that character
/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
     Queue<Character>que=new LinkedList<>(); 
     int len=0;
     int ansLen=0;
    //store char in queue
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(!que.contains(ch)){
            len++;
            que.add(ch);
        }
        else{
            if(len>ansLen)ansLen=len; //store len of max substring
            while(que.size()>0 && que.peek()!=ch) //remove till that char
                que.remove();
            if(que.peek()==ch)que.remove();
            que.add(ch); //add curr char to queue
            len=que.size(); //curr len = len of que
        }
     }
     if(que.size()>ansLen)ansLen=que.size();
     return ansLen;
    }
}
