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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lst=new ArrayList<>();
        dfs(root,"",lst);
        return lst;
        
    }
    public void dfs(TreeNode node,String path,List<String> lst){
        if(node==null) return;
        if(path.isEmpty()){
            path=String.valueOf(node.val);
        }else{
                path=path+"->"+node.val;
        }
        if(node.left==null &&node.right==null){
            lst.add(path);
            return;
        }
        dfs(node.left,path,lst);
        dfs(node.right,path,lst);
    }
}