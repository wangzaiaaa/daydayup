package chapter1;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Question1
 * @createTime 2021年12月14日 20:41:22
 **/
public class Question1 {

    /**
     * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
     *
     * 示例 1：
     *
     * 输入: s = "leetcode"
     * 输出: false
     * 示例 2：
     *
     * 输入: s = "abc"
     * 输出: true
     * 限制：
     *
     * 0 <= len(s) <= 100
     * 如果你不使用额外的数据结构，会很加分。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/is-unique-lcci
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param astr
     * @return
     */
    public boolean isUnique(String astr) {
        if(astr == null || astr.length() == 0) return true;
        int [] map = new int[256];
        for(char c : astr.toCharArray()){
            if(map[c] > 0) return false;
            map[c]++;
        }
        return true;
    }
}
