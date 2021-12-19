package array;

/**
 * 排序数组中两个数字之和
 */
public class Question6 {

    public int [] twoSum(int [] numbers,int target){
        if(numbers == null || numbers.length == 0) return new int[]{-1,-1};
        int i = 0,j = numbers.length - 1;
        while (i < j){
            if(numbers[i] + numbers[j] > target){
                j--;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else{
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,6,10};
        int [] res = new Question6().twoSum(arr,8);
        System.out.println("index1：" + res[0] + " index2：" + res[1]);
    }
}
