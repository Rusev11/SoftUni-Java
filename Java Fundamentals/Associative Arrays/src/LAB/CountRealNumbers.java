package LAB;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Double, Integer> counts = new TreeMap<>();
        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        for (Double number: numbers){
            Integer num = counts.get(number);
            if ( num == null ){
                counts.put(number, 1);
                continue;
            }
            counts.put(number, num+1);
        }
        DecimalFormat ds = new DecimalFormat("0.#");
        for (Map.Entry<Double, Integer> entry: counts.entrySet()){
            System.out.println(ds.format(entry.getKey())+ " -> " + entry.getValue());
        }
    }
}
