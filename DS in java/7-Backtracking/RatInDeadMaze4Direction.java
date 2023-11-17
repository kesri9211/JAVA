package Backtracking;
    /*there are some block path where rat can not go, find total
    way to reach to destination. block path is represented by 0 otherwise 1
     */

/*m1--same as RatInMaze4Direction ie use isVisited for checkmark + maze[][] will be give
just like RatInDeadMaze but space complexity will be O(n*m)
*/
/*m2-- without using extra space make changes in maze[][] itself*/
public class RatInDeadMaze4Direction {
        public static void main(String[] args) {
            int rows=3;
            int cols=4;
            int maze[][]={
                    {1,0,1,1},
                    {1,1,1,1},
                    {1,1,0,1}
            };
            //print total path
            print(maze,0,0,rows-1,cols-1,"");
        }
    private static void print(int maze[][],int sr, int sc, int er, int ec, String s) {
        if(sr<0 || sc<0) return;
        if(sr>er||sc>ec)return;
        if (maze[sr][sc]==0) return;//cell blocked hai
        if(maze[sr][sc]==-1)return;// already visited
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        maze[sr][sc]=-1;//check mark--> visited
        //go right
        print(maze,sr,sc+1,er,ec,s+"R");
        //go down
        print(maze,sr+1,sc,er,ec,s+"D");
        //go up
        print(maze,sr-1,sc,er,ec,s+"U");
        //go left
        print(maze,sr,sc-1,er,ec,s+"L");
        //backtracking
        maze[sr][sc]=1;
    }
}