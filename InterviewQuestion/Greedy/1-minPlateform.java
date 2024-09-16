/*
Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for the railway station so that no train is kept waiting.
Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, same platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms.

Note: Time intervals are in the 24-hour format(HHMM) , where the first two characters represent hour (between 00 to 23 ) and the last two characters represent minutes (this will be <= 59 and >= 0).

Examples:

Input: arr[] = [0900, 0940, 0950, 1100, 1500, 1800], 
            dep[] = [0910, 1200, 1120, 1130, 1900, 2000]
Output: 3

approach: observe time and count when arr time is less than departure(means train needs platform)
sort both before
*/
class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0;
        int c=1;
        int max=1;
        while(i<arr.length && j<arr.length){
            if(arr[i]<=dep[j]){
                c++;
                i++;
            }
            else{
                c--;
                j++;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}
