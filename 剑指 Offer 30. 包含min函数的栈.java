class MinStack {
    Stack<Integer> A;
    Stack<Integer> B;
    /** initialize your data structure here. */
    public MinStack() {
        A = new Stack<>();      //正常栈
        B = new Stack<>();      //存储当前的最小元素的栈（递减的栈，每次进来的都是当前栈的最小元素）
    }
    
    public void push(int x) {
        A.add(x);
        if(B.empty() || x<=B.peek()) B.push(x);
    }
    
    public void pop() {
        if(A.peek().equals(B.peek())) B.pop();
        A.pop();
    }
    
    public int top() {
        return A.peek();
    }
    
    public int min() {
        return B.peek();
    }
}
