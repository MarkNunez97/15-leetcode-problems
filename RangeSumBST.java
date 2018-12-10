package edu.utep.cs.cs1290.fifteen;

/*
Example 1:

Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
Example 2:

Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23
*/

public class RangeSumBST {

	 int ans;
	    public int range(TreeNode root, int L, int R) {
	        ans = 0;
	        dfs(root, L, R);
	        return ans;
	    }

	    public void dfs(TreeNode node, int L, int R) {
	        if (node != null) {
	            if (L <= node.val && node.val <= R)
	                ans += node.val;
	            if (L < node.val)
	                dfs(node.left, L, R);
	            if (node.val < R)
	                dfs(node.right, L, R);
	        }
	    }
}
