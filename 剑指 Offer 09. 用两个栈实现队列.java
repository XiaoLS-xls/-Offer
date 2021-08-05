class CQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        // 如果第二个栈为空
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());              //在第二个栈中存一些正序的元素，等待删除
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }
}
// class CQueue {
                                    //有问题？？？？？？？？？？？？
//     private int a = 0;          //a为0表示数值在s1中(逆序,方便插入),a为1表示在s2中(顺序，方便删除)
                                //每一次切换时都会倒置栈的调整
//     Deque<Integer> stack1;
//     Deque<Integer> stack2;
//     public CQueue() {
//         stack1 = new LinkedList<Integer>();
//         stack2 = new LinkedList<Integer>();
//     }

//     public void appendTail(int value) {
//         if(a==0){
//             stack1.push(value);
//         }else{
//             while (!stack2.isEmpty()){
//                 stack1.push(stack2.pop());
//             }
//             stack1.push(value);
//             a = 1;
//         }
//     }

//     public int deleteHead() {
//         if(a==0){
//             while (!stack1.isEmpty()){
//                 stack2.push(stack1.pop());
//             }
//             if(stack2.isEmpty()) return -1;
//             a = 1;
//         }
//         return stack2.pop();
//     }
// }
