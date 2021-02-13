package LAB;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        String[][] firstMatrix = readMatrix(scanner, rows, cols);
        String[][] secondMatrix = readMatrix(scanner, rows, cols);
        String[][] thirdMatrix = compareMatrices(firstMatrix, secondMatrix);
        printMatrix(thirdMatrix);
    }

    private static void printMatrix(String[][] thirdMatrix) {
        for (int row = 0; row < thirdMatrix.length; row++) {
            System.out.println(String.join(" ", thirdMatrix[row]));
        }
        return;
    }

    private static String[][] compareMatrices(String[][] firstMatrix, String[][] secondMatrix) {
        int rows = firstMatrix.length;
        int cols = firstMatrix[0].length;
        String[][] thirdMatrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col].equals(secondMatrix[row][col])) {
                    thirdMatrix[row][col] = firstMatrix[row][col];
                } else {
                    thirdMatrix[row][col] = "*";
                }
            }
        }
        return thirdMatrix;
    }

    private static String[][] readMatrix(Scanner scanner, int rows, int cols) {
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = line[col];
            }
        }
        return matrix;
    }
}
