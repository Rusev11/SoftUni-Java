package LAB;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> back = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();
        String currentUrl = "";
        String line = scanner.nextLine();
        while(!line.equals("Home")){
            if(line.equals("back")){
                if (back.isEmpty()){
                    System.out.println("no previous URLs");
                    line = scanner.nextLine();
                } else {
                    currentUrl = back.pop();
                    forward.push(currentUrl);
                    System.out.println(back.peek());
                    line = scanner.nextLine();
                    continue;
                }

            } else if (line.equals("forward")){
                if(forward.isEmpty()){
                    System.out.println("no next URLs");
                    line = scanner.nextLine();
                } else {
                    currentUrl = forward.pop();
                    back.push(currentUrl);
                    System.out.println(currentUrl);
                    line = scanner.nextLine();
                    continue;
                }
            } else {
                System.out.println(line);
                back.push(line);
                line = scanner.nextLine();
            }
        }
    }
}
