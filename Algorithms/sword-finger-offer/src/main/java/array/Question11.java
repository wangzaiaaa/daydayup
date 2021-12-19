package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Question11
 * @createTime 2021年12月11日 15:52:05
 **/
public class Question11 {

    /**
     * 0和1个数相同的子数组的最大长度
     *
     * @param nums
     * @return
     */
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length < 1) return 0;
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        int sum = 0, res = 0;
        sumIndexMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            sum += (num == 0) ? -1 : 1;
            if (sumIndexMap.containsKey(sum)) {
                res = Math.max(res, i - sumIndexMap.get(sum));
            }else{
                sumIndexMap.put(sum,i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {1,0,1,0,0,1};
        System.out.println(new Question11().findMaxLength(arr));
    }
}
