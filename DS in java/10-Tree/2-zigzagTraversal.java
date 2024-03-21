/*Given a binary tree with n nodes. Find the zig-zag level order traversal of the binary tree.

Example 1:

Input:
        1
      /   \
     2    3
    / \    /   \
   4   5 6   7
Output:
1 3 2 4 5 6 7
*/
class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer>ans=new ArrayList<>();
	    Queue<Node>q=new LinkedList<>();
	    if(root==null)
	    {
	        return ans;
	    }
	   q.offer(root);
	   boolean flag=true;
	   //use concept of level order traversal
	   while(!q.isEmpty()){
	       int size=q.size();
	       List<Integer>temp=new ArrayList<>();
       
	       //store each level in temp
	       while(size-->0){
	           Node n=q.remove();
	           temp.add(n.data);
	           if(n.left!=null){
	               q.add(n.left);
	           }
	           if(n.right!=null){
	               q.add(n.right);
	           }
	       }
	       if(flag){
	           for(int i:temp)
	                ans.add(i);
	       }
	       else{
	           Collections.reverse(temp);
	           for(int i:temp)
	                ans.add(i);
	       }
       //change flag to get zigzag row
	       flag=!flag;
	   }
	   return ans;
	   
	}
}
