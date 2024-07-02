/*Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Examples:

Input: arr[] = {15,-2,2,-8,1,7,10,23}, n = 8
Output: 5
Explanation: The largest subarray with sum 0 is -2 2 -8 1 7.*/
class GfG
{
    int maxLen(int arr[], int n)
    {
        // approach hash map
        /* create map that store <prefix sum , index>
        before inserting check whether prefix sum already exists or not
        if yes then indexofnewprefixsum-indexofoldprefixsum is largest subarray
        because sum between them is alway zero(concept)*/
        
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1); //inital value if total sum =0, edge case
        int ans=0;
        int prefix=0;
        for(int i=0;i<n;i++){
            prefix+=arr[i];
            if(map.containsKey(prefix)){
                if(i-map.get(prefix)>ans)
                    ans=i-map.get(prefix);
            }
            else
                map.put(prefix,i);
        }
        return ans;
        
    }
}
