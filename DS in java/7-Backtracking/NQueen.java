/*The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

 */
package Backtracking;

public class nQueen {
    public static void main(String[] args) {
        int n=4;
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueen(board,0);
    }
    static void nQueen(char board[][],int row){
        int n=board.length;
            //base case
            if(row==n){
                //print
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++) {
                        System.out.print(board[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
                return;
            }
        //traver in column of each row and find safe position for queen
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q'; //place queen
                nQueen(board,row+1);//move to next row
                board[row][j]='.'; //backtracking
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n=board.length;
        //check row
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        //check column
        for (int i=0;i<n;i++){
            if(board[i][col]=='Q')return false;
        }
        //check diagonal
        //check north-east
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        //check south-east i++ j++
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        //checking south-west i++ j--
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        //checking north-west i-- j--
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;
    }
}
