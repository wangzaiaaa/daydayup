package chapter4;

import top.zw.datastruct.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question6 {

    public boolean isValidBST(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        for (int i = 1; i < list.size(); i++){
            if(list.get(i) <= list.get(i - 1)) return false;
        }
        return true;
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        else if(root.left == null) {
            list.add(root.val);
            inOrder(root.right,list);
        }else{
            inOrder(root.left,list);
            list.add(root.val);
            inOrder(root.right,list);
        }
    }
}
