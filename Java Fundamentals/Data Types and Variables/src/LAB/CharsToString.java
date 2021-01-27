package LAB;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = a.concat(scanner.nextLine());
        String c = b.concat(scanner.nextLine());
        System.out.println(c);
    }
}
