import javax.swing.tree.TreeNode;

public class depthTree {
    class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return  Math.max(maxDepth(root.left), maxDepth(root.right))+ 1; 
    }
}
}
private static void dfs(TreeNode root, ArrayList<Integer> ans){
        if(root == null ){
            return ;
        }
        ans.add(root.val);
        dfs(root.left,ans);
        dfs(root.right,ans);
    }