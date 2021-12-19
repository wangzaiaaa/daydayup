package integer;

/**
 * <p>二进制加法：输入2个二进制字符串，计算它们的和
 *
 * </p>
 */
public class Question2 {

    /**
     * @param a String
     * @param b String
     * @return a + b
     */
    public String addBinary(String a, String b) {
        if (a == null && b == null) {
            return "";
        } else if (a == null || b == null) {
            return a + b;
        }
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = (i >= 0) ? (a.charAt(i--) - '0') : 0;
            int d2 = (j >= 0) ? (b.charAt(j--) - '0') : 0;
            sb.append((d1 + d2 + carry) % 2);
            carry = (d1 + d2 + carry) / 2;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Question2().addBinary("101010","010111"));
    }
}
