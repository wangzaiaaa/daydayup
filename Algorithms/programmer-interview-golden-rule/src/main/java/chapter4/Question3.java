package chapter4;

import top.zw.datastruct.tree.TreeNode;

public class Question3 {

    /**
     * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length < 1) return null;
        return getRoot(nums,0,nums.length - 1);
    }

    private TreeNode getRoot(int [] nums,int l,int r){
        if(l > r) return null;
        else if(l == r) return new TreeNode(nums[l]);
        else{
            int mid = l + (r - l) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = getRoot(nums,l,mid - 1);
            node.right = getRoot(nums,mid + 1,r);
            return node;
        }
    }
}
