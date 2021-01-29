package LAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < input.length / 2; i++) {
            int firstMember = input[i];
            int secondMember = input[input.length - 1 - i];
            sums.add(firstMember + secondMember);
        }
        if (input.length % 2 != 0) {
            sums.add(input[input.length / 2]);
        }
        for (Integer number : sums) {
            System.out.printf("%d ", number);
        }
    }
}
