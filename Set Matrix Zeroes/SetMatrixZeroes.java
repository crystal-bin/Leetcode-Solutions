public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRowZeros = false, firstColZeros = false;
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                firstRowZeros = true;
                break;
            }
        }
        for (int j = 0; j < m; j++) {
            if (matrix[j][0] == 0) {
                firstColZeros = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (firstRowZeros == true) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
        if (firstColZeros == true) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}