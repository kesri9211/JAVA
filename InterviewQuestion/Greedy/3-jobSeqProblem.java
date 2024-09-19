/*
Given a set of n jobs where each jobi has a deadline and profit associated with it.
Each job takes 1 unit of time to complete and only one job can be scheduled at a time. We earn the profit associated with a job if and only if the job is completed by its deadline.
Find the number of jobs done and the maximum profit.
Note: Jobs will be given in the form (Jobid, Deadline, Profit) associated with that Job. Deadline of the job is the time on or before which job needs to be completed to earn the profit.

Examples :
Input: Jobs = [[1,4,20],[2,1,1],[3,1,40],[4,1,30]]
Output: 2 60
Explanation: Job1 and Job3 can be done with maximum profit of 60 (20+40).
*/
class jobComparator implements Comparator<Job> {
    //@Override 
    public int compare(Job j1, Job j2) {
        if (j1.profit > j2.profit)
            return -1; // Sort by profit descending
        else if (j1.profit < j2.profit)
            return 1;
        else
            return 0;
    }
}

class Solution {
    // Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n) {
        // Sort jobs by profit in descending order
        Arrays.sort(arr, new jobComparator());
        
        // Find maximum deadline
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }
        
        // Array to track which day is occupied
        int[] ds = new int[maxDeadline + 1];
        Arrays.fill(ds, -1); // Initialize all days as empty
        
        int profit = 0, jobsDone = 0;
        
        // Iterate through each job
        for (int i = 0; i < n; i++) {
            // Find the latest available slot before the job's deadline
            for (int j = arr[i].deadline; j > 0; j--) {
                if (ds[j] == -1) {
                    ds[j] = arr[i].id; // Schedule the job on day j
                    profit += arr[i].profit; // Add profit of the job
                    jobsDone++; // Increment number of jobs done
                    break;
                }
            }
        }
        
        int[] result = { jobsDone, profit };
        return result;
    }
}
