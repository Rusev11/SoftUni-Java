package LAB;

import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int indexRow = 0;
        int indexCol = 0;
        int indexSum = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (currentSum > indexSum) {
                    indexSum = currentSum;
                    indexRow = row;
                    indexCol = col;
                }
            }
        }
        System.out.println(matrix[indexRow][indexCol] + " " + matrix[indexRow][indexCol + 1]);
        System.out.println(matrix[indexRow + 1][indexCol] + " " + matrix[indexRow + 1][indexCol + 1]);
        System.out.println(indexSum);
    }

    private static int[][] readMatrix(Scanner scanner) {
        String[] line = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] currentLine = scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(currentLine[col]);
            }
        }
        return matrix;
    }
}
