package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Question10
 * @createTime 2021年12月11日 15:38:55
 **/
public class Question10 {

    /**
     * 和为k的子数组个数
     * @param nums
     * @param k
     * @return
     */
    public int subArraySum(int [] nums,int k){
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer,Integer> sumCountMap = new HashMap<Integer, Integer>();
        int res = 0,sum = 0;
        sumCountMap.put(0,1);
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            res += sumCountMap.getOrDefault(sum - k,0);
            sumCountMap.put(sum,sumCountMap.getOrDefault(sum,0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] array = {1,1,1};
        System.out.println(new Question10().subArraySum(array,2));
    }
}
