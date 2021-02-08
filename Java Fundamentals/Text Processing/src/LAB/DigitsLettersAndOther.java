package LAB;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt((i)) >= 'a' && input.charAt(i) <= 'z') ||
                    (input.charAt((i)) >= 'A' && input.charAt(i) <= 'Z')) {
                letters.append(input.charAt(i));
            } else if (input.charAt((i)) >= '0' && input.charAt(i) <= '9') {
                digits.append(input.charAt(i));
            } else {
                symbols.append(input.charAt(i));
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
