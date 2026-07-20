import javax.swing.tree.TreeNode;

public class kthSmallestElement {
    static int ans;
    static int k2;

    public static void main(String[] args) {

    
    private static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        k2--;
        if(k2 == 0) ans= root.val;
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        k2=k;
        ans= -1;
        inorder(root);
        return ans;
    }

    }
}

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int total = m * n;

        k %= total;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(0);
            }

            ans.add(row);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int oldIndex = i * n + j;

                int newIndex = (oldIndex + k) % total;

                int newRow = newIndex / n;
                int newCol = newIndex % n;

                ans.get(newRow).set(newCol, grid[i][j]);
            }
        }

        return ans;
    }
}