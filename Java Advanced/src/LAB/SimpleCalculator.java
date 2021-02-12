package LAB;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, input);
        while (stack.size()>1){
            int firstMember = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondMember = Integer.parseInt(stack.pop());
            if(operator.equals("+")){
                stack.push(String.valueOf(firstMember+secondMember));
            } else {
                stack.push(String.valueOf(firstMember-secondMember));
            }
        }
        System.out.println(stack.peek());
    }
}
