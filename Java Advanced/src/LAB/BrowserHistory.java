package LAB;

import javax.sound.midi.Soundbank;
import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> url = new ArrayDeque<>();
        String input = scanner.nextLine();
        url.push(input);
        System.out.println(input);
        input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (url.size() == 1) {
                if (input.equals("back")) {
                    System.out.println("no previous URLs");
                } else {
                    url.push(input);
                    System.out.println(input);
                }
            } else {
                if (input.equals("back")) {
                    url.pop();
                    System.out.println(url.peek());
                } else {
                    url.push(input);
                    System.out.println(input);
                }
            }
            input = scanner.nextLine();
        }
    }
}
