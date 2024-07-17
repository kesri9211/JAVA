/*
Given an unsorted array arr of size n of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.
Your task is to complete the function findTwoElement() which takes the array of integers arr and n as parameters and returns an array of integers of size 2 denoting the answer (The first index contains B and second index contains A)

Examples

Input: n = 2 arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and smallest positive missing number is 1.

s is the sum of all elements in the array.
s2 is the sum of squares of all elements in the array.
sn is the expected sum of the first 
s2n is the expected sum of squares of the first 

*/
class Solve {
    int[] findTwoElement(int arr[], int n) {
        long s = 0, s2 = 0;
        long sn = (n * (n + 1)) / 2;
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6;
        
        for (int i = 0; i < n; i++) {
            s += arr[i];
            s2 += (long) arr[i] * arr[i];
        }
        
        long val1 = s - sn; // x - y
        long val2 = (s2 - s2n) / val1; // x + y
        
        long x = (val1 + val2) / 2;
        long y = x - val1;
        
        return new int[]{(int)x, (int)y};
    }
}
