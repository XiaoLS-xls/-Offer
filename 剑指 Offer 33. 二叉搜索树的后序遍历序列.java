class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int i, int j) {           //[i,j]
        if(i >= j) return true;
        int p = i;          //后序的根节点
        while(postorder[p] < postorder[j]) p++;         //找到分割点
        int m = p;
        while(postorder[p] > postorder[j]) p++;         //看后边的节点是否对（大于根节点）
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}

