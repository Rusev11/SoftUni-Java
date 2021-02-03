package LAB;

import java.sql.SQLOutput;
import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<String>> synonyms = new LinkedHashMap<>();
        for (int i = 0; i < n; i += 1) {
            String line = scanner.nextLine();
            String synonym = scanner.nextLine();
            List<String> word = synonyms.get(line);
            if (word == null) {
                synonyms.put(line, new ArrayList<>());
            }
            synonyms.get(line).add(synonym);
        }
        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s\n",entry.getKey(), String.join(", ",entry.getValue()));
        }
    }
}
