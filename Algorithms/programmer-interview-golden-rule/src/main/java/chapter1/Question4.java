package chapter1;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Question4
 * @createTime 2021年12月14日 20:53:23
 **/
public class Question4 {

    /**
     * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
     * <p>
     * 示例1:
     * <p>
     * 输入："aabcccccaaa"
     * 输出："a2b1c5a3"
     * 示例2:
     * <p>
     * 输入："abbccd"
     * 输出："abbccd"
     * 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/compress-string-lcci
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param S
     * @return
     */
    public String compressString(String S) {
        if (S == null || S.length() < 1) return S;
        int l = 0;
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < S.length(); r++) {
            if (S.charAt(r) != S.charAt(l)) {
                sb.append(S.charAt(l));
                sb.append(r - l);
                l = r;
            }
        }
        sb.append(S.charAt(l));
        sb.append(S.length() - l);
        String res = sb.toString();
        return res.length() < S.length() ? res : S;
    }
}
