/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 
Example 1:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
*/
//approach: decrease column when target is smaller and increase row when target is greater.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0; int j=m-1;
        while(i>=0 && j>=0 && i<n && j<m ){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]<target){
                i++; //target may be in down side
            }
            else{
                j--; //target may be in left side
            }
        }
        return false;
    }
}
