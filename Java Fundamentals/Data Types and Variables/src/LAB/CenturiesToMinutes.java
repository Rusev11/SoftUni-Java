package LAB;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int century = Integer.parseInt(scanner.nextLine());
        int years = 100 * century;
        int days = (int) (century * 36524.2199);
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", century, years, days, hours, minutes);
    }
}
