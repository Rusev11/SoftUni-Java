package LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(n -> Integer.parseInt(n))
                .sorted((a, b) -> Integer.compare(b, a))
                .limit(3)
                .toArray(Integer[]::new);
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
    }
}
