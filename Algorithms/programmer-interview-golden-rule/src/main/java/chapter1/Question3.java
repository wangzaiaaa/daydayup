package chapter1;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Question3
 * @createTime 2021年12月14日 20:43:07
 **/
public class Question3 {

    /**
     * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
     *
     *  
     *
     * 示例 1：
     *
     * 输入："Mr John Smith    ", 13
     * 输出："Mr%20John%20Smith"
     * 示例 2：
     *
     * 输入："               ", 5
     * 输出："%20%20%20%20%20"
     *  
     *
     * 提示：
     *
     * 字符串长度在 [0, 500000] 范围内。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/string-to-url-lcci
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param S
     * @param length
     * @return
     */
    public String replaceSpaces(String S, int length) {
        if(S == null || S.length() == 0) return S;
        int numsOfSpace = 0;
        for (int i = 0; i < length; i++){
            if(S.charAt(i) == ' ') numsOfSpace++;
        }
        char [] charArray = new char[length + numsOfSpace * 2];
        int index = 0;
        for (int i = 0; i < length; i++){
            char c = S.charAt(i);
            if(c != ' ') charArray[index++] = c;
            else{
                charArray[index++] = '%';
                charArray[index++] = '2';
                charArray[index++] = '0';
            }
        }
        return String.copyValueOf(charArray);
    }
}
