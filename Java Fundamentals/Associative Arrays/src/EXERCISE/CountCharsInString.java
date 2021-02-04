package EXERCISE;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char ch : chars) {
            if(ch != ' '){
                Integer number = counts.get(ch);
                if (number == null) {
                    counts.put(ch, 1);
                    continue;
                }
                counts.put(ch, number + 1);
            }
        }

       counts.forEach((k,v)-> System.out.println(k + " -> "+counts.get(k)));
    }
}
