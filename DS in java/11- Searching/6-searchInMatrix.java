/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

Example 1:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int st=0;
        int n=matrix.length;  //number of rows
        int m=matrix[0].length; //number of column
        int end=n*m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            //convert linear index into row and column 
            int r=mid/m;
            int c=mid%m;
            if(matrix[r][c]==target)
                return true;
            else if(matrix[r][c]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}
