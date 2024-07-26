/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4
*/
class Solution {
    public int compute(int[] piles,int s){
        int Ttime=0;
        for(int i=0;i<piles.length;i++){
            Ttime+=Math.ceil((double)piles[i]/(double)s);
        }
        System.out.println(Ttime);
        return Ttime;
    }
    public int minEatingSpeed(int[] piles, int h) {
        //approch : binary search
        /*find the min speed so that it can eat all banana before h(hours) */

        //speed/h will always lies b/w [1-max(piles)]
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        //System.out.println(max);
        //find min speed using binary search
        int l=1;
        int r=max;
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            int tHour=compute(piles,mid);
            if(tHour<=h){
                //ans=mid; //speed
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        //l=ans
        return l;
    }
}
