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
