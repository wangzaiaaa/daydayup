package array;

import java.util.Arrays;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Question12
 * @createTime 2021年12月12日 11:18:11
 **/
public class Question12 {

    /**
     * 左右2边子数组的和相等
     * @param nums
     * @return
     */
    public int pivotIndex(int [] nums){
        if(nums == null || nums.length == 0) return -1;
        int sum = Arrays.stream(nums).sum();
        int current = 0;
        for (int i = 0; i < nums.length; i++){
            current += nums[i];
            if(current - nums[i] == sum - current) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,7,3,6,2,9};
        System.out.println(new Question12().pivotIndex(arr));
    }
}
