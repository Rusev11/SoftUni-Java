package EXERCISE;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new HashMap<>();
        Map<String, Integer> junkMaterials = new TreeMap<>();
        boolean flag = true;

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        while (flag) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int i = 0; i < inputLine.length; i += 2) {
                int quantity = Integer.parseInt(inputLine[i]);
                String material = inputLine[i + 1].toLowerCase();
                Integer currentQuantity = junkMaterials.get(material);

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        switch (material) {
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;
                        }
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        flag = false;
                        break;
                    }
                } else {
                    junkMaterials.putIfAbsent(material, 0);
                    junkMaterials.put(material, junkMaterials.get(material) + quantity);
                }
            }
        }

        keyMaterials.entrySet()
                .stream()
                .sorted((a, b) -> {
                    int result = b.getValue().compareTo(a.getValue());
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                })
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                });

        junkMaterials.entrySet()
                .stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                });

    }
}
