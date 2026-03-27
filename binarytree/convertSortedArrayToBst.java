
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return Node(nums,0,nums.length-1);
    }
    private static TreeNode Node(int[] nums,int i, int j){
        if(i > j){
            return null;
        }
        int mid = (i + j)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left=Node(nums,i,mid-1);
        node.right=Node(nums,mid+1,j);
        return node;
    }
}