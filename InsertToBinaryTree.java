package edu.utep.cs.cs1290.fifteen;
/*
Given the tree:
    4
   / \
  2   7
 / \
1   3
And the value to insert: 5

You can return this binary search tree:

         4
       /   \
      2     7
     / \   /
    1   3 5
*/
public class InsertToBinaryTree {
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null) {
		return new TreeNode(val);
		}
		if (root.val > val) {
		root.left = insertIntoBST(root.left, val);
		} else {
		root.right = insertIntoBST(root.right, val);
		}
		return root;
		}

}
