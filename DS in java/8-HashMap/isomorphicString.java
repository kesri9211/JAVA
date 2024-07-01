/*Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //insert if key does not exist
            if(!map.containsKey(ch)){
                //second contion- value should not be same for different key so checking ki value(in second string) pehele se hi toh present nhi map me
                if(map.containsValue(t.charAt(i))){
                    return false;
                } 
                //else put key-value(second string)
                map.put(ch,t.charAt(i));
            }
            else{
                if(map.get(ch)!=t.charAt(i))
                    return false;
            }
        }
        return true;
    }
}
