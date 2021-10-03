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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        if(root==null) return ll;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int b = 1;
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            for(int i=q.size(); i>0; i--){
                TreeNode temp = q.poll();
                l.add(temp.val);
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            if(b==0){
                Collections.reverse(l);     //为0时反转(在原来层序遍历的基础上加了一个反转)
            }
            ll.add(l);
            b = (b+1)%2;
        }
        return ll;
    }
}