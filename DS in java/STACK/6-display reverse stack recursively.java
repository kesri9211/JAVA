Stack<Integer>st=new Stack<>();
void display(st){
  if(st.isempty()) return; //base case
  int top=st.pop();
  System.out.println(top+" ");
  display(st); //recursive call
  st.push(top); //again push into stack
}
  
