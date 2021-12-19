package integer;

/**
 * <p>整数除法：输入2个int整数，他们进行除法计算并返回商，要求不使用*，/，%，
 * 当发生溢出时，返回整数的最大值
 * </p>
 */
public class Question1 {


    public int divide(int divided, int divisor) {

        if (divisor == 0 || divided == 0) {
            throw new IllegalArgumentException("被除数和除数不能为0");
        }

        //只有这种情况会发生溢出
        if (divided == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        //将除数和被除数转换符号
        int isNegative = 2;
        if (divided > 0) {
            isNegative--;
            divided = -divided;
        }

        if (divisor > 0) {
            isNegative--;
            divisor = -divisor;
        }

        int ret = doDivided(divided, divisor);
        return isNegative == 1 ? -ret : ret;
    }

    private int doDivided(int divided, int divisor) {
        int ret = 0;
        while (divided <= divisor) {
            int value = divisor, x = 1;
            while (divisor >= Integer.MIN_VALUE / 2 && divided <= (value + value)) {
                value += value;
                x += x;
            }
            divided -= value;
            ret += x;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new Question1().divide(15,-7));
    }
}
