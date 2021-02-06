package EXERCISE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, List<String>> companies = new TreeMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] inputArray = input.split((" -> "));
            String company = inputArray[0];
            String employee = inputArray[1];
            if(!companies.containsKey(company)){
                companies.put(company, new ArrayList<>());
            }
            if(!companies.get(company).contains(employee)){
                companies.get(company).add(employee);
            }
            input = scanner.nextLine();
        }
        companies.entrySet().forEach(entry-> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employee-> System.out.println("-- "+employee));
        });
    }
}
