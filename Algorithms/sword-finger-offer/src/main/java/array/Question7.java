package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 数组中和为0的三个数字
 */
public class Question7 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if (nums.length <= 3) return res;
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length -2){
            twoSum(nums, i + 1, -nums[i], res);
            int tmp = nums[i];
            while (i < nums.length - 2 && nums[i] == tmp) i++;
        }
        return res;
    }

    private List<Integer> twoSum(int[] nums, int startIndex, int target, List<List<Integer>> res) {
        List<Integer> list = new ArrayList<Integer>();
        int i = startIndex, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
               res.add(Arrays.asList(nums[i],nums[j],-target));
               int tmp = nums[i];
               while (i < j && nums[i] == tmp) i++;
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, -5};
        List<List<Integer>> res = new Question7().threeSum(arr);
        System.out.println(res);
    }
}


