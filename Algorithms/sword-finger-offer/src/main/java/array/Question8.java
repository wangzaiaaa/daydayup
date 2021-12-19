package array;

/**
 * 和大于等于K的最短子数组
 */
public class Question8 {

    public int minSubArrayLen(int k,int [] nums){
        int res = Integer.MAX_VALUE;
        if(nums == null || nums.length == 0) return 0;
        int sum = 0,l = 0;
        for (int r = 0; r < nums.length; r++){
            sum += nums[r];
            while (l < r && sum >= k){
                res = Math.min(res,r - l + 1);
                sum -= nums[l++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public static void main(String[] args) {
        int [] array = {5,1,4,3};
        System.out.println(new Question8().minSubArrayLen(7,array));
    }
}
