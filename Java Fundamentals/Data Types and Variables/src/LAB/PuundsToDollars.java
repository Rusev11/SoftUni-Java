package LAB;

import java.util.Scanner;

public class PuundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double paunds = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.3f", paunds*1.31);;
    }
}
