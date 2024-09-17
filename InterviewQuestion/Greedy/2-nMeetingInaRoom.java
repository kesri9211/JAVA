/*
ou are given timings of n meetings in the form of (start[i], end[i]) where start[i] is the start time of meeting i and end[i] is the finish time of meeting i. Return the maximum number of meetings that can be accommodated in a single meeting room, when only one meeting can be held in the meeting room at a particular time. 

Note: The start time of one chosen meeting can't be equal to the end time of the other chosen meeting.

Examples :

Input: n = 6, start[] = [1, 3, 0, 5, 8, 5], end[] =  [2, 4, 6, 7, 9, 9]
Output: 4
Explanation: Maximum four meetings can be held with given start and end timings. The meetings are - (1, 2), (3, 4), (5,7) and (8,9)*/

// Class to represent meeting data-start, end
class data {
    int start;
    int end;

    data(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

// Comparator to sort the meetings by end time
class meetingComparator implements Comparator<data> {
    @Override
    public int compare(data o1, data o2) {
        if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        
        return 0; // Returning 0 if end times are equal
    }
}

// Solution class to find the maximum number of meetings
class Solution {
    // Function to find the maximum number of meetings that can be performed in a meeting room
    public int maxMeetings(int n, int start[], int end[]) {
        // Create an array of data class
        data arr[] = new data[n];

        // Initialize each element with start and end times
        for (int i = 0; i < n; i++) {
            arr[i] = new data(start[i], end[i]);
        }

        // Sort the meetings based on their end time using the comparator
        Arrays.sort(arr, new meetingComparator());

        // Count the first meeting and set its end time as the free time
        int count = 1;
        int freeTime = arr[0].end;

        // Iterate through the sorted meetings and count the ones that can be scheduled
        for (int i = 1; i < n; i++) {
            if (arr[i].start > freeTime) {
                count++;
                freeTime = arr[i].end;
            }
        }
        return count;
    }
}
