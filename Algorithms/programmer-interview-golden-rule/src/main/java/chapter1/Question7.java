package chapter1;

public class Question7 {

    public boolean canPermutePalindrome(String s) {
        if(s == null || s.length() < 1) return true;
        byte [] arr = new byte[128];
        for (char c : s.toCharArray()){
            arr[c]++;
        }
        int num = 0;
        for (int i = 0; i < arr.length; i++){
            if((arr[i] & 1) != 0) num++;
        }
        return num <= 1;
    }
}
