package LAB;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Set<String> parking = new LinkedHashSet<>();
        while (!line.equals("END")) {
            String[] lineArray = line.split(", ");
            String direction = lineArray[0];
            String carNumber = lineArray[1];
            if (direction.equals("IN")) {
                parking.add(carNumber);
            } else {
                parking.remove(carNumber);
            }
            line = scanner.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(String.join(System.lineSeparator(), parking));

        }
    }
}
