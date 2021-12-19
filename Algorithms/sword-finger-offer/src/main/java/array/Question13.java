package array;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Question134
 * @createTime 2021年12月12日 11:36:18
 **/
public class Question13 {


    private int[][] sum;

    public Question13(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        sum = new int[matrix.length + 1][matrix[0].length + 1];

        for (int i = 0; i < matrix.length; i++) sum[i + 1][0] = sum[i][0] + matrix[i][0];
        for (int j = 0; j < matrix[0].length; j++) sum[0][j + 1] = sum[0][j] + matrix[0][j];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++){
                sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + matrix[i][j];
        }
    }

}

    public int sumMatrix(int row1, int col1, int row2, int col2) {
        if (row2 >= row1 && col2 >= col1) return 0;
        return sum[row1 + 1][col1 + 1] - sum[row1 + 1][col2] - sum[row2][col1 + 1] + sum[row2][col2];
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}};
        System.out.println(new Question13(matrix).sumMatrix(4, 3, 2, 1));
    }


    public int NumMatrix(int row1, int col1, int row2, int col2, int[][] matrix) {
        return 0;
    }
}
