//solve the sudoku
/*
Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.
*/
class Solution {
    static int check=0; //global variable to prevent backtracking when we got answer
    public void solve(char[][] board,int row,int col){
            if(row==9 ){ 
                //copy to grid becaue board will be empty when return because of backtracking or
                check=1;
                return;
            }
            else if(board[row][col]!='.'){
                if(col!=8) solve(board,row,col+1); //move in column
                else solve(board,row+1,0); //move to next row
            }
            else{ //board[i][j]=='.'    
                for(char c='1';c<='9';c++){ //choose correct number from 1-9
                    if(isValid(board,row,col,c)){
                        board[row][col]=c;
                        if(col!=8) solve(board,row,col+1); //move in column
                        else solve(board,row+1,0); //move to next row
                        
                        if(check==1)return;
                        board[row][col]='.'; //backtracking                        
                    }
                }
            }
    }
    public boolean isValid(char[][] board,int row,int col,char num){
        //check in row
        for(int j=0;j<9;j++){
            if(board[row][j]==num) return false;
        }
        //check in column
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        //check in 3*3 matrix
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        //char[][] grid=new char[9][9];
        solve(board,0,0);
        check=0;
        // for(int i=0;i<9;i++){
        //     for(int j=0;j<9;j++){
        //         board[i][j]=grid[i][j];
        //     }
        // }
    }
}
