package LAB;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrayOfStrings = input.split(" ");
        int[] numbers = Arrays.stream(arrayOfStrings).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        for (int i = 0; i < numbers.length; i+=1){
            if(numbers[i]%2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
