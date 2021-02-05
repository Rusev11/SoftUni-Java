package EXERCISE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> registrations = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] lineArray = scanner.nextLine().split(" ");
            String token = lineArray[0];
            String user = lineArray[1];
            if (token.equals("register")) {
                String currentPlateNumber = registrations.get(user);
                if (currentPlateNumber == null) {
                    String plateNumber = lineArray[2];
                    registrations.put(user, plateNumber);
                    System.out.printf("%s registered %s successfully\n", user, plateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s\n", currentPlateNumber);
                }
            }
            if (token.equals("unregister")) {
                String currentPlateNumber = registrations.get(user);
                if (currentPlateNumber == null) {

                    System.out.printf("ERROR: user %s not found\n", user);
                } else {
                    registrations.remove(user);
                    System.out.printf("%s unregistered successfully\n", user);
                }
            }
        }
//        registrations.forEach((k,v)-> System.out.println(k+" => "+v));
        for (Map.Entry<String, String> entry : registrations.entrySet()) {
            System.out.println(entry.getKey() + " => "+ entry.getValue());
        }
    }
}
