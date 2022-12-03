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
    
    List<Integer> list = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        DFS(root);
        return list;
    }
    
    public void DFS(TreeNode root) {
        if (root != null) {
            //왼쪽으로 가기
            DFS(root.left);
            //오른쪽으로 가기
            DFS(root.right);
            list.add(root.val);
        }
    }
}