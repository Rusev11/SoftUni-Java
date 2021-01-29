package LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
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
            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(newLineArray[1]);
                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (newLineArray[1].equals("even")) {
                        for (Integer e : numbers) {
                            if (e % 2 == 0) {
                                System.out.printf("%d ", e);
                            }
                        }

                    } else {
                        for (Integer e : numbers) {
                            if (e % 2 != 0) {
                                System.out.printf("%d ", e);
                            }
                        }
                    }
                    System.out.printf("\n");
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer e : numbers) {
                        sum += e;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = newLineArray[1];
                    int conditionNumber = Integer.parseInt(newLineArray[2]);
                    switch (condition) {
                        case "<":
                            for (Integer e : numbers) {
                                if (e < conditionNumber) {
                                    System.out.printf("%d ", e);
                                }
                            }
                            break;
                        case "<=":
                            for (Integer e : numbers) {
                                if (e <= conditionNumber) {
                                    System.out.printf("%d ", e);
                                }
                            }
                            break;
                        case ">":
                            for (Integer e : numbers) {
                                if (e > conditionNumber) {
                                    System.out.printf("%d ", e);
                                }
                            }
                            break;
                        case ">=":
                            for (Integer e : numbers) {
                                if (e >= conditionNumber) {
                                    System.out.printf("%d ", e);
                                }
                            }
                            break;
                    }
                    System.out.printf("\n");
                    break;
            }
        }
    }
}
