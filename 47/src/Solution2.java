public class Solution2 {

    public int getMaxValue(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return 0;
        }
        int col = matrix[0].length;
        int[] dp = new int[col];
        dp[0] = matrix[0][0];

        for (int j = 1; j < col; j++) {
            dp[j] = dp[j - 1] + matrix[0][j];
        }
        for (int i = 1; i < row; i++) {
            dp[0] = dp[0] + matrix[i][0];
            for (int j = 1; j < col; j++) {
                dp[j] = Integer.max(dp[j], dp[j - 1]) + matrix[i][j];
            }
        }
        return dp[col - 1];
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 10, 3, 8},
                {12, 2, 9, 6},
                {5, 7, 4, 11},
                {3, 7, 16, 5}
        };
        Solution2 solution2 = new Solution2();
        int maxValue = solution2.getMaxValue(matrix);
        System.out.println(maxValue);
    }
}
