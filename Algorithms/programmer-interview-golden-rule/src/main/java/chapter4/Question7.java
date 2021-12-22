package chapter4;

import top.zw.datastruct.tree.TreeNode;

public class Question7 {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null) return null;
        TreeNode node = inorderSuccessor(root.left,p);
        if(node != null) return node;
        if(root.val > p.val) return root;
        return inorderSuccessor(root.right,p);
    }
}
