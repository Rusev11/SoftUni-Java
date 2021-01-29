package LAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] secondInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < firstInput.length || i < secondInput.length; i++) {
            if (i < firstInput.length) {
                numbers.add(firstInput[i]);
            }
            if (i < secondInput.length) {
                numbers.add(secondInput[i]);
            }
        }
        for(int number: numbers){
            System.out.printf("%d ", number);
        }
    }
}
