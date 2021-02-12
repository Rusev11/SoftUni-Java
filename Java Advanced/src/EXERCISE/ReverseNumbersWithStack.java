package EXERCISE;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(number -> Integer.parseInt(number)).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(Integer number: numbers){
            stack.push(number);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+ " ");
        }
    }
}
