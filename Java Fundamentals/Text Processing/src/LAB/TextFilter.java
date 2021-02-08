package LAB;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for(int i=0; i<bannedWords.length; i++){
            StringBuilder bannedWordStars = new StringBuilder();
            for(int j=0; j<bannedWords[i].length(); j++){
                bannedWordStars.append("*");
            }
            text = text.replace(bannedWords[i],bannedWordStars);
        }
        System.out.println(text);
    }
}
