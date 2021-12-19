package integer;

/**
 * <p>
 *     前n个数字二进制形式中1的个数
 *     f(n) = f(n-1) + 1;
 * </p>
 */
public class Question3 {

    public int[] countBits1(int num){
        int [] res = new int[num + 1];
        for (int i = 1; i <= num; i++){
            int j = i;
            while (j != 0){
                res[i]++;
                j = j & (j - 1);
            }
        }
        return res;
    }

    public int[] countBits2(int num){
        int [] res = new int[num + 1];
        for (int i = 1; i <= num; i++){
            res[i] = res[i & (i-1)] + 1;
        }
        return res;
    }

    public int[] countBits3(int num){
        int [] res = new int[num + 1];
        for (int i = 1; i <= num; i++){
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }


}
