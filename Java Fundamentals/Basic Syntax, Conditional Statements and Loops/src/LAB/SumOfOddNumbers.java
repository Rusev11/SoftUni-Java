package LAB;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += 2 * i + 1;
            System.out.println(2 * i + 1);
        }
        System.out.printf("Sum: %d",sum);
    }
}
