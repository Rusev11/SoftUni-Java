package LAB;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            char[] charArray = line.toCharArray();
            char[] reversedArray = new char[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                reversedArray[charArray.length - 1 - i] = charArray[i];
            }
            System.out.println(String.valueOf(charArray) + " = " + new String(reversedArray));
            line = scanner.nextLine();
        }
    }
}
