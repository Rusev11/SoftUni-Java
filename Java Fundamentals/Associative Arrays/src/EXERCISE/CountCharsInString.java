package EXERCISE;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = scanner.nextLine().split("");
        HashMap<String, Integer> counts = new HashMap<>();
        for (String ch : word) {
            Integer number = counts.get(ch);
            if (number == null) {
                counts.put(ch, 1);
                continue;
            }
            counts.put(ch, number + 1);
        }

        Set<Map.Entry<String, Integer>> entries = counts.entrySet();
        List<Map.Entry<String, Integer>> collect = entries.stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue())).collect(Collectors.toList());
        for(Map.Entry<String, Integer> ch: collect){
            System.out.println(ch.getKey() + " -> " + ch.getValue());
        }

    }
}
