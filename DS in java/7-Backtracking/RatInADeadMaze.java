package Backtracking;
/*there are some block path where rat can not go, find total
way to reach to destination. block path is represented by 0 otherwise 1
 */
public class RatInADeadMaze {
    public static void main(String[] args) {
        int rows=4;
        int cols=6;
        int maze[][]={
                {1,0,1,1,1,1},
                {1,1,1,1,0,1},
                {0,1,1,1,1,1},
                {0,0,1,0,1,1}
        };
        //print total path
        print(maze,0,0,rows-1,cols-1,"");
    }
    private static void print(int maze[][],int sr, int sc, int er, int ec, String s) {
        if(sr>er||sc>ec)return;
        if(maze[sr][sc]==0)return; //return if cell is block
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        //go right
        print(maze,sr,sc+1,er,ec,s+"R");
        //go down
        print(maze,sr+1,sc,er,ec,s+"D");
    }
}
