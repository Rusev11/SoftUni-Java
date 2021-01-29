package LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        while (true) {
            String newLine = scanner.nextLine();
            String[] newLineArray = newLine.split(" ");
            String command = newLineArray[0];
            if (command.equals("end")) {
                break;
            }
            int number = Integer.parseInt(newLineArray[1]);
            switch (command) {
                case "Add":
                    numbers.add(number);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    numbers.remove(number);
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(newLineArray[2]), number);
                    break;
            }
        }
        for (int number : numbers) {
            System.out.printf("%d ", number);
        }
    }
}
