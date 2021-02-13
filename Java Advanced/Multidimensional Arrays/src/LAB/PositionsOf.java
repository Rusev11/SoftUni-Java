package LAB;

import java.util.ArrayList;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        ArrayList<String[]> lines = new ArrayList<>();
        boolean found = false;

        for (int row = 0; row < rows; row++) {
            lines.add(scanner.nextLine().split(" "));
        }

        String number = scanner.nextLine();

        for (int row = 0; row < lines.size(); row++) {
            for (int col = 0; col < lines.get(row).length; col++) {
                if (lines.get(row)[col].equals(number)) {
                    System.out.println(row + " " + col);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }
}
