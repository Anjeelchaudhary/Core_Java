package Daily;

import javax.swing.tree.TreeNode;

public class ReverseTreeNode {
    public TreeNode invertTree(TreeNode root) {
        //corner case if the root is null 
        if(root == null) {
            return null;
        }

        TreeNode right = root.right;  //assigning right root
        TreeNode left = root.left;     //assigning left root
        root.right = invertTree(left);   //inverting right side into left side
        root.left = invertTree(right);   // inverting left side into right side
        return root;          
    }
    public static void main(String[] args) {
        // root = [4,2,7,1,3,6,9]
    }
}
