class MyQueue {
     private Stack<Integer> first;
     private Stack<Integer> Second;

    public MyQueue() {
        //so basically we are using 2 stacks make it work like queue by     shifting elements
      
      first  = new Stack<>();
      Second = new Stack<>();
    }
    
    public void push(int x) {
       first.push(x);
    }
    
    public int pop() {
       shiftStacks();
       return Second.pop();
    }
    
    public int peek() {
      shiftStacks();
      return Second.peek();
    }
    
    public boolean empty() {
        //if both are empty
        return first.isEmpty() && Second.isEmpty();
    }

    private void shiftStacks(){
        if(Second.isEmpty()){
            //move all elements from first to Second
            while(!first.isEmpty()){
                Second.push(first.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
