package Arrays;

import java.util.Scanner;

public class SetMatrixZeros {

    public static void setMatrixZeros(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 0) {
                    markRow(matrix, i);
                    markCol(matrix, j);
                }
            }
        }

        // Convert -1 into 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void markRow(int[][] matrix, int row) {

        for (int j = 0; j < matrix[0].length; j++) {

            if (matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }

    public static void markCol(int[][] matrix, int col) {

        for (int i = 0; i < matrix.length; i++) {

            if (matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
    }

    public static void main(String[] args) {

        Scanner userNum = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = userNum.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = userNum.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = userNum.nextInt();
            }
        }

        setMatrixZeros(matrix);

        System.out.println("Matrix after setting zeros:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        userNum.close();
    }
}