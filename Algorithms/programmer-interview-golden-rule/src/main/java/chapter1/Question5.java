package chapter1;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Question5
 * @createTime 2021年12月14日 21:00:35
 **/
public class Question5 {

    /**
     * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
     *
     * 示例1:
     *
     *  输入：s1 = "waterbottle", s2 = "erbottlewat"
     *  输出：True
     * 示例2:
     *
     *  输入：s1 = "aa", s2 = "aba"
     *  输出：False
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/string-rotation-lcci
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s1
     * @param s2
     * @return
     */
    public boolean isFlipedString(String s1, String s2) {
        if(s1 == null && s2 == null) return false;
        else if(s1 == null || s2 == null) return false;
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }
}
