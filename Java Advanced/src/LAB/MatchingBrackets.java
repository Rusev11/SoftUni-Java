package LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int index = line.indexOf('(');
        for (int i=0; i<line.length();i++){
            if(line.charAt(i)=='('){
                stack.push(i);
                continue;
            }
            if(line.charAt(i)==')'){
                System.out.println(line.substring(stack.pop(), i+1));
            }
        }
    }
}
