class Solution{
    static boolean check(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    String longestPalindrome(String S){
        // code here
        String result="";
      //finding substring
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<S.length()+1;j++){
                String ss=S.substring(i,j); 
                boolean ans=check(ss);
              //finding largest substring
                if(ans && result.length()<ss.length()){
                    result=ss;
                }
            }
        }
        return result;
    }
}
