package LAB;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();
        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            Integer currentWordCounts = counts.get(wordInLowerCase);
            if (currentWordCounts == null) {
                counts.put(wordInLowerCase, 1);
                continue;
            }
            counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue()%2 != 0){
                result.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", result));
    }
}
