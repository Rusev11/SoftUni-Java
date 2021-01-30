package LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    public static class FavSongs {
        String typeList;
        String name;
        String time;

        FavSongs(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<FavSongs> songs = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("_");
            songs.add(new FavSongs(line[0], line[1], line[2]));
        }
        String typeList = scanner.nextLine();
        if (typeList.equals("all")) {
            for (FavSongs song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (FavSongs song : songs) {
                if (song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}

