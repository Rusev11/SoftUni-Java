package LAB;

import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);
        if (firstMatrix.length != secondMatrix.length){
            System.out.println("not equal");
            return;
        }
        for(int row = 0; row<firstMatrix.length; row++){
            if(firstMatrix[row].length!=secondMatrix[row].length){
                System.out.println("not equal");
                return;
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if(firstMatrix[row][col]!=secondMatrix[row][col]){
                    System.out.printf("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }

    private static int[][] readMatrix(Scanner scanner) {
        String[] line = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows ; row++) {
            String[] currentLine = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(currentLine[col]);
            }
        }
        return matrix;
    }
}
