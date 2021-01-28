package LAB;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputAsArray = input.split(" ");
        int[] arrayOfNumbers = Arrays.stream(inputAsArray).mapToInt(e->Integer.parseInt(e)).toArray();
        int sumOdd = 0, sumEven = 0;
        int difference = 0;
        for (int number: arrayOfNumbers){
            if (number%2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        difference = sumEven - sumOdd;
        System.out.println(difference);
    }
}
