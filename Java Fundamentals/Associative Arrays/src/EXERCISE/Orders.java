package EXERCISE;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class Orders {
    public static class PriceAndQuantity {
        double price;
        double quantity;

        PriceAndQuantity(double price, double quantity) {
            this.price = price;
            this.quantity = quantity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public double getQuantity() {
            return quantity;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        LinkedHashMap<String, PriceAndQuantity> orders = new LinkedHashMap<>();
        DecimalFormat df = new DecimalFormat("0.00#");
        while (!line.equals("buy")) {
            String[] lineArray = line.split(" ");
            String product = lineArray[0];
            double price = Double.parseDouble(lineArray[1]);
            double quantity = Double.parseDouble(lineArray[2]);
            PriceAndQuantity currentProduct = orders.get(product);
            if (currentProduct == null) {
                orders.put(product, new PriceAndQuantity(price, quantity));
            } else {
                double oldQuantity = currentProduct.getQuantity();
                orders.put(product, new PriceAndQuantity(price, oldQuantity + quantity));
            }
            line = scanner.nextLine();
        }
        orders.forEach((k, v) -> System.out.printf("%s -> %s\n", k, df.format(v.getPrice() * v.getQuantity())));
    }
}
