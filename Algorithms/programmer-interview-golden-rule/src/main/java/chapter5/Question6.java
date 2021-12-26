package chapter5;

public class Question6 {

    public int convertInteger(int A, int B) {
        int res = 0;
        for (int i = 0; i <= 31; i++){
            res += ((A >> i) & 1) ^ ((B >> i) & 1);
        }
        return res;
    }



}
