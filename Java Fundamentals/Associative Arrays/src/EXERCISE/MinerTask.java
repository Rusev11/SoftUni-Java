package EXERCISE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> resourses = new LinkedHashMap<>();
        String resource = scanner.nextLine();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (resourses.containsKey(resource)) {
                resourses.put(resource, resourses.get(resource) + quantity);
            } else {
                resourses.put(resource, quantity);
            }
            resource = scanner.nextLine();
        }
        resourses.forEach((k,v)-> System.out.println(k + " -> "+ v));
    }
}
