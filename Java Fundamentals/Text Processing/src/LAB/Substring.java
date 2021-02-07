package LAB;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String input = scanner.nextLine();
        String result = String.join("", input.split(word));

        while (input.length() != result.length()) {
            input = result;
            result = String.join("", input.split(word));
        }
        System.out.println(String.join("", result));
    }
}
