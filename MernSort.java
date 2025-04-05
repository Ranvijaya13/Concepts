
import java.util.*;

public class MernSort {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        int n = ran.nextInt();
        int l = n * 2;
        int sum = 0;
        int[][] matrix = new int[l][l];
        for (int k = 0; k < l; k++) {
            for (int p = 0; p < l; p++) {
                matrix[k][p] = ran.nextInt();
            }
        }
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1; j++) {
                if (j == 0) {
                    if (matrix[i][j] < matrix[i][l - 1]) {
                        for (int y = 0; y < l / 2; y++) {
                            int temp = matrix[j][y];
                            matrix[j][y] = matrix[j][l - 1 - y];
                            matrix[j][l - 1 - y] = temp;
                        }
                    }
                } else if (i == 0) {
                    if (matrix[i][j] < matrix[i][l - 1]) {
                        for (int y = 0; y < l / 2; y++) {
                            int temp = matrix[j][y];
                            matrix[j][y] = matrix[j][l - 1 - y];
                            matrix[j][l - 1 - y] = temp;
                        }
                    }
                }
            }
        }
        for (int e = 0; e < n; e++) {
            for (int r = 0; r < n; r++) {
                sum = sum + matrix[e][r];
            }
        }
        System.out.print(sum);
    }
}
