package LAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        StringBuilder concatenated = new StringBuilder();
        Arrays.stream(input).forEach(str -> {
            for(int i=0; i<str.length();i++){
                concatenated.append(str);
            }
        });
        System.out.println(concatenated);
    }
}
