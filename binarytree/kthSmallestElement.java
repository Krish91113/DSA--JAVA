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

import java.util.Arrays;

class Solution {
    // 1. Keep it non-static so it resets every test case
    private long[][] dp;

    public long solve(int i, int[] nums, int flag) {
        if (i >= nums.length) return 0;
        if (dp[i][flag] != -1) return dp[i][flag];
        long skip = solve(i + 1, nums, flag);
        long val = nums[i];
        if (flag == 0) { 
            val = -val;
        }
        long take = solve(i + 1, nums, 1 - flag) + val;
        return dp[i][flag] = Math.max(take, skip);
    }

    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        dp = new long[n][2];         
        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }        
        return solve(0, nums, 1); 
    }
}
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n==1 || n==2) return n;
        int ans =1;
        while(ans<=n){
            ans*=2;
        }
        return ans;
    }
}