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
    public boolean isSubStructure(TreeNode A, TreeNode B) { 
        //先序遍历A子树，与B树进行匹配
        if(A==null && B==null) return true;
        if(A==null || B==null) return false;
        if(A.val==B.val){
            if(isSame(A,B)){
                return true;
            } 
        }
        if(isSubStructure(A.left,B) || isSubStructure(A.right,B)){
            return true;
        }else{
            return false;
        }
    }
    public boolean isSame(TreeNode a,TreeNode b){   
        //判断两个子树是否相同（没有要求底部节点也相同）
        if(a==null && b==null) return true;
        if(b==null) return true;    //b树更小
        if(a==null) return false;   //a树没有包含b树
        if(a.val != b.val) return false;
        return isSame(a.left,b.left) && isSame(a.right,b.right);
    }
}