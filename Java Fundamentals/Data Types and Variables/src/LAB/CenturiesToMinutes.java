package LAB;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int century = Integer.parseInt(scanner.nextLine());
        int years = 100 * century;
        double days = century * 36524.2199;
        double hours = days * 24;
        double minutes = hours * 60;
        System.out.println(minutes);
        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", century, years, days, hours, minutes);
    }
}
