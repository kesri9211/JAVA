class MyStack {
    Queue<Integer>q=new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        //1 2 3 4 
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
        // 4 1 2 3
        return q.remove();
    }
    
    public int top() {
        //1 2 3 4 
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
        // 4 1 2 3
        int val=q.peek(); //4
        q.add(q.remove());
        return val;
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
