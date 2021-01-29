package LAB;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        String output = "";
        DecimalFormat df = new DecimalFormat("0.#");
        double[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(e -> Double.parseDouble(e)).toArray();
        for (int i = 0; i < input.length; i++) {
            numbers.add(input[i]);
        }
        int i = 0;
        while (i < numbers.size() - 1) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, 2 * numbers.get(i));
                numbers.remove(i + 1);
                for (int j = i; j > 0; j--) {
                    if (numbers.get(j).equals(numbers.get(j - 1))) {
                        numbers.set(j - 1, 2 * numbers.get(j));
                        numbers.remove(j);
                    }
                }
            } else {
                i++;
            }
        }
        for (double number : numbers) {
            System.out.printf("%s ", df.format(number));
        }
    }
}
