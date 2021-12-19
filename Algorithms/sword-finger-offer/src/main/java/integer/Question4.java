package integer;

/**
 * <p>只出现一次的数字：
 * 输入一个数组，数组只有一个数字出现了一次，而其他数字都出现了3次，请找出那个只出现了一次的数字
 * </p>
 */
public class Question4 {

    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] bitSums = new int[32];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 31; j >= 0; j--) {
                bitSums[j] += 1 & (num >> j);
            }
        }
        int res = 0;
        for (int i = 0; i < bitSums.length; i++) {
            if (bitSums[i] % 3 != 0) {
                res += (1 << i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] array = {1,1,1,0,0,0,100};
        System.out.println(new Question4().singleNumber(array));
    }
}
