package Backtracking;

public class FourDirRatMaze {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        boolean isVisited[][]=new boolean[rows][cols];
        //int count=maze(1,1,rows,cols);
        //System.out.println(count);
        //print total path
        print(0,0,rows-1,cols-1,"",isVisited);
    }
    private static void print(int sr, int sc, int er, int ec, String s,boolean isVisited[][]) {
        if(sr<0 || sc<0) return;
        if(sr>er||sc>ec)return;
        if(isVisited[sr][sc]==true) return; //v imp
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        //go right
        print(sr,sc+1,er,ec,s+"R",isVisited);
        //go down
        print(sr+1,sc,er,ec,s+"D",isVisited);
        //go up
        print(sr-1,sc,er,ec,s+"U",isVisited);
        //go left
        print(sr,sc-1,er,ec,s+"L",isVisited);
        //backtracking
        isVisited[sr][sc]=false;
    }
}
