/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        
        int result = DFS(root);
        if (result == -1) return false;
        
        return true;
    }
    
    public int DFS(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            //왼쪽으로 이동
            int left = DFS(root.left);
            //오른쪽으로 이동
            int right = DFS(root.right);

            if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
                return -1;
            }
            return Math.max(left, right) + 1;
        }
    }
}