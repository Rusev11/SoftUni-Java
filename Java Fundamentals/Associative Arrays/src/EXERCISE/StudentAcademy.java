package EXERCISE;

import java.text.DecimalFormat;
import java.util.*;

public class StudentAcademy {
    public static double getAverage(Map.Entry<String, List<Double>> entry) {
        OptionalDouble result = entry.getValue()
                .stream()
                .mapToDouble(number -> number)
                .average();
        return result.orElse(-1);
    }

    public static void main(String[] args) {
        DecimalFormat ds = new DecimalFormat("0.00#");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> grades = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            List<Double> currentGrades = grades.get(name);
            if (currentGrades == null) {
                currentGrades = new ArrayList<>();
                grades.put(name, currentGrades);
            }
            currentGrades.add(grade);
        }

        grades.entrySet()
                .stream()
                .filter(entry -> getAverage(entry) >= 4.5)
                .sorted((a, b) -> {
                    if (Double.compare(getAverage(b), getAverage(a)) != 0) {
                        return Double.compare(getAverage(b), getAverage(a));
                    } else {
                        return  a.getKey().compareTo(b.getKey());
                    }
                })
                .forEach(entry -> {
                    System.out.println(entry.getKey() + " -> " + ds.format(getAverage(entry)));
                });
    }
}
