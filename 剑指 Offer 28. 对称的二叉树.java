/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null ? true : rec(root.left,root.right);
    }
    public boolean rec(TreeNode L,TreeNode R){
        if(L==null && R==null) return true;     //都为空
        if(L==null || R==null || L.val != R.val) return false;      //不对称
        return rec(L.left,R.right) && rec(L.right,R.left);              //太秒了（当前节点对称，往下层继续比对，对比最左节点和最右节点的最左节点和最右节点【对称的】）
     }
}