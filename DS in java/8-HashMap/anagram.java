/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2) return false;
      //implement using hashmap
        Map<String,Integer>smap=new HashMap<>();
        for(int i=0;i<n1;i++){
            String ch=s.charAt(i)+"";
            if(!smap.containsKey(ch)){
                smap.put(ch,1);
            }
            else{
                smap.put(ch,smap.get(ch)+1);
            }
        }
      //second hashmap
        Map<String,Integer>tmap=new HashMap<>();
        for(int i=0;i<n2;i++){
            String ch=t.charAt(i)+"";
            if(!tmap.containsKey(ch)){
                tmap.put(ch,1);
            }
            else{
                tmap.put(ch,tmap.get(ch)+1);
            }
        }
        
        return smap.equals(tmap);
    }
}


//without extra space
        //method 2- traverse through second string and decrease the frequency of that key in map function
        for(int i=0;i<n2;i++){
            String ch=t.charAt(i)+"";
            if(!smap.containsKey(ch)){
                return false;
            }
            smap.put(ch,smap.get(ch)-1);
            
        }
        //now check whether all value of keys are zero or not
        for(Integer i :smap.values()){
            if(i!=0)
                return false;
        }
        
        return true;
    }
