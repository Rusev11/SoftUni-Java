package LAB;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> names = new ArrayDeque<>();
        Collections.addAll(names, input);
        while (names.size() > 1) {
            for (int i = 0; i < number-1; i++) {
                String currentName = names.poll();
                names.offer(currentName);
            }
            System.out.println("Removed " + names.poll());
        }
        System.out.println("Last is " + names.poll());
    }
}
