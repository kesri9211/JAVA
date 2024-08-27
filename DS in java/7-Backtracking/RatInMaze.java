package Backtracking;
//travel in two direction only ----right and down   using recursion
public class RatInMaze1 {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        int count=maze(1,1,rows,cols);
        System.out.println(count);
        //print total paths
        print(1,1,rows,cols,"");
    }
    private static int maze(int sr, int sc, int er, int ec) {
        //base case
        if(sc>ec || sr>er) return 0;
        if(sr==er && sc==ec) return 1;
        //recursion call
        int righways=maze(sr,sc+1,er,ec);
        int downways=maze(sr+1,sc,er,ec);
        int totalways=downways+righways;
        //return
        return totalways;
    }

    private static void print(int sr, int sc, int er, int ec, String s) {
        if(sr>er||sc>ec)return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        //go right
        print(sr,sc+1,er,ec,s+"R");
        //go down
        print(sr+1,sc,er,ec,s+"D");
    }
}

//using dp 
class Solution {
    public int path(int sr,int sc, int er,int ec,int dp[][]){
        if(sr>er || sc>ec)return 0;
        if(sr==er && sc==ec)return 1;
        //if already visited
        if(dp[sr][sc]!=0)return dp[sr][sc];
        //recursive call
        int down=path(sr+1,sc,er,ec,dp);
        int right=path(sr,sc+1,er,ec,dp);
        //store visited path
        return dp[sr][sc]=down+right;

    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];

        return(path(0,0,m-1,n-1,dp));
    }
}

//--------m2-------
/*You are standing on a point (x, y) and you want to go to origin (0, 0) by taking steps either
    left or up i.e. from each point you are allowed to move either in (x-1, y) or (x, y-1). Find the number of paths from point to origin.*/
   int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=(dp[i-1][j]+dp[i][j-1])%1000000007;
                }
            }
        }
        return dp[n][m];
