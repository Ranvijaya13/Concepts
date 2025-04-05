
import java.util.Scanner;

public class MatrixFlipping {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        int n = ran.nextInt();
        int sum = 0;
        int l = 2 * n;
        int l2 = 0;
        int[][] matrix = new int[l][l];
        for (int k = 0; k < l; k++) {
            for (int p = 0; p < l; p++) {
                matrix[k][p] = ran.nextInt();
            }
        }
        if (l % 2 == 0) {
            l2 = l / 2;
        } else {
            l2 = l / 2 + 1;
        }
        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < l2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = Math.max(Math.max(matrix[i][j], matrix[i][n - j]), matrix[n - j][i]);

            }
        }
        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < l2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = Math.max(Math.max(matrix[i][j], matrix[i][n - j]), matrix[n - j][i]);
            }
        }
    }
}
