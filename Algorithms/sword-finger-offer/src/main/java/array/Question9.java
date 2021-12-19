package array;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Question9
 * @createTime 2021年12月09日 21:18:06
 **/
public class Question9 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        int current = 1,res = 0;
        int l = 0;
        for (int r = 0; r < nums.length; r++){
            current *= nums[r];
            while (l <= r && current >= k){
                current /= nums[l++];
            }
            res += r >= l ? r - l + 1 : 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] array = {10,5,2,6};
        System.out.println(new Question9().numSubarrayProductLessThanK(array,100));
    }
}
