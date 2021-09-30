class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {


    //模拟栈
        Stack<Integer> A = new Stack<Integer>();
        int index = 0;
        for(int num: pushed){
            A.push(num);
            while(!A.isEmpty() && A.peek()==popped[index]){
                A.pop();
                index++;
            }
        }
        return A.isEmpty();

    }

    //方法2
        //保留在栈内没有输出的元素输出的顺序一定是逆序
        //那么就可以检查每一个出栈的元素，在入栈的顺序中在该元素前边的元素一定都是逆序（没有被访问的元素，visited数组标记）
}