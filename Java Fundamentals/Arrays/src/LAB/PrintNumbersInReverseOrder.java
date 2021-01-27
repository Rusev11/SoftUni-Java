package LAB;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[n-1-i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",numbers[i]);
        }
    }
}
