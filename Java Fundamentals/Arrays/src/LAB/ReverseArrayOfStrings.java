package LAB;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String[] reversedInput = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            reversedInput[input.length - 1 - i] = input[i];
        }
        for (String e: reversedInput){
            System.out.print(e+" ");
        }
    }
}
