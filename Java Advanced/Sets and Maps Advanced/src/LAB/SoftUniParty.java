package LAB;

import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Set<String> vip = new LinkedHashSet<>();
        Set<String> regular = new LinkedHashSet<>();
        while (!line.equals("PARTY")) {
            if (Character.isDigit(line.charAt(0))) {
                vip.add(line);
            } else {
                regular.add(line);
            }
            line = scanner.nextLine();
        }
        line = scanner.nextLine();
        while (!line.equals("END")) {
            vip.remove(line);
            regular.remove(line);
            line = scanner.nextLine();
        }
        System.out.println(vip.size()+regular.size());
        System.out.println(String.join(System.lineSeparator(),vip));
        System.out.println(String.join(System.lineSeparator(),regular));
    }
}
