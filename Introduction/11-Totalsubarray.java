/*
[0,0]= [0][0][0,0] = 3 subarray
Input:
8
13002004
Output:
6
Explanation:
There are 4 occurrences of [0] as a subarray.
There are 2 occurrences of [0,0] as a subarray.
There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.
*/
public class Main{
  public static int countZero(int[] nums){
    int count=0;//1
    int consecutiveZero=0;
    for (int num: nums){
      if(num==0) {
        consecutiveZero++;//4 
        count +=consecutiveZero;
      }
      else consecutiveZero=0;
    }
  }
}

