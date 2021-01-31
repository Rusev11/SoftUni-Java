package EXERCISE;

import java.util.Scanner;

public class Articles {
    public static class Article {
        String title;
        String content;
        String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void rename(String title) {
            this.title = title;
        }

        public void edit(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] lineArray = scanner.nextLine().split(",");
        Article article = new Article(lineArray[0], lineArray[1], lineArray[2]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] newLineArray = scanner.nextLine().split(" ");
            String[] newContentArray = new String[newLineArray.length - 1];
            for (int j = 1; j < newLineArray.length; j++) {
                newContentArray[j - 1] = newLineArray[j];
            }
            String newContent = String.join(" ", newContentArray);
            String token = newLineArray[0];
            switch (token) {
                case "Edit:":
                    article.edit(newContent);
                    break;
                case "ChangeAuthor:":
                    article.changeAuthor(newContent);
                    break;
                case "Rename:":
                    article.rename(newContent);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
