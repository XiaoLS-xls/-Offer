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
    public int[] levelOrder(TreeNode root) {
		//队列实现层序遍历
        if(root==null) return new int[0];
        List<Integer> al = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode t = q.poll();	//出队
            al.add(t.val);		//记录
            if(t.left != null) q.offer(t.left);		//左儿子
            if(t.right != null) q.offer(t.right);	//右儿子
        }
        int[] re = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            re[i] = al.get(i);
        }
        return re;
    }
}