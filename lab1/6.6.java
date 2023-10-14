import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = inputMatrix("Matrix 1", rows, cols, scanner);
        int[][] matrix2 = inputMatrix("Matrix 2", rows, cols, scanner);

        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        System.out.println("Result of Matrix Addition:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    public static int[][] inputMatrix(String name, int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements for " + name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
