package chapter8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question4 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if(nums == null || nums.length < 1) return res;
        int n = 1 << nums.length;
        for (int i = 0; i < n; i++){
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j < nums.length; j++){
                if((1 & (i >> j)) == 1){
                    cur.add(nums[j]);
                }
            }
            res.add(new ArrayList<>(cur));
        }
        return res;
    }




}
