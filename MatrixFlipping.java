
import java.util.Scanner;

public class MatrixFlipping {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        int n = ran.nextInt();
        int sum = 0;
        int l = 2 * n;
        int[][] matrix = new int[l][l];
        for (int k = 0; k < l; k++) {
            for (int p = 0; p < l; p++) {
                matrix[k][p] = ran.nextInt();
            }
        }
        for (int row = 0; row < l; row++) {
            for (int Colum = 0; Colum < l; Colum++) {
                if (Colum == 0) {
                    if (matrix[row][0] < matrix[row][l - 1]) {
                        for (int i = 0; i < l / 2; i++) {
                            int temp = matrix[row][i];
                            matrix[row][i] = matrix[row][l - i - 1];
                            matrix[row][l - i - 1] = temp;
                        }
                    }
                }
                if (row == 0) {
                    if (matrix[0][Colum] < matrix[l - 1][Colum]) {
                        for (int i = 0; i < l / 2; i++) {
                            int temp = matrix[i][Colum];
                            matrix[i][Colum] = matrix[l - i - 1][Colum];
                            matrix[l - i - 1][Colum] = temp;
                        }
                    }
                }
            }
        }
        for (int row = 0; row < l; row++) {
            for (int Colum = 0; Colum < l; Colum++) {
                if (Colum == 0) {
                    if (matrix[row][0] < matrix[row][l - 1]) {
                        for (int i = 0; i < l / 2; i++) {
                            int temp = matrix[row][i];
                            matrix[row][i] = matrix[row][l - i - 1];
                            matrix[row][l - i - 1] = temp;
                        }
                    }
                }
                if (row == 0) {
                    if (matrix[0][Colum] < matrix[l - 1][Colum]) {
                        for (int i = 0; i < l / 2; i++) {
                            int temp = matrix[i][Colum];
                            matrix[i][Colum] = matrix[l - i - 1][Colum];
                            matrix[l - i - 1][Colum] = temp;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("");
        System.out.println("The n*n submatrix maxima sum of Left quadral is =" + sum);
    }
}
