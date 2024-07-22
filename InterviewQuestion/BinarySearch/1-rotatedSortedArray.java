class Solution {
    public boolean search(int[] nums, int target) {
        //approach- binary search
        /*
        atleast one part will be sorted in rotated sorted array
        seach between sorted part of array st-mid or mid-end
        */
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            //System.out.println(mid);
            if(nums[mid]==target) return true;
            
            if(nums[st]==nums[mid] && nums[mid]==nums[end]) { //necessary condition for duplicate element
                st++; 
                end--;
                continue;
            }
            if(nums[mid]<=nums[end]){ //mid-end is sorted
            //find target here
                if(target>nums[mid] && target<=nums[end])
                    st=mid+1;
                
                else    
                    end=mid-1;
            }
            else{ //st to mid is sorted
                if(target>=nums[st] && target<nums[mid])
                    end=mid-1;
                else
                    st=mid+1;
            }
            
        }
        return false;
    }
}
