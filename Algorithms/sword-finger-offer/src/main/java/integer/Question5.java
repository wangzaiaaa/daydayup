package integer;

/**
 * 单词长度的最大乘积
 */
public class Question5 {

    public int maxProduct(String [] words){
        if(words == null || words.length == 0){
            return 0;
        }

        // flags[i][j]表示字符串words[i]是否含有字母(char)('a' + j);
        boolean [][] flags = new boolean[words.length][26];

        // 初始化flags[][]
        for (int i = 0; i < words.length; i++){
            String str = words[i];
            if(str == null || str.length() == 0) continue;
            for (int j = 0; j < str.length(); j++){
                flags[i][str.charAt(j) - 'a'] = true;
            }
        }

        int res = 0;
        for (int i = 0; i < words.length; i++){
            for (int j = i + 1; j < words.length; j++){
                boolean contains = false;
                for (int k = 0; k < 26; k++){
                    if(flags[i][k] && flags[j][k]) {
                        contains = true;
                        break;
                    }
                }
                if(!contains){
                    res = Math.max(res,words[i].length() * words[j].length());
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String [] array = {"abcw","foo","bar","fxyz","abcdrf"};
        System.out.println(new Question5().maxProduct(array));

    }


}
