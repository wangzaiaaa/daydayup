package day1;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Question704
 * @createTime 2021年12月13日 20:24:53
 **/
public class Question704 {

    /**
     * 二分查找
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if(nums == null || nums.length < 1) return -1;
        int l = 0,r = nums.length - 1;
        while(l <= r){
            int mid = l + ((r-l) >> 1);
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    public int [] CheckPermutation(String s1, String s2) {
        if(s1 == null && s2 == null) return null;
        else if(s1 == null || s2 != null || s1.length() != s2.length()) return null;
        int [] map = new int[256];
        for(int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i),c2 = s2.charAt(i);
            map[c1]++;
            map[c2]--;
        }

        return map;
    }

    public static void main(String[] args) {
        int [] array = new Question704().CheckPermutation("abc","bac");
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                System.out.println(i + " " + (char)array[i]);
            }
        }
    }
}
