package chapter1;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Question2
 * @createTime 2021年12月14日 20:42:29
 **/
public class Question2 {

    /**
     * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
     *
     * 示例 1：
     *
     * 输入: s1 = "abc", s2 = "bca"
     * 输出: true
     * 示例 2：
     *
     * 输入: s1 = "abc", s2 = "bad"
     * 输出: false
     * 说明：
     *
     * 0 <= len(s1) <= 100
     * 0 <= len(s2) <= 100
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/check-permutation-lcci
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s1
     * @param s2
     * @return
     */
    public boolean CheckPermutation(String s1, String s2) {
        if(s1 == null && s2 == null) return true;
        else if(s1 == null || s2 == null || s1.length() != s2.length()) return false;
        int [] map = new int[256];
        for(int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i),c2 = s2.charAt(i);
            map[c1]++;
            map[c2]--;
        }
        for(int i = 0; i < 256; i++){
            if(map[i] != 0) return false;
        }
        return true;
    }
}
