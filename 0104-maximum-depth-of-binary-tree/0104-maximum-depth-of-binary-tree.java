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
    static int maxD(TreeNode root){
        if(null == root){

            return 0;
        }

       return 1 + Math.max(maxD(root.left),maxD(root.right));
    }
    public int maxDepth(TreeNode root) {
        
        return maxD(root);
    }
}