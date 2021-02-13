package LAB;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        int sum = 0;
        for (int row = 0; row < rows; row++) {
            sum += Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
