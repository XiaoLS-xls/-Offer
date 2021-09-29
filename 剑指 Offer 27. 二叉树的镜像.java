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
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;

        TreeNode temp = root.left;  //交换左右节点
        root.left = root.right;
        root.right = temp;

        mirrorTree(root.left);      //递归的将所有的左右都交换
        mirrorTree(root.right);

        return root;
    }
}