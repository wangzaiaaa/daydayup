package chapter4;

import top.zw.datastruct.tree.TreeNode;

public class Question5 {

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return Math.abs(height(root.left)-height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode node){
        return node == null ? 0 : 1 + Math.max(height(node.left),height(node.right));
    }
}
