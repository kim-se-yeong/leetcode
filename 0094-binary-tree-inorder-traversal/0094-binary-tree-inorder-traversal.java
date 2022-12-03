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
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        DFS(root, list);
        return list;
    }
    
    public void DFS(TreeNode root, List<Integer> list) {
        
        if (root != null) {
            //왼쪽으로 가기
            DFS(root.left, list);
            //중위순회
            list.add(root.val);
            //오른쪽으로 가기
            DFS(root.right, list);
        }
    }
}