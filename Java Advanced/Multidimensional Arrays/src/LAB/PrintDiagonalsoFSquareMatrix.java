package LAB;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsoFSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[rows][rows];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }
        String[] firstDiagonal = new String[rows];
        String[] secondDiagonal = new String[rows];

        for (int i = 0; i < rows; i++) {
            firstDiagonal[i] = matrix[i][i];
            secondDiagonal[i] = matrix[matrix.length-1-i][i];
        }
        System.out.println(String.join(" ",firstDiagonal));
        System.out.println(String.join(" ",secondDiagonal));
    }
}
